/**
 * 모음 제거
	문제 설명
	영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 
	모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	my_string은 소문자와 공백으로 이루어져 있습니다.
	1 ≤ my_string의 길이 ≤ 1,000
	입출력 예
	my_string				result
	"bus"					"bs"
	"nice to meet you"		"nc t mt y"
	입출력 예 설명
	입출력 예 #1
	
	"bus"에서 모음 u를 제거한 "bs"를 return합니다.
	입출력 예 #1
	
	"nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
 */
package com.moon.main;

public class Sol01 {
	 public static String solution(String my_string) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < my_string.length(); i++) {
	            char ch = my_string.charAt(i);
	            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
	                result.append(ch);
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        // 테스트 케이스 예시
	        String input1 = "bus";
	        String input2 = "nice to meet you";

	        String output1 = solution(input1);
	        String output2 = solution(input2);

	        System.out.println(output1); // "bs"
	        System.out.println(output2); // "nc t mt y"
	    }
}
