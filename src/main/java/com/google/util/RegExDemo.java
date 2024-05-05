package com.google.util;

public class RegExDemo {

	public static void main(String[] args) {

		String alpha = "[a-zA-Z]+";// min:1 max:n
		String digit = "[0-9]+";
		String alpha10 = "[a-zA-Z]{1,10}";// min:1 max:n
		String userName = "[a-zA-Z0-9]+";
		String userNameA = "[a-zA-Z0-9_@]+";

		// XXXX@XXXX.XXX
		String email = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z0-9]{2,3}";
		String name = "ramZDF";

		System.out.println(name.matches(alpha));// a-zA-Z

	}
}
