package array;

import java.util.Scanner;

// ��� �Ѵ� �л����� ���� �ݿø� �� �Ҽ��� ��° �ڸ����� ���
public class avg_out {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt(); // �׽�Ʈ ���̽� ����
		double[] over_avg = new double[c]; // ����� �Ѵ� �л����� ������ �ݿø� �Ѱ��� ����.

		for (int i = 0; i < c; i++) {
			int n = s.nextInt(); // n�� �л��� ��
			int sum = 0;
			int avg = 0;
			int over_stu = 0; // ����� �Ѵ� �л��� ��
			double avg_test = 0;
			int[] sco_arr = new int[n];

			for (int j = 0; j < n; j++) {
				sco_arr[j] = s.nextInt();
				sum += sco_arr[j]; // ��� ���ϱ� ���� �л����� ���� ��
			}
			avg = sum / n; // ��ü �л��� ���
			for (int k = 0; k < n; k++) {	// ����� �Ѵ� �л��� ���� ���ϴ� �Լ�
				if (sco_arr[k] > avg) {
					over_stu++;
				}
			}
			avg_test = (double) over_stu/n*100;	// ����� �Ѵ� �л����� ���
			
//			avg_test = Math.round(avg_test*1000)/1000.0;	// �Ҽ��� ��°�ڸ����� ���ϴ� �Լ� => �Ҽ��� �ڸ��� ��� 0�̸� ���� ��ų ���� ����

			over_avg[i] = avg_test;
		}
		for(double e : over_avg) {
			System.out.println(String.format("%.3f", e) + "%");	// String.format�� Ȱ���� �Ҽ��� �ڸ� ���
		}
	}
}
