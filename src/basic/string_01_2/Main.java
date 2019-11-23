package basic.string_01_2;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 32; i++) {
			System.out.println(String.format("%05d", Integer.parseInt(Integer.toBinaryString(i))));
		}
	}

}
