// 2050. 알파벳을 숫자로 변환
import java.util.Scanner;

public class Solution_2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		// 한 글자 단위의 배열 관점이 아닌, 하나의 문자열로 볼 것

		for (int i = 0; i < str.length(); i++) {
			int num = (int) str.charAt(i);
			// 각 한 글자마다 숫자로 형변환
			System.out.format("%d ", num - 64);
			// A는 아스키코드 넘버로 65이므로, 64를 빼서 1로 저장
		}
	}
}
