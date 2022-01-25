package array;

import java.util.Scanner;

// 새로 정의한 평균 구하기
// 평균을 구하기 때문에 double을 사용했다.
public class avg_new {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // 시험 본 과목의 개수
		double max = 0;
		double a[] = new double[n];
		double avg = 0;

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			if (a[i] > max) {
				max = a[i];
			}
		} // 각 과목의 점수를 a[i]의 배열에 입력받고 과목의 최고점을 구하는 메소드

		for (int i = 0; i < n; i++) {
			a[i] = a[i] / max * 100;
			avg += a[i] / n;
		} // 새로 정의한 평균을 구하는 메소드

		System.out.println(avg);
	}
}