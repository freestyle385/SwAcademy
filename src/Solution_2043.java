// 2043. ������ ��й�ȣ
import java.util.Scanner;

public class Solution_2043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		int p = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		System.out.println(p - k + 1);
		// �ܼ��ϰ� �����ؼ�, p�� �׻� k���� ũ�� k�� �ִ밪�� �ᱹ p��
		// k�� 1�� �ø��� ������, �ᱹ Ȯ�� Ƚ���� p�� k�� ��+1��
	}
}