/**
 * 영어가 싫어요
	문제 설명
	영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, 
	numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
	
	제한사항
	numbers는 소문자로만 구성되어 있습니다.
	numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 
	공백 없이 조합되어 있습니다.
	1 ≤ numbers의 길이 ≤ 50
	"zero"는 numbers의 맨 앞에 올 수 없습니다.
	입출력 예
	numbers	result
	"onetwothreefourfivesixseveneightnine"	123456789
	"onefourzerosixseven"	14067
	입출력 예 설명
	입출력 예 #1
	
	"onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.
	입출력 예 #1
	
	"onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.
 */
/*
 * 1. replace 메서드를 이용하여 영어를 숫자로 변환한다. (3번째 줄 ~ 13번째 줄)
	2. String 타입을 long 타입으로 변환한다. (15번째 줄)
 	* 참고 replaceAll 메서드는 정규표현식 사용시 이용할 수 있습니다.
 */
package com.moon.main;

public class Sol01 {
	public static long solution(String numbers) {
		String string_num = numbers
	            .replace("zero", "0")
	            .replace("one", "1")
	            .replace("two", "2") 
	            .replace("three", "3")
	            .replace("four", "4")
	            .replace("five", "5")
	            .replace("six", "6")
	            .replace("seven", "7")
	            .replace("eight", "8")
	            .replace("nine", "9");

	        long answer = Long.parseLong(string_num);
	        return answer;
    }

    public static void main(String[] args) {

        String numbers1 = "onetwothreefourfivesixseveneightnine";
        long result1 = solution(numbers1);
        System.out.println(result1); // 예상 결과: 123456789

        String numbers2 = "onefourzerosixseven";
        long result2 = solution(numbers2);
        System.out.println(result2); // 예상 결과: 14067
    }
}
