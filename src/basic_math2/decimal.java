package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decimal {

	public static boolean isSosu(int M) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(M); i++) {
			if (M % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int sosu_min = N; // 소수 최솟값
		int sosu_sum = 0; // 소수 합

		for (; M <= N; M++) {
			isSosu(M);
			if (isSosu(M) == true && M != 1) {
				if (M < sosu_min) {
					sosu_min = M;
				}
				sosu_sum += M;
			}
		}

		if (sosu_sum <= 1) {
			System.out.println(-1);
		} else {
			System.out.println(sosu_sum);
			System.out.println(sosu_min);
		}
	}
}