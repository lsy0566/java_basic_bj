package array;

import java.util.Scanner;

// ���� ������ ��� ���ϱ�
// ����� ���ϱ� ������ double�� ����ߴ�.
public class avg_new {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // ���� �� ������ ����
		double max = 0;
		double a[] = new double[n];
		double avg = 0;

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			if (a[i] > max) {
				max = a[i];
			}
		} // �� ������ ������ a[i]�� �迭�� �Է¹ް� ������ �ְ����� ���ϴ� �޼ҵ�

		for (int i = 0; i < n; i++) {
			a[i] = a[i] / max * 100;
			avg += a[i] / n;
		} // ���� ������ ����� ���ϴ� �޼ҵ�

		System.out.println(avg);
	}
}