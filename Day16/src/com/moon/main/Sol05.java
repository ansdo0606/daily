/**
 * 특정한 문자를 대문자로 바꾸기
	문제 설명
	영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, 
	my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	1 ≤ my_string의 길이 ≤ 1,000
	입출력 예
	my_string	alp	result
	"programmers"	"p"	"Programmers"
	"lowercase"	"x"	"lowercase"
	입출력 예 설명
	입출력 예 #1
	
	예제 1번의 my_string은 "programmers"이고 alp가 "p"이므로 my_string에 모든 p를 
	대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.
	입출력 예 #2
	
	예제 2번의 alp는 "x"이고 my_string에 x는 없습니다. 따라서 "lowercase"를 return 합니다.
 */
package com.moon.main;

public class Sol05 {
	public String solution(String my_string, String alp) {
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (String.valueOf(c).equals(alp)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
	public static void main(String[] args) {
		Sol05 solution = new Sol05();
        String myString1 = "programmers";
        String alp1 = "p";
        String result1 = solution.solution(myString1, alp1);
        System.out.println(result1); // "Programmers"

        String myString2 = "lowercase";
        String alp2 = "x";
        String result2 = solution.solution(myString2, alp2);
        System.out.println(result2); // "lowercase"
    }
}
