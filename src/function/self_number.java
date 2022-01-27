package function;

import java.util.Scanner;

// ¼¿ÇÁ ³Ñ¹ö
public class self_number {

	static void d(int n) {

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int sum = 0;
		int[] a = new int[n.length()];
		int[] test = new int[10000];
		System.out.println(n.length());
		System.out.println(Integer.parseInt(n) + n.charAt(1) - '0' + n.charAt(0) - '0');
		for (int i = 0; i < 10000; i++) {
			String ia = Integer.toString(i);
			if(i<10) {
				sum = i + i;
//				System.out.println(sum);
				test[i] = sum;
			} else if (i<100) {
				sum = i + ia.charAt(0) - '0' + ia.charAt(1) - '0';
				test[i] = sum;
//				System.out.println(sum);
			} else if (i<1000){
				sum = i + ia.charAt(0) - '0' + ia.charAt(1) - '0' + ia.charAt(2) - '0';
				test[i] = sum;
			} else if (i<10000) {
				sum = i + ia.charAt(0) - '0' + ia.charAt(1) - '0' + ia.charAt(2) - '0' + ia.charAt(3) - '0';
				test[i] = sum;
			}
		}

		for(int e : test) {
			System.out.println(e);
		}

//		d(n);

	}

}
