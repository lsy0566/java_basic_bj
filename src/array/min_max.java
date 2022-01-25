package array;

import java.util.Scanner;

// 최솟값, 최대값 출력
public class min_max {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];	// 배열의 길이를 먼저 설정하는 방법.
		
		for (int i = 0; i<n ; i++) {
			int b = s.nextInt();
			a[i] = b;
		}
		
		int max = a[0];
		int min = a[0];
		
		for (int j = 1; j < n; j++) {
			if(a[j] > max) {
				max = a[j];
			}
			if(a[j] < min) {
				min = a[j];
			}
		}
		
		System.out.println(min + " " + max);
		
	}
}