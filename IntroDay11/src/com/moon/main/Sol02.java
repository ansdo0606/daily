/**
 * 합성수 찾기
	문제 설명
	약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 
	return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ n ≤ 100
	입출력 예
	n	result
	10	5
	15	8
	입출력 예 설명
	입출력 예 #1
	
	10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
	입출력 예 #1
	
	15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.
 */
package com.moon.main;

public class Sol02 {
	 public int solution(int n) {
	        int count = 0; // 합성수의 개수를 저장할 변수 초기화

	        for (int i = 4; i <= n; i++) { // 4부터 n까지의 수 중에서 합성수를 찾음
	            if (isComposite(i)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    // 합성수인지 판별하는 함수
	    private boolean isComposite(int num) {
	        if (num < 4) { // 4 미만의 수는 합성수가 아님
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) { // 약수가 존재하면 합성수임
	                return true;
	            }
	        }

	        return false; // 약수가 없으면 소수임
	    }

	    public static void main(String[] args) {
	    	Sol02 solution = new Sol02();
	        System.out.println(solution.solution(10)); // 출력: 5
	        System.out.println(solution.solution(15)); // 출력: 8
	    }
}
