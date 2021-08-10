// 2043. 서랍의 비밀번호
import java.util.Scanner;

public class Solution_2043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		int p = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		System.out.println(p - k + 1);
		// 단순하게 생각해서, p는 항상 k보다 크고 k의 최대값은 결국 p임
		// k를 1씩 올리기 때문에, 결국 확인 횟수는 p와 k의 차+1임
	}
}