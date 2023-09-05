/**
 * 대문자로 바꾸기
	문제 설명
	알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 
	solution 함수를 완성해 주세요.
	
	제한사항
	1 ≤ myString의 길이 ≤ 100,000
	myString은 알파벳으로 이루어진 문자열입니다.
	입출력 예
	myString	result
	"aBcDeFg"	"ABCDEFG"
	"AAA"	"AAA"
 */
package com.moon.main;

public class Sol01 {
	 public String solution(String myString) {
	        String answer = myString;
	        return answer.toUpperCase();
	    }
	 public static void main(String[] args) {
		 String input1 = "aBcDeFg";
	        String input2 = "AAA";
	        
	        Sol01 solution = new Sol01();
	        
	        String result1 = solution.solution(input1);
	        String result2 = solution.solution(input2);
	        
	        System.out.println(result1);
	        System.out.println(result2);
	}
}
