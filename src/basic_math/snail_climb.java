package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snail_climb {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 미터변수
		int B = Integer.parseInt(st.nextToken()); // 밤에 내려가는 미터변수
		int V = Integer.parseInt(st.nextToken()); // 총 올라가야할 높이변수
		int n = 0;	// 몇일 걸리는지 변수
		
		if((V-B)%(A-B) == 0) {
			n = (V-B)/(A-B);
			System.out.println(n);
		} else {
			n = (V-B)/(A-B);
			n++;
			System.out.println(n);
		}
	}
}