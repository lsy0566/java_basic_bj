package function;

import java.util.Scanner;

// 한수 구하기
public class Han_number {

	static int han(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			int a = i / 100; // 100의자리
			int b = (i - (a * 100)) / 10;// 10의자리
			int c = i % 10; // 1의자리
			if (i < 100) {
				count++;
			} else if (a - b == b - c) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(han(n));
	}
}
