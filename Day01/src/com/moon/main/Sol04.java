/**
 * 대소문자 바꿔서 출력하기
	문제 설명
	영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
	
	제한사항
	1 ≤ str의 길이 ≤ 20
	str은 알파벳으로 이루어진 문자열입니다.
	입출력 예
	입력 #1
	
	aBcDeFg
	출력 #1
	
	AbCdEfG
 */
package com.moon.main;

import java.util.Scanner;

public class Sol04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] array = a.toCharArray();

        for (int i = 0; i < a.length(); ++i) {
            if ((int)array[i] >= 97) {
                array[i] -= 32;
            }
            else {
                array[i] += 32;
            }
        }
        String new_a = new String(array);
        System.out.println(new_a);
	}

}
