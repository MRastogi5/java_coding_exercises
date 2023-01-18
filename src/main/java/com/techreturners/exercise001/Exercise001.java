package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
	public String capitalizeWord(String word) {
		word = word.substring(0, 1).toUpperCase() + word.substring(1);
		return word;
	}

	public String generateInitials(String firstName, String lastName) {
		String initial = firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
		return initial;
	}

	public double addVat(double originalPrice, double vatRate) {
		double vatPrice = (originalPrice + (originalPrice * vatRate / 100));
		vatPrice = BigDecimal.valueOf(vatPrice).setScale(2, RoundingMode.DOWN).doubleValue();

		return vatPrice;
	}

	public String reverse(String sentence) {
		StringBuilder str = new StringBuilder(sentence);
		return str.reverse().toString();
	}

	public int countLinuxUsers(List<User> users) {
		int count = 0;

		for (User user : users) {
			if (user.getType().equals("Linux")) {
				count++;
			}
		}
		return count;
	}
}
