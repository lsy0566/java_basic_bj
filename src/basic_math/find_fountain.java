package basic_math;

import java.util.Scanner;

public class find_fountain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); // 구하려는 분수의 위치번호
		int cross_count = 1; // 대각선의 분수 개수 초기는 1개다.
		int prev_cross = 0;

//		if(n == 1) {
//			System.out.println(1+"/"+1);
//		} else {
//			while(range <= n) {
//				
//			}
//		}
		while (true) {
			if (x <= prev_cross + cross_count) {
				if (cross_count % 2 == 1) {
					System.out.println((cross_count - (x - prev_cross) + 1) + "/" + (x - prev_cross));
					break;
				} else if (cross_count % 2 == 0) {
					System.out.println(x - prev_cross + "/" + (cross_count - (x - prev_cross) + 1));
					break;
				}
			} else {
				prev_cross += cross_count;
				cross_count++;
			}
		}
//		if(cross_count % 2 == 1) {	// 대각선의 분수 개수가 홀수인 경우 분자가 큰 수부터 시작 => 큰수는 대각선 개수다.
//			
//		} else if(cross_count % 2 == 0) {	// 대각선의 분수 개수가 짝수인 경우 분모가 큰 수부터 시작 => 큰수는 대각선 개수다.
//			
//		} else {	// 대각선의 개수를 늘려준다.
//			cross_count++;
//		}
	}

}
