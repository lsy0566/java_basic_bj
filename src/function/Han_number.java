package function;

import java.util.Scanner;

// �Ѽ� ���ϱ�
public class Han_number {

	static int han(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			int a = i / 100; // 100���ڸ�
			int b = (i - (a * 100)) / 10;// 10���ڸ�
			int c = i % 10; // 1���ڸ�
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
