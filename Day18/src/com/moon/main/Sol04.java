/**
 * 문자열 바꿔서 찾기
	문제 설명
	문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, 
	"B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 
	solution 함수를 완성하세요.
	
	제한사항
	1 ≤ myString의 길이 ≤ 100
	1 ≤ pat의 길이 ≤ 10
	myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.
	입출력 예
	myString	pat	result
	"ABBAA"	"AABB"	1
	"ABAB"	"ABAB"	0
	입출력 예 설명
	입출력 예 #1
	
	"ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다. 여기에는 부분문자열 "AABB"가 있기 때문에 
	1을 return 합니다.
	입출력 예 #2
	
	"ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다. 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.
 */
package com.moon.main;

public class Sol04 {
	 public static int solution(String myString, String pat) {
	        // "A"를 "B"로, "B"를 "A"로 바꾸기
	        String transformedString = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');

	        // pat을 포함하는지 확인
	        if (transformedString.contains(pat)) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        String myString1 = "ABBAA";
	        String pat1 = "AABB";
	        int result1 = solution(myString1, pat1);
	        System.out.println(result1);

	        String myString2 = "ABAB";
	        String pat2 = "ABAB";
	        int result2 = solution(myString2, pat2);
	        System.out.println(result2);
	    }
}
