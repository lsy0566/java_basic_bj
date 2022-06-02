package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class find_decimal_eratosthenes {

	static boolean[] prime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		prime = new boolean[N + 1]; // �⺻������ false�� �������.
		boolean[] prime = new boolean[N+1];

		prime[0] = prime[1] = true; // �⺻������ �Ҽ��� �ƴѰ� �̸� ����

		for (int i = 2; i <= Math.sqrt(N); i++) {	// i�� ���ܽ�Ű�� ����.
			for (int j = i*i; j <= N; j += i) { // i�� ������ ����� �� ����
				prime[j] = true;
			}
		}
		
		for(int i = M; i<=N; i++) {	// M�� N ������ �Ҽ� ���
			if(!prime[i]) {
				System.out.println(i);
			}
		}
	}
}