// 2027. 대각선 출력하기
public class Solution_2027 {
	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				// 문자 5개를 출력
				// 첫 줄에서는 0번째에 i와 j가 같으므로 #
				// 둘째 줄에서는 1번째에 i와 j가 같으므로 #...
				if (i == j) {
					System.out.print("#");
				} else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}