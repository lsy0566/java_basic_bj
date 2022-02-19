package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단어의 개수 세기
public class word_count {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine(); // 문장 입력

		String s2 = s.trim(); // 문자열 맨 앞뒤 공백 제거

//		String s2 = s.strip();
//		문자열 앞뒤 공백 제거 또다른 방법
//		좀 더 폭넓은 공백을 제거 할 수 있음

		String n[] = s2.split(" "); // 공백 기준으로 단어 분리

		if (n[0].isEmpty()) {	// 문장을 입력하지 않거나 공백만 입력하면 null값이 담기기 때문에 길이가 1이 되므로 이것을 처리하기 위한 함수
			System.out.println(0);
		} else {
			System.out.println(n.length); // 단어의 개수
		}
//		또 다른 방법

//		StringTokenizer sa = new StringTokenizer(br.readLine());

//		System.out.println(sa.countTokens());
//		토큰의 개수 세기

	}
}