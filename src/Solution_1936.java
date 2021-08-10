// 1936. 1대1 가위바위보
import java.util.Scanner;

public class Solution_1936 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] command = sc.nextLine().split(" ");
		int a = Integer.parseInt(command[0]);
		int b = Integer.parseInt(command[1]);
		
		if (a == 3) {
			if (b == 1) {
				System.out.println("B");
			}
			if (b == 2) {
				System.out.println("A");
			}
		}
		else if (a == 2) {
			if (b == 1) {
				System.out.println("A");
			}
			if (b == 3) {
				System.out.println("B");
			}
		}
		else if (a == 1) {
			if (b == 2) {
				System.out.println("B");
			}
			if (b == 3) {
				System.out.println("A");
			}
		}
	}
}