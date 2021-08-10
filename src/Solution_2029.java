// 2029. 몫과 나머지 출력하기
import java.util.Scanner;

public class Solution_2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 2개의 수를 공백을 두고 한 번에 입력한다는 전제가 없음 
			System.out.printf("#%d %d %d\n", test_case, a / b, a % b);
		}
	}
}