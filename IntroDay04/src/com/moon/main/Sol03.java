/**
 * 피자 나눠 먹기 (3)
	문제 설명
	머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
	피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 
	피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	2 ≤ slice ≤ 10
	1 ≤ n ≤ 100
	입출력 예
	slice	n	result
	7	10	2
	4	12	3
	입출력 예 설명
	입출력 예 #1
	
	10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
	입출력 예 #2
	
	12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.
 */
package com.moon.main;

public class Sol03 {
	 public int solution(int slice, int n) {
	        int minPans;
	        
	        // 한 판에서 n명이 조각을 먹을 수 있는지 확인
	        if (slice >= n) {
	            minPans = 1;
	        } else {
	            // 한 판에서 n명보다 적게 먹을 수 있는 경우, 필요한 판의 수 계산
	            minPans = (int) Math.ceil((double) n / slice);
	        }
	        
	        return minPans;
	    }

	    public static void main(String[] args) {
	    	Sol03 solution = new Sol03();
	        int slice1 = 7;
	        int n1 = 10;
	        int slice2 = 4;
	        int n2 = 12;

	        System.out.println(solution.solution(slice1, n1)); // 2 출력
	        System.out.println(solution.solution(slice2, n2)); // 3 출력
	    }
}
