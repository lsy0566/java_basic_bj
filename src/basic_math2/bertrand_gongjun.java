package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bertrand_gongjun {

	static boolean prime[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;

			if (n != 0) {
				prime = new boolean[n * 2 + 1];
				prime[0] = prime[1] = true;

				for (int i = 2; i <= Math.sqrt(n * 2); i++) {
					for (int j = i * i; j <= n * 2; j += i) {
						prime[j] = true;
					}
				}

				for (int i = n + 1; i <= n * 2; i++) {
					if (!prime[i]) {
						count++;
					}
				}
				System.out.println(count);
			} else {
				break;
			}
		}
	}
}
