// 2058. 자릿수 더하기
import java.util.Scanner;

public class Solution_2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			// 입력된 숫자를 10으로 나누면 끝자리가 나머지가 되므로, 끝자리부터 sum에 계속 더해가는 방식
			num /= 10;
			// 입력된 숫자를 10으로 나눈 몫을 num으로 저장하여 끝자리를 날림 ex: 6789 => 678
		}
		System.out.println(sum);
	}
}