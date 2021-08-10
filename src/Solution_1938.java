// 1938. 아주 간단한 계산기
import java.util.Scanner;

public class Solution_1938 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] command = sc.nextLine().split(" ");
		int a = Integer.parseInt(command[0]);
		int b = Integer.parseInt(command[1]);
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}
}