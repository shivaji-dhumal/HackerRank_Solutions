package time_Conversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s1) {

		String s[] = s1.split(":");
		// int hh=0;
		String hh = null;
		String mm = null, ss = null;
		hh = s[0];
		mm = s[1];
		ss = s[2].substring(0, 2);
		String newtime = "";
		if (hh == "12" || hh == "24") {
			if (s1.contains("AM")) {
				// hh = "00";
				newtime = "00:" + mm + ":" + ss;
			} else if (s1.contains("PM")) {
				// hh = "12";
				newtime = hh + ":" + mm + ":" + ss;
			}
		} else if ((Integer.parseInt(hh)) == 12 && s1.contains("AM")) {
			newtime = "00:" + mm + ":" + ss;
		} else if ((Integer.parseInt(hh)) == 12 && s1.contains("PM")) {
			newtime = hh + ":" + mm + ":" + ss;
		} else if ((Integer.parseInt(hh)) < 12 && s1.contains("AM")) {
			// int h=Integer.parseInt(hh)+12;
			newtime = hh + ":" + mm + ":" + ss;
		} else {
			int h = Integer.parseInt(hh) + 12;
			newtime = h + ":" + mm + ":" + ss;
		}
		return newtime;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
