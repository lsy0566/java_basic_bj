package repeat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// ���� ������ ���� ��
public class fast_a_plus_b {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // �������� �� ���� �Է� �ޱ� ����

			int a = Integer.parseInt(st.nextToken()); // ó�� ���� ���ڸ� ������ ��ȯ
			int b = Integer.parseInt(st.nextToken()); // ���� ���� ���ڸ� ������ ��ȯ

			bw.write(a+b + "\n");	// println�� �޸� �ڵ� ���๮�ڸ� ���� �־��־�� �Ѵ�.
		}
		bw.flush();	// �����ִ� �����͸� ��� ���
		
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
