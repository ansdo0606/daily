/**
 * 나이 출력
	문제 설명
	머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 
	2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
	
	제한사항
	0 < age ≤ 120
	나이는 태어난 연도에 1살이며 1년마다 1씩 증가합니다.
	입출력 예
	age	result
	40	1983
	23	2000
	입출력 예 설명
	입출력 예 #1
	
	2022년 기준 40살이므로 1983년생입니다.
	입출력 예 #2
	
	2022년 기준 23살이므로 2000년생입니다.
 */
package com.moon.main;

public class Sol03 {
	 public int solution(int age) {
	        int currentYear = 2022; // 현재 연도
	        int birthYear = currentYear - age + 1; // 출생 연도 계산
	        
	        return birthYear;
	    }

	    public static void main(String[] args) {
	    	Sol03 solution = new Sol03();
	        int age1 = 40;
	        int age2 = 23;

	        System.out.println(solution.solution(age1)); // 1983 출력
	        System.out.println(solution.solution(age2)); // 2000 출력
	    }
}
