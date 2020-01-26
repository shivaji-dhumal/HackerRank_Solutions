package migratory_Birds;

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

public class Solution {
	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> birds) {

		// find count of each type of bird
		int[] count = new int[birds.size()];
		for (int num : birds) {
			count[num]++;
		}

		// find the max count of bird
		int maxIndex = 1;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > count[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
