package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���ڿ� �ݺ�
public class string_repeat {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� �� T

		for (int k = 0; k < T; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken()); // �ݺ� Ƚ�� R
			String S = st.nextToken(); // �Է¹��� ���ڿ� S

			for (int i = 0; i < S.length(); i++) {
				for (int j = 0; j < R; j++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
