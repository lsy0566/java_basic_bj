package repeat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 빠른 연산을 위한 식
public class fast_a_plus_b {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // 공백으로 두 수를 입력 받기 위함

			int a = Integer.parseInt(st.nextToken()); // 처음 받은 숫자를 정수로 변환
			int b = Integer.parseInt(st.nextToken()); // 공백 뒤의 숫자를 정수로 변환

			bw.write(a+b + "\n");	// println과 달리 자동 개행문자를 따로 넣어주어야 한다.
		}
		bw.flush();	// 남아있는 데이터를 모두 출력
		
//		Scanner s = new Scanner(System.in);
//
//		int t = s.nextInt();
//
//		for (int i = 0; i < t; i++) {
//			int a = s.nextInt();
//			int b = s.nextInt();
//			
//			System.out.println(a+b);
//		}
	}
}
