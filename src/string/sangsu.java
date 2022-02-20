package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상수
// 세자리수인 두 수를 입력받고 각각 거꾸로 출력하여 비교하는 문제
public class sangsu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int max = 0;

		int a = Integer.parseInt(st.nextToken()); // 첫번째로 입력받을 세자리 수
		int b = Integer.parseInt(st.nextToken()); // 두번째로 입력받을 세자리 수

		int A = (a % 10) * 100 + (a % 100 - (a % 10)) + a / 100;	// 첫번째 수 거꾸로 바꾸기
		int B = (b % 10) * 100 + (b % 100 - (b % 10)) + b / 100;	// 두번째 수 거꾸로 바꾸기

		if (A > B) {
			max = A;
			System.out.println(A);
		} else {
			max = B;
			System.out.println(B);
		}
	}
}
