// 2019. 더블더블
import java.util.Scanner;

public class Solution_2019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		double a = Math.pow(2, command);
		// Math.pow(a, b) : a의 b제곱
		
		for (int i = 1; i <= a; i*=2) {
			System.out.printf("%d ", i);
		}
		// 1, 1*2 = 2, (1*2)*2 = 4, (1*2*2)*2 = 8 ...
		
	}
}
