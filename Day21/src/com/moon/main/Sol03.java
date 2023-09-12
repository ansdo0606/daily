/**
 * 정수 부분
	문제 설명
	실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	0 ≤ flo ≤ 100
	입출력 예
	flo	result
	1.42	1
	69.32	69
	입출력 예 설명
	입출력 예 #1
	
	1.42의 정수 부분은 1입니다.
	입출력 예 #2
	
	69.32의 정수 부분은 69입니다.
 */
package com.moon.main;

public class Sol03 {
	public int solution(double flo) {
        int integerPart = (int) flo; 
        return integerPart;
    }

    public static void main(String[] args) {
    	Sol03 solution = new Sol03();
        double flo1 = 1.42;
        int result1 = solution.solution(flo1);
        System.out.println(result1); 

        double flo2 = 69.32;
        int result2 = solution.solution(flo2);
        System.out.println(result2); 
    }
}
