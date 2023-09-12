/**
 * 0 떼기
	문제 설명
	정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 
	return하도록 solution 함수를 완성해주세요.
	
	제한사항
	2 ≤ n_str ≤ 10
	n_str이 "0"으로만 이루어진 경우는 없습니다.
	입출력 예
	n_str	result
	"0010"	"10"
	"854020"	"854020"
	입출력 예 설명
	입출력 예 #1
	
	"0010"의 가장 왼쪽에 연속으로 등장하는 "0"을 모두 제거하면 "10"이 됩니다.
	입출력 예 #2
	
	"854020"는 가장 왼쪽에 0이 없으므로 "854020"을 return합니다.
 */
package com.moon.main;

public class Sol01 {
	public String solution(String n_str) {
        // 문자열을 문자 배열로 변환
        char[] chars = n_str.toCharArray();

        // 가장 왼쪽에 있는 연속된 "0"을 찾아 제거
        int startIndex = 0;
        while (startIndex < chars.length && chars[startIndex] == '0') {
            startIndex++;
        }

        // 남은 부분을 새로운 문자열로 만들어 반환
        return new String(chars, startIndex, chars.length - startIndex);
    }

    public static void main(String[] args) {
    	Sol01 solution = new Sol01();
        String n_str1 = "0010";
        String result1 = solution.solution(n_str1);
        System.out.println(result1); // 예상 출력: "10"

        String n_str2 = "854020";
        String result2 = solution.solution(n_str2);
        System.out.println(result2); // 예상 출력: "854020"
    }
}
