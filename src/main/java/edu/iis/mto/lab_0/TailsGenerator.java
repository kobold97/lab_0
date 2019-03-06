package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		if (value == null) {
			return new ArrayList<>(0);
		}

		ArrayList<String> tails = new ArrayList<String>();

		for (int i = 0; i < value.length(); i++) {
			tails.add(value.substring(i));
		}

		tails.add("");
		return tails;
	}
}
