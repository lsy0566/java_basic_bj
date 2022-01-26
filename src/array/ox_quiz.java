package array;

import java.util.Scanner;

// 문제를 연달아 맞추면 1점씩 가산됨
public class ox_quiz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] str = new String[n];
		int[] score = new int[n];

		for (int i = 0; i < n; i++) {
			int count = 0;
			int sum = 0;
			str[i] = s.next();
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			score[i] = sum;
		}
		
		for(int e : score) {
			System.out.println(e);
		}
	}

}
