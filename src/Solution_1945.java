// 1945. ������ ���μ�����
import java.util.Scanner;

public class Solution_1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int a = 0; // 2�� a��
			int b = 0; // 3�� b��
			int c = 0; // 5�� c��
			int d = 0; // 7�� d��
			int e = 0; // 11�� e��
			// n�� 2�� �ݺ������� ��������, ���̻� 2�� �������� ������ 3, 5, 7, 11�� ���������� ������ ���. ���� �ݺ��� Ƚ���� �����ϸ� ��.
			while (true) {
				if (n % 2 == 0) {
					n = n / 2;
					a++;
				} else if (n % 3 == 0) {
					n = n / 3;
					b++;
				} else if (n % 5 == 0) {
					n = n / 5;
					c++;
				} else if (n % 7 == 0) {
					n = n / 7;
					d++;
				} else if (n % 11 == 0) {
					n = n / 11;
					e++;
				}
				if (n == 1) {
					break;
				}
			}
			System.out.printf("#%d %d %d %d %d %d\n", i, a, b, c, d, e);

		}
	}
}