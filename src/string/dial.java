package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���̾�
// ��ȭ�� �ɱ� ���� �ּҽð� ���ϱ�
public class dial {

	static int test(int a) {	//�ܾ�� �� ���ĺ��� �ð��� ���ϱ� ���� �Լ�

		if (a < 'D') {
			a = 3;
		} else if (a < 'G') {
			a = 4;
		} else if (a < 'J') {
			a = 5;
		} else if (a < 'M') {
			a = 6;
		} else if (a < 'P') {
			a = 7;
		} else if (a < 'T') { // PQRS�� ���ڰ� 4����
			a = 8;
		} else if (a < 'W') {
			a = 9;
		} else if (a <= 'Z') { // WXYZ�� ���ڰ� 4����
			a = 10;
		}

		return a;	// ���ĺ��� �ð� ��ȯ
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String b = br.readLine();	// �ܾ� �Է� �ޱ�

		int m_time = 0;

		for (int i = 0; i < b.length(); i++) {	// �ܾ�� �� ���ĺ��� �ð����� �ٲ㼭 ���ϱ� ���� �Լ�
			m_time += test(b.charAt(i));
		}

		System.out.println(m_time);	// �ּҽð� ���
	}
}
