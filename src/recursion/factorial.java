package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {

	static int fac(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fac(n - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		System.out.println(fac(N));
	}
}