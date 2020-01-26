package staircase;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	// Complete the staircase function below.
	static void staircase(int n) {
		int i, j, k;

		for (i = 0; i < n; i++) {
			for (j = 1; j < n - i; j++) {

				System.out.print(" ");

			}
			for (k = 0; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
