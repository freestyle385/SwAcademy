// 2071. ��հ� ���ϱ�
import java.util.Scanner;

public class Solution_2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int[] scores = new int[10];
			int sum = 0;
			for (int j = 0; j < scores.length; j++) {
				 scores[j] = sc.nextInt();
				 sum += scores[j];
			}
			System.out.printf("#%d %.0f\n", i, sum / 10.0);
			// ù° �ڸ����� �ݿø��ϹǷ� .0f
			// System.out.pringln(Math.round(sum / 10));�ε� ����
		}
	}
}