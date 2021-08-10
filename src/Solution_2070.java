// 2070. Å« ³ð, ÀÛÀº ³ð, °°Àº ³ð
import java.util.Scanner;

public class Solution_2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > b) {
				System.out.printf("#%d >\n", i);
			} else if (a < b) {
				System.out.printf("#%d <\n", i);
			} else {
				System.out.printf("#%d =\n", i);
			}
		}
	}
}
