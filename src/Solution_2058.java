// 2058. �ڸ��� ���ϱ�
import java.util.Scanner;

public class Solution_2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			// �Էµ� ���ڸ� 10���� ������ ���ڸ��� �������� �ǹǷ�, ���ڸ����� sum�� ��� ���ذ��� ���
			num /= 10;
			// �Էµ� ���ڸ� 10���� ���� ���� num���� �����Ͽ� ���ڸ��� ���� ex: 6789 => 678
		}
		System.out.println(sum);
	}
}