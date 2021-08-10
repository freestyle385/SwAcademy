// 1945. 간단한 소인수분해
import java.util.Scanner;

public class Solution_1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int a = 0; // 2의 a승
			int b = 0; // 3의 b승
			int c = 0; // 5의 c승
			int d = 0; // 7의 d승
			int e = 0; // 11의 e승
			// n을 2로 반복적으로 나눠보고, 더이상 2로 나눠지지 않으면 3, 5, 7, 11로 순차적으로 나누는 방식. 각각 반복된 횟수를 측정하면 됨.
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