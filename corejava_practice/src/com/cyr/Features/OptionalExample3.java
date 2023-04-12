package com.cyr.Features;

import java.util.Optional;

public class OptionalExample3 {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "OPTIONAL CLASS EXAMPLE";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
		System.out.println(str[5].toLowerCase());
	}
}
