package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���
// ���ڸ����� �� ���� �Է¹ް� ���� �Ųٷ� ����Ͽ� ���ϴ� ����
public class sangsu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int max = 0;

		int a = Integer.parseInt(st.nextToken()); // ù��°�� �Է¹��� ���ڸ� ��
		int b = Integer.parseInt(st.nextToken()); // �ι�°�� �Է¹��� ���ڸ� ��

		int A = (a % 10) * 100 + (a % 100 - (a % 10)) + a / 100;	// ù��° �� �Ųٷ� �ٲٱ�
		int B = (b % 10) * 100 + (b % 100 - (b % 10)) + b / 100;	// �ι�° �� �Ųٷ� �ٲٱ�

		if (A > B) {
			max = A;
			System.out.println(A);
		} else {
			max = B;
			System.out.println(B);
		}
	}
}
