package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class honeycomb {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int range = 2;
		int room = 1;
		
		if (n == 1) {
			System.out.println(1);
		} else {
			while(range <= n) {
				range += 6*room;
				room++;
			}
			System.out.println(room);
		}
	}
}