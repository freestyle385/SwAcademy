// 2050. ���ĺ��� ���ڷ� ��ȯ
import java.util.Scanner;

public class Solution_2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		// �� ���� ������ �迭 ������ �ƴ�, �ϳ��� ���ڿ��� �� ��

		for (int i = 0; i < str.length(); i++) {
			int num = (int) str.charAt(i);
			// �� �� ���ڸ��� ���ڷ� ����ȯ
			System.out.format("%d ", num - 64);
			// A�� �ƽ�Ű�ڵ� �ѹ��� 65�̹Ƿ�, 64�� ���� 1�� ����
		}
	}
}
