package array;

import java.util.Scanner;

// 최대값과 위치 출력
public class max_location {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[9];
		int max = 0;
		int max_loc = 0;
		
		for(int i = 0; i<9; i++) {
			a[i] = s.nextInt();
			if(a[i] > max) {
				max = a[i];
				max_loc = i+1;
			}
		}
		System.out.println(max);
		System.out.println(max_loc);
	}

}