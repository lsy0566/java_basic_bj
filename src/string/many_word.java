package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가장 많이 사용된 알파벳 대문자로 출력
public class many_word {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine(); // 단어 입력
		int max = 0; // 가장 많이 사용한 알파벳이 같은 값을 같는게 있는지 확인하기 위한 변수
		int many_word = 0; // 가장 많이 사용한 알파벳 확인

		int a[] = new int[26];

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			if (ch >= 'a') { //
				a[ch - 'a'] += 1;
			} else if (ch <= 'Z') {
				a[ch - 'A'] += 1;
			}
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) { // 많이 사용한 알파벳 확인
				many_word = i;
				max = a[i];
			} else if (a[i] == max) { // 많이 사용한 알파벳이 겹치는지 확인
				many_word = '?';
			}

		}

		if (many_word == '?') {
			System.out.println(Character.toString(many_word));
		} else {
			many_word += 'A';
			System.out.println(Character.toString(many_word));
		}
	}
}