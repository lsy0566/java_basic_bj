package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다이얼
// 전화를 걸기 위한 최소시간 구하기
public class dial {

	static int test(int a) {	//단어에서 각 알파벳의 시간을 구하기 위한 함수

		if (a < 'D') {
			a = 3;
		} else if (a < 'G') {
			a = 4;
		} else if (a < 'J') {
			a = 5;
		} else if (a < 'M') {
			a = 6;
		} else if (a < 'P') {
			a = 7;
		} else if (a < 'T') { // PQRS로 문자가 4개임
			a = 8;
		} else if (a < 'W') {
			a = 9;
		} else if (a <= 'Z') { // WXYZ로 문자가 4개임
			a = 10;
		}

		return a;	// 알파벳의 시간 반환
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String b = br.readLine();	// 단어 입력 받기

		int m_time = 0;

		for (int i = 0; i < b.length(); i++) {	// 단어에서 각 알파벳을 시간으로 바꿔서 더하기 위한 함수
			m_time += test(b.charAt(i));
		}

		System.out.println(m_time);	// 최소시간 출력
	}
}
