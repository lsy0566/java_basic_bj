package array;

import java.util.Scanner;

// 서로 다른 나머지 구하기
public class Remainder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[42];
		
		int count = 0; 
		
		for (int i = 0; i < 10; i++) {
			int n = s.nextInt();
			
			for (int j = 0; j < 42; j++) {
				if (n % 42 == j) {
					a[j]++;
				}
			}
		}
		
		for (int e : a) {
			if(e != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}