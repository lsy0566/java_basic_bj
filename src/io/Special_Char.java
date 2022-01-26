package io;

import java.util.Scanner;

// 동일 아이디가 존재하는지 확인후 아이디 뒤에 ??! 붙여서 출력하기
public class Special_Char {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String id = s.nextLine();

		System.out.println(id + "??!");
//		if (id.equals("joonas")) {
//			System.out.println(id + "??!");
//		}
	}
}