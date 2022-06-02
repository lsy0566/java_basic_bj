package basic_math;

import java.util.Scanner;

public class break_even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int n = 0; // 손익분기점

		if (c <= b) {
			System.out.println(-1);
		} else {
			n = (a / (c - b)) + 1;
			System.out.println(n);
		}
	}
}