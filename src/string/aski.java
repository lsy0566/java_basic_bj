package string;

import java.io.IOException;
import java.util.Scanner;

// 아스키 코드 출력
public class aski {

	public static void main(String[] args) throws IOException {	
//		InputStream inputstream = System.in;
//		InputStreamReader sr = new InputStreamReader(inputstream);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		BufferedReader br = new BufferedReader(sr);
//		
//		int a = br.read();
//				
//		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		int a = s.next().charAt(0);
		System.out.println(a);
	}
}