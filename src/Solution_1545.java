// 1545. 거꾸로 출력해 보아요
import java.util.Scanner;

public class Solution_1545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		
		for(int i = command; i >= 0; i--) {
			System.out.printf("%d ", i);
		}
		
	}
}
