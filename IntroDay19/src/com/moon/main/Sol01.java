/**
 * 7의 개수
	문제 설명
	머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 
	return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	1 ≤ array의 길이 ≤ 100
	0 ≤ array의 원소 ≤ 100,000
	입출력 예
	array	result
	[7, 77, 17]	4
	[10, 29]	0
	입출력 예 설명
	입출력 예 #1
	
	[7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
	입출력 예 #2
	
	[10, 29]에는 7이 없으므로 0을 return 합니다.
 */
package com.moon.main;

public class Sol01 {
	 public static int solution(int[] array) {
	        int count = 0; // 7의 개수를 세기 위한 변수 초기화
	        
	        for (int num : array) {
	            while (num > 0) {
	                if (num % 10 == 7) { // 숫자의 일의 자리가 7인지 확인
	                    count++;
	                }
	                num /= 10; // 다음 자릿수로 이동
	            }
	        }
	        
	        return count;
	    }

	    public static void main(String[] args) {
	        
	        int[] array1 = {7, 77, 17};
	        int result1 = solution(array1);
	        System.out.println(result1); // 4 출력
	        
	        int[] array2 = {10, 29};
	        int result2 = solution(array2);
	        System.out.println(result2); // 0 출력
	    }
}
