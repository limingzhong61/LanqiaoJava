package basic.leap_year_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		in.close();
	}
}
