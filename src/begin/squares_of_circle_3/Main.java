package begin.squares_of_circle_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		System.out.printf("%.7f\n",r*r*Math.PI);
		in.close();
	}
}
