package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class find_decimal {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ��� Ȯ������
		StringTokenizer st = new StringTokenizer(br.readLine());

		int count = 0; // �Ҽ� ������ ���� ����

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num != 1) {	// �Ҽ� ã�� �Լ�
				for (int j = 2; j <= num; j++) {	// j�� num�� ������������ ã�� ���ϸ� �Ҽ��̹Ƿ� ī���� ����
					if (j == num) {
						count++;
					}
					else if(num % j == 0) {	// �Ҽ��� �ƴϸ� Ż��
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
