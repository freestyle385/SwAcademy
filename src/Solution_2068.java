// 2068. �ִ�� ���ϱ�
import java.util.Arrays;
import java.util.Scanner;

public class Solution_2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int[] scores = new int[10];
			for (int j = 0; j < scores.length; j++) {
				scores[j] = sc.nextInt();
			}
			Arrays.sort(scores);
			int max = scores[scores.length - 1];
			System.out.printf("#%d %d\n", i, max);
		}

	}
}
