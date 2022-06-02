package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class become_womens_president {
	static int room[][] = new int[15][15];	// 방 배열 생성
	
	static void create_room() {

		for (int i = 0; i < 15; i++) {	// 방 0층 1~14호, 1~14층 1호 값 생성
			room[i][1] = 1;
			room[0][i] = i;
		}

		for (int i = 1; i < 15; i++) {	// 방 배열 함수
			for (int j = 2; j < 15; j++) {
				room[i][j] = room[i][j - 1] + room[i - 1][j];
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		create_room();
		
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			
			System.out.println(room[n][k]);
		}
	}
}