package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorization {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		for(int i = 2; i<=N;) {
			if(N % i == 0) {
				System.out.println(i);
				N /= i;
			} else {
				i++;
			}
		}
	}
}