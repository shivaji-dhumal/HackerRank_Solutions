package almost_Sorted;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	// Complete the almostSorted function below.
	static void almostSorted(int[] a) {
		int n = a.length;
		int count = 0;
		int u = 0, v = 0;

		for (int i = 0; i < n; i++) {
			if (i > 0 && a[i - 1] > a[i]) {
				++count;
				if (u == 0) {
					u = i;
				}
				v = i;
			}
		}

		if (count == 1) {
			if (n > 2 && a[u - 1] < a[v + 1] && a[v] > a[u - 2 >= 0 ? u - 2 : 0]) {
				System.out.println("yes\nswap " + u + " " + (v + 1));
			} else if (n == 2) {
				System.out.println("yes\nswap " + u + " " + (v + 1));
			} else {
				System.out.println("no");
			}
		} else if (count == 2) {
			System.out.println("yes\nswap " + u + " " + (v + 1));
		} else if (count > 1) {
			if (a[u - 2] < a[v] && a[u - 1] < a[v + 1] && v - u == count - 1) {
				System.out.println("yes\nreverse " + u + " " + (v + 1));
			} else {
				System.out.println("no");
			}
		} else if (count == 0) {
			System.out.println("yes");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		almostSorted(arr);

		scanner.close();
	}
}
