package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goldbach_conjecture {

	static boolean prime[];

	static void get_prime() { // �����佺�׳׽��� ü�� �̿��� �Ҽ� ���ϱ�
		prime = new boolean[10001];

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(10000); i++) {
			for (int j = i * i; j <= 10000; j += i) {
				prime[j] = true;
			}
		}
	}
	
	static void goldbach(int n) {
		int cal = 0; // n���� �Ҽ��� �� ��
		int first = 0;
		int second = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (!prime[i]) {
				cal = n - i;
				if (!prime[cal]) {
					first = cal;
					second = i;
				}
			}
		}

		if (cal != 0) { // ���� �Ҽ��� ������ ���� ���
			System.out.println(second + " " + first);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� ��

		get_prime();

		for(int i = 0; i<T; i++) {
			int n = Integer.parseInt(br.readLine()); // ������ ��Ƽ���� ���ϱ� ���� ¦�� n �Է�
			
			if (n % 2 == 0) {
				goldbach(n);
			}
		}
	}
}
