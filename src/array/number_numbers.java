package array;

import java.util.Scanner;

// ������ ���� ���
public class number_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int n = a * b * c;

//		String[] num = {"" + n};
		String num = "" + n; // ���ڸ� ������� �迭
		int[] nums = new int[num.length()]; // ���ڿ��� ���ڸ� int�� ��ȯ�ϱ� ���� �迭
		int[] k = new int[10]; // ������ ���� �迭

		for (int i = 0; i < num.length(); i++) {
			nums[i] = num.charAt(i) - '0'; // ���ڸ� ���ϱ� ���� 0�� �ƽ�Ű �ڵ尪�� ����.
											// => ���ڰ� ���������� �Ǿ� �ֱ� ������ �ƽ�Ű �ڵ尪���� �Ǿ� ����
			for (int j = 0; j < 10; j++) {
				if (nums[i] == j) {
					k[j]++;
				}
			}	// ���� 0~9 ���� ����
		}

		for (int e : k) {
			System.out.println(e);
		}	// k�迭 ���
	}
}