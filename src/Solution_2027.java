// 2027. �밢�� ����ϱ�
public class Solution_2027 {
	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				// ���� 5���� ���
				// ù �ٿ����� 0��°�� i�� j�� �����Ƿ� #
				// ��° �ٿ����� 1��°�� i�� j�� �����Ƿ� #...
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