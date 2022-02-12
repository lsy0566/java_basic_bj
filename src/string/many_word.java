package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� ���� ���� ���ĺ� �빮�ڷ� ���
public class many_word {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine(); // �ܾ� �Է�
		int max = 0; // ���� ���� ����� ���ĺ��� ���� ���� ���°� �ִ��� Ȯ���ϱ� ���� ����
		int many_word = 0; // ���� ���� ����� ���ĺ� Ȯ��

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

			if (a[i] > max) { // ���� ����� ���ĺ� Ȯ��
				many_word = i;
				max = a[i];
			} else if (a[i] == max) { // ���� ����� ���ĺ��� ��ġ���� Ȯ��
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