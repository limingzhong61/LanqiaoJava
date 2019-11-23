package begin.sequence_sum_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println((long) n * (n + 1) / 2);
		scanner.close();
	}
}
