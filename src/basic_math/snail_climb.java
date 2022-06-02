package basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snail_climb {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); // ���� �ö󰡴� ���ͺ���
		int B = Integer.parseInt(st.nextToken()); // �㿡 �������� ���ͺ���
		int V = Integer.parseInt(st.nextToken()); // �� �ö󰡾��� ���̺���
		int n = 0;	// ���� �ɸ����� ����
		
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