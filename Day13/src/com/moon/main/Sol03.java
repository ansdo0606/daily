/**
 * 왼쪽 오른쪽
	문제 설명
	문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. 
	str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 
	문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 
	문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 
	빈 리스트를 return합니다.
	
	제한사항
	1 ≤ str_list의 길이 ≤ 20
	str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
	입출력 예
	str_list	result
	["u", "u", "l", "r"]	["u", "u"]
	["l"]	[]
	입출력 예 설명
	입출력 예 #1
	
	"r"보다 "l"이 먼저 나왔기 때문에 "l"의 왼쪽에 있는 문자열들을 담은 리스트인 ["u", "u"]를 return합니다.
	입출력 예 #2
	
	"l"의 왼쪽에 문자열이 없기 때문에 빈 리스트를 return합니다.
 */
package com.moon.main;

import java.util.ArrayList;

public class Sol03 {
	    public String[] solution(String[] str_list) {

	        ArrayList<String> answerList = new ArrayList<>();
	        int targetIndex = -1;
	        String firstAppear = "";

	        // l과 r중 무엇이 먼저 나왔는지, 몇 번째 인덱스인지 찾는다
	        for(int i = 0; i < str_list.length; i++){
	            if(str_list[i].equals("l") ||str_list[i].equals("r")){
	                targetIndex = i;
	                firstAppear = str_list[i];
	                break;
	            }
	        }


	        // l또는 r 둘 다 없으면 빈문자열 리턴 -> 문제의 문장이 좀 모호해서 수정해봄
	        if(firstAppear.equals("")){
	            return new String[0];
	        }
	        // l이 먼저 나왔다면 왼쪽의 것을 담는다 -> l의 인덱스가 0이면 자연스럽게 빈 리스트
	        if(firstAppear.equals("l")){            
	            for(int i = 0; i < str_list.length; i++){
	            if(i < targetIndex){
	                answerList.add(str_list[i]);
	            }
	        }
	        }
	        // r이 먼저 나왔다면 그 오른쪽의 것을 담는다 -> r이 마지막 인덱스여도 자연스럽게 빈 리스트
	        if(firstAppear.equals("r")){
	           for(int i = 0; i < str_list.length; i++){
	            if(i > targetIndex){
	                answerList.add(str_list[i]);
	            } 
	        }

	        }

	        String[] answer = answerList.toArray(new String[answerList.size()]);
	        return answer;
	    }
	    public static void main(String[] args) {
	    	Sol03 solution = new Sol03();
	        
	        String[] str_list1 = {"u", "u", "l", "r"};
	        String[] result1 = solution.solution(str_list1);
	        for (String str : result1) {
	            System.out.print(str + " ");
	        }
	        System.out.println(); // "u u "
	        
	        String[] str_list2 = {"l"};
	        String[] result2 = solution.solution(str_list2);
	        for (String str : result2) {
	            System.out.print(str + " ");
	        }
	        System.out.println(); // ""
	    }
	}
