/**
 * 문자열이 몇 번 등장하는지 세기
	문제 설명
	문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 
	함수를 완성해 주세요.
	
	제한사항
	1 ≤ myString ≤ 1000
	1 ≤ pat ≤ 10
	입출력 예
	myString	pat	result
	"banana"	"ana"	2
	"aaaa"	"aa"	3
	입출력 예 설명
	입출력 예 #1
	
	"banana"에서 1 ~ 3번 인덱스에서 한 번, 3 ~ 5번 인덱스에서 또 한 번 "ana"가 등장해서 총 두 번 등장합니다. 
	따라서 2를 return 합니다.
	입출력 예 #2
	
	"aaaa"에서 0 ~ 2번 인덱스에서 한 번, 1 ~ 3번 인덱스에서 한 번, 2 ~ 4번 인덱스에서 한 번 "aa"가 등장해서 
	총 세 번 등장합니다. 따라서 3을 return 합니다.
 */
package com.moon.main;

public class Sol02 {
	public int solution(String myString, String pat) {
        int count = 0;
       int index = myString.indexOf(pat); // pat이 처음 등장하는 인덱스

       // myString 내에서 pat을 찾을 때마다 반복
       while (index != -1) {
           count++;
           // 다음 검색을 시작할 위치를 갱신
           index = myString.indexOf(pat, index + 1);
       }

       return count;
   }
	public static void main(String[] args) {
		Sol02 solution = new Sol02();

        // 예제 1
        String myString1 = "banana";
        String pat1 = "ana";
        int result1 = solution.solution(myString1, pat1);
        System.out.println(result1);

        // 예제 2
        String myString2 = "aaaa";
        String pat2 = "aa";
        int result2 = solution.solution(myString2, pat2);
        System.out.println(result2);
    }
}
