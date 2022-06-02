package string;

import java.util.Scanner;

public class group_word_checker {
	static Scanner s = new Scanner(System.in);

	static boolean gwc() { // 그룹단어 체크 함수
		boolean[] check = new boolean[26]; // 그룹단어인지 체크할 배열

		String word = s.next(); // 그룹단어를 체크할 단어 입력 ex) aaabbcca
		int prev = 0; // 이전 단어의 알파벳

		for (int i = 0; i < word.length(); i++) { // 단어의 길이만큼 실행
			int now = word.charAt(i);

			if (prev != now) { // 단어의 이전 알파벳과 현재 알파벳이 동일한 지 체크
				if (check[now - 'a'] == false) { // 처음 나온 알파벳인 경우
					check[now - 'a'] = true;
					prev = now; // 다음에 현재 알파벳이 이전 알파벳이 되는 것을 알려준다.
				} else { // 이전에 나왔던 알파벳과 동일하므로 그룹단어가 아닌 false 반환
					return false;
				}
			} else { // 이전과 현재가 동일하면 다음 반복문 실행
				continue;
			}
		}
		return true; // 그룹단어이므로 true 반환
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		boolean[] group = new boolean[n]; // 그룹단어함수의 실행 결과를 담을 배열

		int count = 0; // 그룹단어 갯수 체크

		for (int i = 0; i < n; i++) { // 그룹단어 함수를 실행한 결과를 담는 반복문
			group[i] = gwc();
		}

		for (int i = 0; i < n; i++) { // 그룹단어인 것만 count를 센다.
			if (group[i] == true) {
				count++;
			}
		}
		System.out.println(count); // 그룹단어 count 수 출력.
	}
}
