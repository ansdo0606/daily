/**
 * 가위 바위 보
	문제 설명
	가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, 
	rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
	
	제한사항
	0 < rsp의 길이 ≤ 100
	rsp와 길이가 같은 문자열을 return 합니다.
	rsp는 숫자 0, 2, 5로 이루어져 있습니다.
	입출력 예
	rsp	result
	"2"	"0"
	"205"	"052"
	입출력 예 설명
	입출력 예 #1
	
	"2"는 가위이므로 바위를 나타내는 "0"을 return 합니다.
	입출력 예 #2
	
	"205"는 순서대로 가위, 바위, 보이고 이를 모두 이기려면 바위, 보, 가위를 순서대로 내야하므로 “052”를 return합니다.
 */
package com.moon.main;

public class Sol03 {
	public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        int length = rsp.length();

        // "0"는 바위, "2"는 가위, "5"는 보에 대응합니다.
        // 모든 경우를 이기는 순서는 "0" -> "5" -> "2" 입니다.
        for (int i = 0; i < length; i++) {
            if (rsp.charAt(i) == '0') {
                result.append("5"); // 바위(0)을 이깁니다.
            } else if (rsp.charAt(i) == '5') {
                result.append("2"); // 보(5)를 이깁니다.
            } else if (rsp.charAt(i) == '2') {
                result.append("0"); // 가위(2)를 이깁니다.
            }
        }

        return result.toString();
    }
	public static void main(String[] args) {
		Sol03 solution = new Sol03();

        String rsp1 = "2";
        String result1 = solution.solution(rsp1);
        System.out.println(result1); // "0"

        String rsp2 = "205";
        String result2 = solution.solution(rsp2);
        System.out.println(result2); // "052"
    }
}
