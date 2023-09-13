/**
 * 날짜 비교하기
	문제 설명
	정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 
	각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
	
	만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
	
	제한사항
	date1의 길이 = date2의 길이 = 3
	0 ≤ year ≤ 10,000
	1 ≤ month ≤ 12
	day는 month에 따라 가능한 날짜로 주어집니다.
	입출력 예
	date1	date2	result
	[2021, 12, 28]	[2021, 12, 29]	1
	[1024, 10, 24]	[1024, 10, 24]	0
	입출력 예 설명
	입출력 예 #1
	
	date1이 date2보다 하루 앞서기 때문에 1을 return 합니다.
	입출력 예 #2
	
	date1과 date2는 날짜가 서로 같으므로 date1이 더 앞서는 날짜가 아닙니다. 따라서 0을 return 합니다.
 */
package com.moon.main;

public class Sol05 {
	public int solution(int[] date1, int[] date2) {
        // date1과 date2의 연도를 비교
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        }
        
        // 연도가 같으면 월을 비교
        if (date1[1] < date2[1]) {
            return 1;
        } else if (date1[1] > date2[1]) {
            return 0;
        }
        
        // 연도와 월이 같으면 일을 비교
        if (date1[2] < date2[2]) {
            return 1;
        } else if (date1[2] > date2[2]) {
            return 0;
        }
        
        // 모든 비교가 같으면 날짜가 같다는 뜻이므로 0 반환
        return 0;
    }

    public static void main(String[] args) {
    	Sol05 solution = new Sol05();
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        System.out.println(solution.solution(date1, date2)); // 1

        int[] date3 = {1024, 10, 24};
        int[] date4 = {1024, 10, 24};
        System.out.println(solution.solution(date3, date4)); // 0
    }
}
