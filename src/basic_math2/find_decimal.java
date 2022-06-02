package basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class find_decimal {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 몇개를 확인할지
		StringTokenizer st = new StringTokenizer(br.readLine());

		int count = 0; // 소수 개수를 위한 변수

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num != 1) {	// 소수 찾기 함수
				for (int j = 2; j <= num; j++) {	// j가 num과 같아질때까지 찾지 못하면 소수이므로 카운터 증가
					if (j == num) {
						count++;
					}
					else if(num % j == 0) {	// 소수가 아니면 탈출
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
