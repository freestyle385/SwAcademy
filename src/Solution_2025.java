// 2025. N¡Ÿµ°º¿
import java.util.Scanner;

public class Solution_2025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= command; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}