/**
 * 문자열의 앞의 n글자
	문제 설명
	문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	my_string은 숫자와 알파벳으로 이루어져 있습니다.
	1 ≤ my_string의 길이 ≤ 1,000
	1 ≤ n ≤ my_string의 길이
	입출력 예
	my_string	n	result
	"ProgrammerS123"	11	"ProgrammerS"
	"He110W0r1d"	5	"He110"
	입출력 예
	입출력 예 #1
	
	예제 1번의 my_string에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.
	입출력 예 #2
	
	예제 2번의 my_string에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.
 */
package com.moon.main;

public class Sol01 {

	 public static void main(String[] args) {
	        String my_string1 = "ProgrammerS123";
	        int n1 = 11;
	        String result1 = solution(my_string1, n1);
	        System.out.println(result1);  // "ProgrammerS"

	        String my_string2 = "He110W0r1d";
	        int n2 = 5;
	        String result2 = solution(my_string2, n2);
	        System.out.println(result2);  // "He110"
	    }
	public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
  }

}
