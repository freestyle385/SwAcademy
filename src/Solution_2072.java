// 2072. 홀수만 더하기
import java.util.Scanner;

public class Solution_2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int[] scores = new int[10];
			int sum = 0;
			for (int j = 0; j < scores.length; j++) {
				scores[j] = sc.nextInt();

				if (scores[j] % 2 != 0) {
					sum += scores[j];
				}
			}
			System.out.printf("#%d %d\n", i, sum);

		}
	}
}