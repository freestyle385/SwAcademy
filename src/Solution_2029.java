// 2029. ��� ������ ����ϱ�
import java.util.Scanner;

public class Solution_2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 2���� ���� ������ �ΰ� �� ���� �Է��Ѵٴ� ������ ���� 
			System.out.printf("#%d %d %d\n", test_case, a / b, a % b);
		}
	}
}