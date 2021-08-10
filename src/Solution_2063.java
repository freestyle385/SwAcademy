// 2063. 중간값 찾기
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
		// 오름차순 정렬
		// 내림차순 정렬의 경우, Arrays.sort(scores, Collections.reverseOrder());
		System.out.println(scores[scores.length/2]);
		
	}
}

// 힙, 합병, 퀵, 버블, 선택, 삽입정렬 알고리즘도 공부하기
// https://byfuls.com/programming/read?id=57