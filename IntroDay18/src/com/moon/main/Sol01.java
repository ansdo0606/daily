/**
 * 문자열안에 문자열
	문제 설명
	문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 
	solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ str1의 길이 ≤ 100
	1 ≤ str2의 길이 ≤ 100
	문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
	입출력 예
	str1	str2	result
	"ab6CDE443fgh22iJKlmn1o"	"6CD"	1
	"ppprrrogrammers"	"pppp"	2
	"AbcAbcA"	"AAA"	2
	입출력 예 설명
	입출력 예 #1
	
	"ab6CDE443fgh22iJKlmn1o" str1에 str2가 존재하므로 1을 return합니다.
	입출력 예 #2
	
	"ppprrrogrammers" str1에 str2가 없으므로 2를 return합니다.
	입출력 예 #3
	
	"AbcAbcA" str1에 str2가 없으므로 2를 return합니다.
 */
package com.moon.main;

public class Sol01 {
	 public static int solution(String str1, String str2) {
	        if (str1.contains(str2)) {
	            return 1;
	        } else {
	            return 2;
	        }
	    }

	    public static void main(String[] args) {

	        String str1_1 = "ab6CDE443fgh22iJKlmn1o";
	        String str2_1 = "6CD";
	        int result_1 = solution(str1_1, str2_1);
	        System.out.println(result_1); // 결과 출력: 1

	        String str1_2 = "ppprrrogrammers";
	        String str2_2 = "pppp";
	        int result_2 = solution(str1_2, str2_2);
	        System.out.println(result_2); // 결과 출력: 2

	        String str1_3 = "AbcAbcA";
	        String str2_3 = "AAA";
	        int result_3 = solution(str1_3, str2_3);
	        System.out.println(result_3); // 결과 출력: 2
	    }
}
