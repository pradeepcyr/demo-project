package com.cyr.Features;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String LowercaseString = str[5].toLowerCase();
			System.out.println(LowercaseString);
		} else
			System.out.println("String value is not present");
	}
}
