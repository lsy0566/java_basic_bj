package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM_hotel {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽� ��



//		String room_number = "";
//		for(int i = 0; i<T; i++) {
//			
//		}
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int H = Integer.parseInt(st.nextToken()); // ȣ�� �� ��
			int W = Integer.parseInt(st.nextToken()); // ȣ�� ��ȣ ��
			int N = Integer.parseInt(st.nextToken()); // �մ� ��ȣ
			for (int i = 0; i < N; i++) {
				for (int w = 1; w <= W; w++) {
					for (int h = 1; h <= H; h++) {
						i++;
						if (i == N) { // ���ȣ ���
							System.out.println(h*100 + w);
							break;
						}
					}
				}
			}
		}
	}
}
