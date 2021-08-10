// 2056. 연월일 달력

import java.util.Scanner;
 
public class Solution_2056 {
    public static void main(String[] args) {
        int daysOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int test_case = 1; test_case <= t; test_case++) {
        	
        	String str = sc.next();
        	// 위의 nextInt가 끝난 후, 개행문자(엔터)가 남아있음. => nextLine은 공백으로 입력처리 되어버림 
        	// 방법 1: next 사용
        	// 방법 2: nextInt과 내가 사용할 nextLine 사이에 nextLine을 하나 더 추가해서 엔터를 날림
        	String year = str.substring(0, 4);
        	String month = str.substring(4, 6);
        	String day = str.substring(6, 8);
        	// 연월일이 int 타입일 경우 앞자리의 0이 날아감
        	
        	if (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12 && Integer.parseInt(day) >= 0 && Integer.parseInt(day) <= daysOfMonth[Integer.parseInt(month) - 1]) {
        		System.out.printf("#%d %s/%s/%s\n", test_case, year, month, day);
        	}
        	else {
        		System.out.printf("#%d -1\n", test_case);
        	}
        }
        
    }
}
