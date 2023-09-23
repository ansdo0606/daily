/**
 * 구슬을 나누는 경우의 수
	문제 설명
	머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
	머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
	balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ balls ≤ 30
	1 ≤ share ≤ 30
	구슬을 고르는 순서는 고려하지 않습니다.
	share ≤ balls
	입출력 예
	balls	share	result
	3	2	3
	5	3	10
	입출력 예 설명
	입출력 예 #1
	
	서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다. 
	입출력 예 #2
	
	서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
	Hint
	서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다. 
 */
package com.moon.main;

public class Sol04 {
	 public long solution(int c, int n) {
	        if (c == n || n == 0)
	            return 1;

	        long answer = 1;
	        int a = (c - n < n) ? c - n : n;

	        for (int i = 0; i < a; i++) {
	            answer *= (c - i);
	            answer /= (i + 1);
	        }

	        return answer;
	    }
	 public static void main(String[] args) {
		 Sol04 solution = new Sol04();

	        int balls1 = 3;
	        int share1 = 2;
	        long result1 = solution.solution(balls1, share1);
	        System.out.println(result1); // 3

	        int balls2 = 5;
	        int share2 = 3;
	        long result2 = solution.solution(balls2, share2);
	        System.out.println(result2); // 10
	    }
}
