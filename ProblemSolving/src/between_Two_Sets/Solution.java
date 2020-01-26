package between_Two_Sets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here

		int result = 0;

		int gcd = getValue(b, gcd());
		int lcm = getValue(a, lcm());
		for (int i = lcm; i <= gcd; i += lcm) {
			if (gcd % i == 0) {
				result++;
			}
		}

		return result;
	}

	private static int getValue(List<Integer> numbers, BiFunction<Integer, Integer, Integer> function) {
		int result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = function.apply(result, numbers.get(i));
		}
		return result;
	}

	private static BiFunction<Integer, Integer, Integer> lcm() {
		return (a, b) -> a * (b / gcd().apply(a, b));
	}

	private static BiFunction<Integer, Integer, Integer> gcd() {
		return (a, b) -> {
			while (b > 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		};
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = Result.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
