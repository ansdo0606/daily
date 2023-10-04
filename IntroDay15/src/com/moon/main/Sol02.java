/**
 * 인덱스 바꾸기
	문제 설명
	문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 
	num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	1 < my_string의 길이 < 100
	0 ≤ num1, num2 < my_string의 길이
	my_string은 소문자로 이루어져 있습니다.
	num1 ≠ num2
	입출력 예
	my_string	num1	num2	result
	"hello"	1	2	"hlelo"
	"I love you"	3	6	"I l veoyou"
	입출력 예 설명
	입출력 예 #1
	
	"hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.
	입출력 예 #2
	
	"I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.
 */
package com.moon.main;

public class Sol02 {
	public static String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();

        // 인덱스 num1과 num2에 해당하는 문자 교환
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        // char 배열을 다시 문자열로 변환
        return new String(charArray);
    }

    public static void main(String[] args) {

        String my_string1 = "hello";
        int num1_1 = 1;
        int num2_1 = 2;
        String result1 = solution(my_string1, num1_1, num2_1);
        System.out.println(result1); // 예상 결과: "hlelo"

        String my_string2 = "I love you";
        int num1_2 = 3;
        int num2_2 = 6;
        String result2 = solution(my_string2, num1_2, num2_2);
        System.out.println(result2); // 예상 결과: "I l veoyou"
    }
}
