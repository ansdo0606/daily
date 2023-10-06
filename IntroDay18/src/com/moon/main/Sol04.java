/**
 * 문자열 정렬하기 (2)
	문제 설명
	영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 
	알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	0 < my_string 길이 < 100
	입출력 예
	my_string	result
	"Bcad"	"abcd"
	"heLLo"	"ehllo"
	"Python"	"hnopty"
	입출력 예 설명
	입출력 예 #1
	
	"Bcad"를 모두 소문자로 바꾸면 "bcad"이고 이를 알파벳 순으로 정렬하면 "abcd"입니다.
	입출력 예 #2
	
	"heLLo"를 모두 소문자로 바꾸면 "hello"이고 이를 알파벳 순으로 정렬하면 "ehllo"입니다.
	입출력 예 #3
	
	"Python"를 모두 소문자로 바꾸면 "python"이고 이를 알파벳 순으로 정렬하면 "hnopty"입니다.
 */
package com.moon.main;

import java.util.Arrays;

public class Sol04 {
	public static String solution(String my_string) {
        // 문자열을 소문자로 변환
        my_string = my_string.toLowerCase();

        // 문자열을 배열로 변환하여 정렬
        char[] charArray = my_string.toCharArray();
        Arrays.sort(charArray);

        // 정렬된 문자열 배열을 문자열로 변환
        String result = new String(charArray);

        return result;
    }

    public static void main(String[] args) {

        String my_string1 = "Bcad";
        String result1 = solution(my_string1);
        System.out.println(result1); // 결과 출력: "abcd"

        String my_string2 = "heLLo";
        String result2 = solution(my_string2);
        System.out.println(result2); // 결과 출력: "ehllo"

        String my_string3 = "Python";
        String result3 = solution(my_string3);
        System.out.println(result3); // 결과 출력: "hnopty"
    }
}
