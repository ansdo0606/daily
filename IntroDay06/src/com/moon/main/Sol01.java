/**
 * 문자열 뒤집기
	문제 설명
	문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 
	solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ my_string의 길이 ≤ 1,000
	입출력 예
	my_string	return
	"jaron"	"noraj"
	"bread"	"daerb"
	입출력 예 설명
	입출력 예 #1
	
	my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
	입출력 예 #2
	
	my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.
 */
package com.moon.main;

public class Sol01 {
	 public String solution(String my_string) {
	        // 문자열을 문자 배열로 변환
	        char[] charArray = my_string.toCharArray();
	        
	        // 문자 배열을 뒤집기
	        int left = 0;
	        int right = charArray.length - 1;
	        while (left < right) {
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            left++;
	            right--;
	        }
	        
	        // 뒤집힌 문자 배열을 문자열로 변환하여 반환
	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	    	Sol01 solution = new Sol01();
	        String input1 = "jaron";
	        String input2 = "bread";

	        String result1 = solution.solution(input1);
	        String result2 = solution.solution(input2);

	        System.out.println(result1); // "noraj"
	        System.out.println(result2); // "daerb"
	    }
}
