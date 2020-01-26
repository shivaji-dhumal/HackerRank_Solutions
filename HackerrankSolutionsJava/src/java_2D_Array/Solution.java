package java_2D_Array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		scanner.close();

		System.out.println(maxHour(arr));
	}

	public static int maxHour(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				int sum = findSumof(arr, row, col);
				max = Math.max(max, sum);
			}
		}
		return max;
	}

	private static int findSumof(int[][] arr, int r, int c) {
		int sum = arr[r + 0][c + 0] + arr[r + 0][c + 1] + arr[r + 0][c + 2] + arr[r + 1][c + 1] + arr[r + 2][c + 0]
				+ arr[r + 2][c + 1] + arr[r + 2][c + 2];
		return sum;
	}
}
