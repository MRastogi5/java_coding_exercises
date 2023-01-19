package com.techreturners.exercise005;

import java.util.ArrayList;

public class Exercise005 {

	public boolean isPangram(String input) {

		int ascIIStart = 97;
		int ascIIEnd = 122;
		
		if(input.isEmpty()) {
			return false;
		}
		
		String lowerCase = input.toLowerCase();
		ArrayList<Integer> intList = new ArrayList<Integer>();

		lowerCase.chars().distinct().forEach((i) -> {
			if (i >= ascIIStart && i <= ascIIEnd) {
				intList.add(i);
			}
		});

		if (intList.size() == 26) {
			return true;
		}

		return false;
	}
}
