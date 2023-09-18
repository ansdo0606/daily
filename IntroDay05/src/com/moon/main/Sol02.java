/**
 * 아이스 아메리카노
	문제 설명
	머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
	머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 
	남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	0 < money ≤ 1,000,000
	입출력 예
	money	result
	5,500	[1, 0]
	15,000	[2, 4000]
	입출력 예 설명
	입출력 예 #1
	
	5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
	입출력 예 #2
	
	15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.
 */
package com.moon.main;

public class Sol02 {
	 public int[] solution(int money) {
	        int pricePerAmericano = 5500; // 아메리카노 가격
	        int[] answer = new int[2]; // 결과를 담을 배열 [아메리카노 잔 수, 남은 돈]

	        // 아메리카노를 최대한 많이 사고 남은 돈 계산
	        int numAmericano = money / pricePerAmericano;
	        int remainingMoney = money % pricePerAmericano;

	        answer[0] = numAmericano; // 아메리카노 잔 수 저장
	        answer[1] = remainingMoney; // 남은 돈 저장

	        return answer;
	    }

	    public static void main(String[] args) {
	    	Sol02 solution = new Sol02();
	        int money1 = 5500;
	        int money2 = 15000;

	        int[] result1 = solution.solution(money1);
	        int[] result2 = solution.solution(money2);

	        System.out.println(result1[0] + ", " + result1[1]); // 1, 0 출력
	        System.out.println(result2[0] + ", " + result2[1]); // 2, 4000 출력
	    }
}
