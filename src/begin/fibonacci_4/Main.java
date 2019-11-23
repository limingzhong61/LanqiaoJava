package begin.fibonacci_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n > 1) {
			int[] a = new int[n + 1];
			a[1] = a[2] = 1;
			for (int i = 3; i <= n; i++) {
				a[i] = (a[i - 1] + a[i - 2]) % 10007;
			}
			System.out.println(a[n]);
		}else {
			System.out.println(1);
		}
		in.close();
	}
}
