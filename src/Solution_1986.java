// 1986. 지그재그 숫자
import java.util.Scanner;

public class Solution_1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int score = sc.nextInt();
			int sum = 0;

			for (int j = 1; j <= score; j++) {

				if (j == 1) {
					sum += 1;
				} else if (j % 2 != 0) {
					sum += j;
				} else if (j % 2 == 0) {
					sum -= j;
				}
			}
			System.out.printf("#%d %d\n", i, sum);

		}
	}
}