/**
 * 원하는 문자열 찾기
	문제 설명
	알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 
	pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
	
	단, 알파벳 대문자와 소문자는 구분하지 않습니다.
	
	제한사항
	1 ≤ myString의 길이 ≤ 100,000
	1 ≤ pat의 길이 ≤ 300
	myString과 pat은 모두 알파벳으로 이루어진 문자열입니다.
	입출력 예
	myString	pat	return
	"AbCdEfG"	"aBc"	1
	"aaAA"	"aaaaa"	0
	입출력 예 설명
	입출력 예 #1
	
	"AbCdEfG"의 0~2번 인덱스의 문자열은 "AbC"이며, 이는 pat인 "aBc"와 같습니다. 따라서 1을 return 합니다.
	입출력 예 #2
	
	myString의 길이가 pat보다 더 짧기 때문에 myString의 부분 문자열 중 pat와 같은 문자열이 있을 수 없습니다. 
	따라서 0을 return 합니다.
 */
package com.moon.main;

public class Sol05 {
	 public static int solution(String myString, String pat) {
	        // 대소문자를 구분하지 않고 비교하기 위해 모두 소문자로 변환
	        myString = myString.toLowerCase();
	        pat = pat.toLowerCase();

	        int myStringLength = myString.length();
	        int patLength = pat.length();

	        // 부분 문자열을 비교하면서 pat이 존재하는지 확인
	        for (int i = 0; i <= myStringLength - patLength; i++) {
	            if (myString.substring(i, i + patLength).equals(pat)) {
	                return 1;
	            }
	        }

	        // pat을 찾지 못한 경우 0을 반환
	        return 0;
	    }
	  public static void main(String[] args) {
	        String myString1 = "AbCdEfG";
	        String pat1 = "aBc";
	        int result1 = solution(myString1, pat1);
	        System.out.println(result1);

	        String myString2 = "aaAA";
	        String pat2 = "aaaaa";
	        int result2 = solution(myString2, pat2);
	        System.out.println(result2);
	    }
}
