package com.test.controlstatements;

public class Patternproblem {

	public static void main(String[] args) {
		int i, j, num = 1;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 1;
			}
			System.out.println();
		}

	}

}
