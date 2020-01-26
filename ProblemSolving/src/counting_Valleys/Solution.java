package counting_Valleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int sum = 0;
		int count = 0;

		// Creating array of string
		char[] ch = new char[s.length()];

		// Copy character by character into array
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		// number of valleys
		for (int i = 0; i < n; i++) {
			if (ch[i] == 'U') {
				if (++sum == 0)
					count++;
			} else
				sum--;
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
