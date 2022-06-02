package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class become_womens_president {
	static int room[][] = new int[15][15];	// �� �迭 ����
	
	static void create_room() {

		for (int i = 0; i < 15; i++) {	// �� 0�� 1~14ȣ, 1~14�� 1ȣ �� ����
			room[i][1] = 1;
			room[0][i] = i;
		}

		for (int i = 1; i < 15; i++) {	// �� �迭 �Լ�
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