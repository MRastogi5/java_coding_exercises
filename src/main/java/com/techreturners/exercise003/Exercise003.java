package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

	Map<String, Integer> flavours = new HashMap();

	public Exercise003() {
		/*
		 * Pistachio: 0, Raspberry Ripple: 1, Vanilla: 2, Mint Chocolate Chip: 3, Chocolate: 4, Mango Sorbet: 5
		 */
		flavours.put("Pistachio", 0);
		flavours.put("Raspberry Ripple", 1);
		flavours.put("Vanilla", 2);
		flavours.put("Mint Chocolate Chip", 3);
		flavours.put("Chocolate", 4);
		flavours.put("Mango Sorbet", 5);

	}

	int getIceCreamCode(String iceCreamFlavour) {

		if (flavours.containsKey(iceCreamFlavour)) {
			return flavours.get(iceCreamFlavour);
		}
		return -1;
	}

	String[] iceCreamFlavours() {
		return (String[]) flavours.keySet().toArray();
	}

}
