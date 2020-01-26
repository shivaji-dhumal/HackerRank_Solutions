package java_Stdin_and_Stdout_II;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        int i    = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();              // gets rid of the pesky newline
	        String s = scan.nextLine();
	        scan.close();

	        /* Print output */
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	}

}
