/**
 * 369게임
	문제 설명
	머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 
	숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 
	머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	1 ≤ order ≤ 1,000,000
	입출력 예
	order	result
	3	1
	29423	2
	입출력 예 설명
	입출력 예 #1
	
	3은 3이 1개 있으므로 1을 출력합니다.
	입출력 예 #2
	
	29423은 3이 1개, 9가 1개 있으므로 2를 출력합니다.
 */
package com.moon.main;

public class Sol02 {
	public static int solution(int order) {
        // 숫자를 문자열로 변환
        String orderStr = String.valueOf(order);
        
        // 박수 횟수 초기화
        int clapCount = 0;
        
        // 문자열에서 '3', '6', '9'의 개수를 세기
        for (int i = 0; i < orderStr.length(); i++) {
            char digit = orderStr.charAt(i);
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++;
            }
        }
        
        return clapCount;
    }

    public static void main(String[] args) {

        int order1 = 3;
        int result1 = solution(order1);
        System.out.println(result1); // 예상 결과: 1

        int order2 = 29423;
        int result2 = solution(order2);
        System.out.println(result2); // 예상 결과: 2
    }
}
