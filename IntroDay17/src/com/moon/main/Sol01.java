/**
 * 숫자 찾기
	문제 설명
	정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 
	return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	0 < num < 1,000,000
	0 ≤ k < 10
	num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
	입출력 예
	num	k	result
	29183	1	3
	232443	4	4
	123456	7	-1
	입출력 예 설명
	입출력 예 #1
	
	29183에서 1은 3번째에 있습니다.
	입출력 예 #2
	
	232443에서 4는 4번째에 처음 등장합니다.
	입출력 예 #3
	
	123456에 7은 없으므로 -1을 return 합니다.
 */
package com.moon.main;

public class Sol01 {
	public static int solution(int num, int k) {
        String numStr = Integer.toString(num); // 정수를 문자열로 변환하여 숫자를 하나씩 확인하기 위해 사용합니다.
        
        for (int i = 0; i < numStr.length(); i++) {
            if (Character.getNumericValue(numStr.charAt(i)) == k) { // 문자열로 변환한 숫자 중에 k가 있는지 확인합니다.
                return i + 1; // k가 있는 위치를 찾았으므로 해당 위치 + 1을 반환합니다.
            }
        }
        
        return -1; // k가 없다면 -1을 반환합니다.
    }

    public static void main(String[] args) {

        System.out.println(solution(29183, 1));   // 출력: 3
        System.out.println(solution(232443, 4));  // 출력: 4
        System.out.println(solution(123456, 7));  // 출력: -1
    }
}
