package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

	ArrayList<String> flavoursList = new ArrayList<>();

	public Exercise003() {
		/*
		 * Pistachio: 0, Raspberry Ripple: 1, Vanilla: 2, Mint Chocolate Chip: 3,
		 * Chocolate: 4, Mango Sorbet: 5
		 */
		flavoursList.add("Pistachio");
		flavoursList.add("Raspberry Ripple");
		flavoursList.add("Vanilla");
		flavoursList.add("Mint Chocolate Chip");
		flavoursList.add("Chocolate");
		flavoursList.add("Mango Sorbet");
	}

	int getIceCreamCode(String iceCreamFlavour) {

		if (flavoursList.contains(iceCreamFlavour)) {
			return flavoursList.indexOf(iceCreamFlavour);
		}
		return -1;
	}

	String[] iceCreamFlavours() {
		String[] flavoursArr = {};
		return flavoursList.toArray(flavoursArr);
	}

}
