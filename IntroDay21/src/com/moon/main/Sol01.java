/**
 * 숨어있는 숫자의 덧셈 (2)
	문제 설명
	문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
	my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ my_string의 길이 ≤ 1,000
	1 ≤ my_string 안의 자연수 ≤ 1000
	연속된 수는 하나의 숫자로 간주합니다.
	000123과 같이 0이 선행하는 경우는 없습니다.
	문자열에 자연수가 없는 경우 0을 return 해주세요.
	입출력 예
	my_string	result
	"aAb1B2cC34oOp"	37
	"1a2b3c4d123Z"	133
	입출력 예 설명
	입출력 예 #1
	
	"aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.
	입출력 예 #2
	
	"1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다. 따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.List;

public class Sol01 {
	 public static int solution(String my_string) {
	        List<Integer> numbers = new ArrayList<>();
	        int temp = 0;
	        for (int i = 0; i < my_string.length(); i++) {
	            char ch = my_string.charAt(i);
	            if (Character.isDigit(ch)) {
	                temp = temp * 10 + Character.getNumericValue(ch);
	            } else {
	                if (temp > 0) {
	                    numbers.add(temp);
	                    temp = 0;
	                }
	            }
	        }
	        if (temp > 0) {
	            numbers.add(temp);
	        }
	        return numbers.stream().reduce(0, Integer::sum);
	    }

	    public static void main(String[] args) {
	        String myString1 = "aAb1B2cC34oOp";
	        String myString2 = "1a2b3c4d123Z";

	        int result1 = solution(myString1);
	        int result2 = solution(myString2);

	        System.out.println(result1); // 37
	        System.out.println(result2); // 133
	    }
}
