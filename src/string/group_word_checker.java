package string;

import java.util.Scanner;

public class group_word_checker {
	static Scanner s = new Scanner(System.in);

	static boolean gwc() { // �׷�ܾ� üũ �Լ�
		boolean[] check = new boolean[26]; // �׷�ܾ����� üũ�� �迭

		String word = s.next(); // �׷�ܾ üũ�� �ܾ� �Է� ex) aaabbcca
		int prev = 0; // ���� �ܾ��� ���ĺ�

		for (int i = 0; i < word.length(); i++) { // �ܾ��� ���̸�ŭ ����
			int now = word.charAt(i);

			if (prev != now) { // �ܾ��� ���� ���ĺ��� ���� ���ĺ��� ������ �� üũ
				if (check[now - 'a'] == false) { // ó�� ���� ���ĺ��� ���
					check[now - 'a'] = true;
					prev = now; // ������ ���� ���ĺ��� ���� ���ĺ��� �Ǵ� ���� �˷��ش�.
				} else { // ������ ���Դ� ���ĺ��� �����ϹǷ� �׷�ܾ �ƴ� false ��ȯ
					return false;
				}
			} else { // ������ ���簡 �����ϸ� ���� �ݺ��� ����
				continue;
			}
		}
		return true; // �׷�ܾ��̹Ƿ� true ��ȯ
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		boolean[] group = new boolean[n]; // �׷�ܾ��Լ��� ���� ����� ���� �迭

		int count = 0; // �׷�ܾ� ���� üũ

		for (int i = 0; i < n; i++) { // �׷�ܾ� �Լ��� ������ ����� ��� �ݺ���
			group[i] = gwc();
		}

		for (int i = 0; i < n; i++) { // �׷�ܾ��� �͸� count�� ����.
			if (group[i] == true) {
				count++;
			}
		}
		System.out.println(count); // �׷�ܾ� count �� ���.
	}
}
