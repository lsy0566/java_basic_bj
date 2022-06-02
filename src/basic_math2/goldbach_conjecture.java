package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goldbach_conjecture {

	static boolean prime[];

	static void get_prime() { // 에라토스테네스의 체를 이용한 소수 구하기
		prime = new boolean[10001];

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(10000); i++) {
			for (int j = i * i; j <= 10000; j += i) {
				prime[j] = true;
			}
		}
	}
	
	static void goldbach(int n) {
		int cal = 0; // n값에 소수를 뺀 값
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

		if (cal != 0) { // 서로 소수가 존재할 때만 출력
			System.out.println(second + " " + first);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		get_prime();

		for(int i = 0; i<T; i++) {
			int n = Integer.parseInt(br.readLine()); // 골드바흐 파티션을 구하기 위한 짝수 n 입력
			
			if (n % 2 == 0) {
				goldbach(n);
			}
		}
	}
}
