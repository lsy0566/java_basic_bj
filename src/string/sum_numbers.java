package string;

import java.util.Scanner;

// ������� �Է��� ���������� �� ���ϱ�
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