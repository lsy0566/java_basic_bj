package string;

import java.util.Scanner;

public class croatia_abc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String croa = s.next();
		int count = 0;

		for (int i = 0; i < croa.length(); i++) {
			if (croa.charAt(i) == 'c' && croa.length() > i + 1) {
				if (croa.charAt(i + 1) == '=') {
					count++;
					i++;
				} else if (croa.charAt(i + 1) == '-') {
					count++;
					i++;
				} else {
					count++;
				}
			} else if (croa.charAt(i) == 'l' && croa.length() > i + 1 && croa.charAt(i + 1) == 'j') {
				count++;
				i++;
			} else if (croa.charAt(i) == 'n' && croa.length() > i + 1 && croa.charAt(i + 1) == 'j') {
				count++;
				i++;
			} else if (croa.charAt(i) == 's' && croa.length() > i + 1 && croa.charAt(i + 1) == '=') {
				count++;
				i++;
			} else if (croa.charAt(i) == 'z' && croa.length() > i + 1 && croa.charAt(i + 1) == '=') {
				count++;
				i++;
			} else if (croa.charAt(i) == 'd') {
				if (croa.length() > i + 1 && croa.charAt(i + 1) == '-') {
					count++;
					i++;
				} else if (croa.length() > i + 2 && croa.charAt(i + 1) == 'z' && croa.charAt(i + 2) == '=') {
					count++;
					i += 2;
				} else {
					count++;
				}
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}