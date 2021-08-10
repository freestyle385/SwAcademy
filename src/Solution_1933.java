// 1933. 간단한 N의 약수
import java.util.Scanner;

public class Solution_1933 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("%d ", i);
			}
		}
	}
}

