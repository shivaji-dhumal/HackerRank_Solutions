package beautiful_Days_at_the_Movies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int count = 0;
		int r = 0;

		for (int m = i; m <= j; m++) {
			// reverse number
			StringBuilder temp = new StringBuilder();
			temp.append(m);
			temp = temp.reverse();
			String temp1 = temp.toString();
			int aRev = Integer.parseInt(temp1);
			// evenly divisible by k
			if (Math.abs(m - aRev) % k == 0) {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] ijk = scanner.nextLine().split(" ");

		int i = Integer.parseInt(ijk[0]);

		int j = Integer.parseInt(ijk[1]);

		int k = Integer.parseInt(ijk[2]);

		int result = beautifulDays(i, j, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
