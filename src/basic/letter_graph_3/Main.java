package basic.letter_graph_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print((char) (Math.abs(i-j) + 'A'));
			}
			System.out.println();
		}
		in.close();
	}
}
