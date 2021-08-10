// 2071. 평균값 구하기
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
			// 첫째 자리에서 반올림하므로 .0f
			// System.out.pringln(Math.round(sum / 10));로도 가능
		}
	}
}