package basic_math;

import java.util.Scanner;

public class find_fountain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); // ���Ϸ��� �м��� ��ġ��ȣ
		int cross_count = 1; // �밢���� �м� ���� �ʱ�� 1����.
		int prev_cross = 0;

//		if(n == 1) {
//			System.out.println(1+"/"+1);
//		} else {
//			while(range <= n) {
//				
//			}
//		}
		while (true) {
			if (x <= prev_cross + cross_count) {
				if (cross_count % 2 == 1) {
					System.out.println((cross_count - (x - prev_cross) + 1) + "/" + (x - prev_cross));
					break;
				} else if (cross_count % 2 == 0) {
					System.out.println(x - prev_cross + "/" + (cross_count - (x - prev_cross) + 1));
					break;
				}
			} else {
				prev_cross += cross_count;
				cross_count++;
			}
		}
//		if(cross_count % 2 == 1) {	// �밢���� �м� ������ Ȧ���� ��� ���ڰ� ū ������ ���� => ū���� �밢�� ������.
//			
//		} else if(cross_count % 2 == 0) {	// �밢���� �м� ������ ¦���� ��� �и� ū ������ ���� => ū���� �밢�� ������.
//			
//		} else {	// �밢���� ������ �÷��ش�.
//			cross_count++;
//		}
	}

}
