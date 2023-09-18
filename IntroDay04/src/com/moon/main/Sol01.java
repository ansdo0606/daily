/**
 * 피자 나눠 먹기 (1)
	문제 설명
	머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
	모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
	
	제한사항
	1 ≤ n ≤ 100
	입출력 예
	n	result
	7	1
	1	1
	15	3
	입출력 예 설명
	입출력 예 #1
	
	7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.
	입출력 예 #2
	
	1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.
	입출력 예 #3
	
	15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
 */
package com.moon.main;

public class Sol01 {
	 public int solution(int n) {
	        // 피자 조각을 나눠줄 수 있는 판의 수를 계산합니다.
	        // 한 판에 7조각씩 나눠줄 수 있으므로, n을 7로 나눈 몫을 구합니다.
	        int answer = n / 7;

	        // 만약 n이 7로 나누어 떨어지지 않으면 하나의 판을 더 추가로 필요합니다.
	        if (n % 7 != 0) {
	            answer++;
	        }

	        return answer;
	    }

	    public static void main(String[] args) {
	    	Sol01 solution = new Sol01();
	        int n1 = 7;
	        int n2 = 1;
	        int n3 = 15;
	        
	        System.out.println(solution.solution(n1)); // 1 출력
	        System.out.println(solution.solution(n2)); // 1 출력
	        System.out.println(solution.solution(n3)); // 3 출력
	    }
}
