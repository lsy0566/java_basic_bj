package function;

import java.util.Scanner;

// ���� N���� ��

class A {
	long sum(int[] a) {
		long sum = 0;
		for (int e : a) {
			sum += e;
		}

//		System.out.println(sum);

		return sum;
	}
}

public class sum_integers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // ���� N��
		int[] a = new int[n];

		A a1 = new A();

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

//		a1.sum(a);
		System.out.println(a1.sum(a));
	}
}
