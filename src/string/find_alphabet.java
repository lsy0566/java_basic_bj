package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ¾ËÆÄºª Ã£±â
public class find_alphabet {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a[] = new int[26];

		for (int i = 0; i < a.length; i++) {
			a[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (a[ch - 'a'] == -1) {
				a[ch - 'a'] = i;
			}
		}
		
		for(int e : a) {
			System.out.print(e + " ");
		}
	}

}
