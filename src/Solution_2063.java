// 2063. �߰��� ã��
import java.util.Arrays;
import java.util.Scanner;

public class Solution_2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] scores = new int[n];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt(); 
		}
		Arrays.sort(scores);
		// �������� ����
		// �������� ������ ���, Arrays.sort(scores, Collections.reverseOrder());
		System.out.println(scores[scores.length/2]);
		
	}
}

// ��, �պ�, ��, ����, ����, �������� �˰��� �����ϱ�
// https://byfuls.com/programming/read?id=57