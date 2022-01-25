package array;

import java.util.Scanner;

// 숫자의 개수 출력
public class number_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int n = a * b * c;

//		String[] num = {"" + n};
		String num = "" + n; // 숫자를 담기위한 배열
		int[] nums = new int[num.length()]; // 문자열의 숫자를 int로 변환하기 위한 배열
		int[] k = new int[10]; // 개수를 위한 배열

		for (int i = 0; i < num.length(); i++) {
			nums[i] = num.charAt(i) - '0'; // 숫자를 구하기 위해 0의 아스키 코드값을 뺀다.
											// => 숫자가 문자형으로 되어 있기 때문에 아스키 코드값으로 되어 있음
			for (int j = 0; j < 10; j++) {
				if (nums[i] == j) {
					k[j]++;
				}
			}	// 숫자 0~9 개수 세기
		}

		for (int e : k) {
			System.out.println(e);
		}	// k배열 출력
	}
}