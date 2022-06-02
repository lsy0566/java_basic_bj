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

		prime = new boolean[N + 1]; // 기본적으로 false가 들어있음.
		boolean[] prime = new boolean[N+1];

		prime[0] = prime[1] = true; // 기본적으로 소수가 아닌걸 미리 제거

		for (int i = 2; i <= Math.sqrt(N); i++) {	// i를 제외시키기 위함.
			for (int j = i*i; j <= N; j += i) { // i를 제외한 배수를 다 제거
				prime[j] = true;
			}
		}
		
		for(int i = M; i<=N; i++) {	// M과 N 사이의 소수 출력
			if(!prime[i]) {
				System.out.println(i);
			}
		}
	}
}