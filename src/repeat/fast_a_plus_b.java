package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fast_a_plus_b {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String T = br.readLine();
		int t = Integer.parseInt(T);

//		System.out.println(a);
		for (int i = 0; i < t; i++) {
			int A = br.read();
			int B = br.read();
			
			System.out.println(A+B);
		}

		
		
		
		
		
		
		
		
		
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
