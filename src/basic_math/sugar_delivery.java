package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sugar_delivery {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // ¼³ÅÁ ÃÑkg
		int min_bag = N; // ÃÖ¼Ò ºÀÁö¼ö
		int fiv = 0; // 5kg ºÀÁö
		int thr = 0; // 3kg ºÀÁö

		int sum_bag = 0;

		for (fiv = 0; fiv < N; fiv++) {
			for (thr = 0; thr < N; thr++) {
				if (fiv * 5 + thr * 3 == N) {
					sum_bag = fiv+thr;
					if (sum_bag < min_bag) {
						min_bag = sum_bag;
					}
				}
			}
		}

		if(N != min_bag) {
		System.out.println(min_bag);
		} else {
			System.out.println(-1);
		}
		System.out.println("         ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println(" \\. \". L_r'");
		System.out.println("   `~\\/");
		System.out.println("      |");
		System.out.println("      |");
	}
}
