/**
 * 옹알이 (1)
	문제 설명
	머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 
	네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 
	매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ babbling의 길이 ≤ 100
	1 ≤ babbling[i]의 길이 ≤ 15
	babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
	즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
	문자열은 알파벳 소문자로만 이루어져 있습니다.
	입출력 예
	babbling										result
	["aya", "yee", "u", "maa", "wyeoo"]				1
	["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]		3
	입출력 예 설명
	입출력 예 #1
	
	["aya", "yee", "u", "maa", "wyeoo"]에서 발음할 수 있는 것은 "aya"뿐입니다. 따라서 1을 return합니다.
	입출력 예 #2
	
	["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]에서 발음할 수 있는 것은 "aya" + "ye" = "ayaye", 
	"ye", "ye" + "ma" + "woo" = "yemawoo"로 3개입니다. 따라서 3을 return합니다.
	유의사항
	네 가지를 붙여 만들 수 있는 발음 이외에는 어떤 발음도 할 수 없는 것으로 규정합니다. 예를 들어 "woowo"는 
	"woo"는 발음할 수 있지만 "wo"를 발음할 수 없기 때문에 할 수 없는 발음입니다.
 */
package com.moon.main;

public class Sol03 {
	public static int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0 ; i < babbling.length ; i++){
            String b = babbling[i];
            b = b.replace("aya","___");
            b = b.replace("ye","__");
            b = b.replace("woo","___");
            b = b.replace("ma","__");
            b = b.replace("_","");
            if(b.equals("")){
                answer = answer + 1;
            }

        }
        return answer;
    }
	public static void main(String[] args) {

        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        int result1 = solution(babbling1);
        System.out.println(result1); // Output: 1

        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int result2 = solution(babbling2);
        System.out.println(result2); // Output: 3
    }
}
