// 2056. ������ �޷�

import java.util.Scanner;
 
public class Solution_2056 {
    public static void main(String[] args) {
        int daysOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int test_case = 1; test_case <= t; test_case++) {
        	
        	String str = sc.next();
        	// ���� nextInt�� ���� ��, ���๮��(����)�� ��������. => nextLine�� �������� �Է�ó�� �Ǿ���� 
        	// ��� 1: next ���
        	// ��� 2: nextInt�� ���� ����� nextLine ���̿� nextLine�� �ϳ� �� �߰��ؼ� ���͸� ����
        	String year = str.substring(0, 4);
        	String month = str.substring(4, 6);
        	String day = str.substring(6, 8);
        	// �������� int Ÿ���� ��� ���ڸ��� 0�� ���ư�
        	
        	if (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12 && Integer.parseInt(day) >= 0 && Integer.parseInt(day) <= daysOfMonth[Integer.parseInt(month) - 1]) {
        		System.out.printf("#%d %s/%s/%s\n", test_case, year, month, day);
        	}
        	else {
        		System.out.printf("#%d -1\n", test_case);
        	}
        }
        
    }
}
