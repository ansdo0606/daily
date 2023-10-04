/**
 * 한 번만 등장한 문자
	문제 설명
	문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 
	solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
	
	제한사항
	0 < s의 길이 < 1,000
	s는 소문자로만 이루어져 있습니다.
	입출력 예
	s	result
	"abcabcadc"	"d"
	"abdc"	"abcd"
	"hello"	"eho"
	입출력 예 설명
	입출력 예 #1
	
	"abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
	입출력 예 #2
	
	"abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
	입출력 예 #3
	
	"hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
 */
package com.moon.main;

import java.util.*;

public class Sol03 {
	 public static String solution(String s) {
	        Map<Character, Integer> charCount = new HashMap<>();

	        // 문자열에서 각 문자의 등장 횟수를 카운트합니다.
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        // 한 번만 등장하는 문자들을 저장할 리스트 생성
	        List<Character> uniqueChars = new ArrayList<>();
	        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	            if (entry.getValue() == 1) {
	                uniqueChars.add(entry.getKey());
	            }
	        }

	        // 리스트를 사전 순으로 정렬합니다.
	        Collections.sort(uniqueChars);

	        // 결과 문자열을 생성합니다.
	        StringBuilder result = new StringBuilder();
	        for (char c : uniqueChars) {
	            result.append(c);
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {

	        String s1 = "abcabcadc";
	        String result1 = solution(s1);
	        System.out.println(result1); // 예상 결과: "d"

	        String s2 = "abdc";
	        String result2 = solution(s2);
	        System.out.println(result2); // 예상 결과: "abcd"

	        String s3 = "hello";
	        String result3 = solution(s3);
	        System.out.println(result3); // 예상 결과: "eho"
	    }
}
