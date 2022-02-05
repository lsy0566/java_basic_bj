package function;

import java.util.Scanner;

// 셀프 넘버
public class self_number {

	static int d(int n) {
		int sum = 0;
//		boolean[] test = new boolean[10500];
		String ia = Integer.toString(n);

		if (n < 10) {
			sum = n + n;
		} else if (n < 100) {
			sum = n + ia.charAt(0) - '0' + ia.charAt(1) - '0';
		} else if (n < 1000) {
			sum = n + ia.charAt(0) - '0' + ia.charAt(1) - '0' + ia.charAt(2) - '0';
		} else if (n < 10000) {
			sum = n + ia.charAt(0) - '0' + ia.charAt(1) - '0' + ia.charAt(2) - '0' + ia.charAt(3) - '0';
		}

		return sum;
	}

	public static void main(String[] args) {
		boolean[] test = new boolean[10500];

		for (int i = 0; i < 10000; i++) {
			int n = d(i);

			if (n < 10000) {
				test[n] = true;
			}
		}

		for (int i = 0; i < 10000; i++) {
			if(!test[i]) {
				System.out.println(i);
			}
		}

//		for (int i = 0; i < 10000; i++) {
//			String ia = Integer.toString(i);
//			if (i < 10) {
//				sum = i + i;
//				test[sum] = true; // true가 곧 셀프넘버가 아니라는 소리 => sum이 생성자
//			} else if (i < 100) {
//				sum = i + ia.charAt(0) - '0' + ia.charAt(1) - '0';
//				test[sum] = true;
//			} else if (i < 1000) {
//				sum = i + ia.charAt(0) - '0' + ia.charAt(1) - '0' + ia.charAt(2) - '0';
//				test[sum] = true;
//			} else if (i < 10000 && sum < 10000) {
//				sum = i + ia.charAt(0) - '0' + ia.charAt(1) - '0' + ia.charAt(2) - '0' + ia.charAt(3) - '0';
//				test[sum] = true;
//			}
//		}
//
//		for (int i = 0; i < 10000; i++) {
//			if (!test[i]) {
//				System.out.println(i);
//			}
//		}
	}
}
