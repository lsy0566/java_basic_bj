package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ܾ��� ���� ����
public class word_count {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine(); // ���� �Է�

		String s2 = s.trim(); // ���ڿ� �� �յ� ���� ����

//		String s2 = s.strip();
//		���ڿ� �յ� ���� ���� �Ǵٸ� ���
//		�� �� ������ ������ ���� �� �� ����

		String n[] = s2.split(" "); // ���� �������� �ܾ� �и�

		if (n[0].isEmpty()) {	// ������ �Է����� �ʰų� ���鸸 �Է��ϸ� null���� ���� ������ ���̰� 1�� �ǹǷ� �̰��� ó���ϱ� ���� �Լ�
			System.out.println(0);
		} else {
			System.out.println(n.length); // �ܾ��� ����
		}
//		�� �ٸ� ���

//		StringTokenizer sa = new StringTokenizer(br.readLine());

//		System.out.println(sa.countTokens());
//		��ū�� ���� ����

	}
}