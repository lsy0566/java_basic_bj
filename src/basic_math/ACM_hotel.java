package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM_hotel {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수



//		String room_number = "";
//		for(int i = 0; i<T; i++) {
//			
//		}
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int H = Integer.parseInt(st.nextToken()); // 호텔 층 수
			int W = Integer.parseInt(st.nextToken()); // 호텔 번호 수
			int N = Integer.parseInt(st.nextToken()); // 손님 번호
			for (int i = 0; i < N; i++) {
				for (int w = 1; w <= W; w++) {
					for (int h = 1; h <= H; h++) {
						i++;
						if (i == N) { // 방번호 출력
							System.out.println(h*100 + w);
							break;
						}
					}
				}
			}
		}
	}
}
