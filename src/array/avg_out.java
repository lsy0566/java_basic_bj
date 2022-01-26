package array;

import java.util.Scanner;

// 평균 넘는 학생들의 비율 반올림 후 소수점 셋째 자리까지 출력
public class avg_out {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt(); // 테스트 케이스 개수
		double[] over_avg = new double[c]; // 평균을 넘는 학생들의 비율을 반올림 한것을 저장.

		for (int i = 0; i < c; i++) {
			int n = s.nextInt(); // n은 학생의 수
			int sum = 0;
			int avg = 0;
			int over_stu = 0; // 평균을 넘는 학생의 수
			double avg_test = 0;
			int[] sco_arr = new int[n];

			for (int j = 0; j < n; j++) {
				sco_arr[j] = s.nextInt();
				sum += sco_arr[j]; // 평균 구하기 위한 학생들의 점수 합
			}
			avg = sum / n; // 전체 학생의 평균
			for (int k = 0; k < n; k++) {	// 평균을 넘는 학생의 숫자 구하는 함수
				if (sco_arr[k] > avg) {
					over_stu++;
				}
			}
			avg_test = (double) over_stu/n*100;	// 평균을 넘는 학생들의 평균
			
//			avg_test = Math.round(avg_test*1000)/1000.0;	// 소수점 셋째자리까지 구하는 함수 => 소수점 자리가 모두 0이면 삭제 시킬 수도 있음

			over_avg[i] = avg_test;
		}
		for(double e : over_avg) {
			System.out.println(String.format("%.3f", e) + "%");	// String.format을 활용한 소수점 자리 출력
		}
	}
}
