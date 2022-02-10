package string;

import java.util.Scanner;

// 공백없이 입력한 각정수들의 합 구하기
public class sum_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String test = s.next();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += test.charAt(i) - '0';
		}
		
		System.out.println(sum);

	}

}