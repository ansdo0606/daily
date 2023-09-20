/**
 * 양꼬치
	문제 설명
	머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 
	음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 
	총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	0 < n < 1,000
	n / 10 ≤ k < 1,000
	서비스로 받은 음료수는 모두 마십니다.
	입출력 예
	n	k	result
	10	3	124,000
	64	6	768,000
	입출력 예 설명
	입출력 예 #1
	
	10인분을 시켜 서비스로 음료수를 하나 받아 총 10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원입니다.
	입출력 예 #2
	
	64인분을 시켜 서비스로 음료수를 6개 받아 총 64 * 12000 + 6 * 2000 - 6 * 2000 =768,000원입니다.
 */
package com.moon.main;

public class Sol03 {
	 public static int solution(int n, int k) {
		    int yakitoriPrice = 12000; // 양꼬치 1인분 가격
		    int drinkPrice = 2000; // 음료수 가격

		    // 양꼬치 가격 계산
		    int totalYakitoriPrice = n * yakitoriPrice;

		    // 서비스 음료수 개수 계산
		    int freeDrinks = n / 10;

		    // 실제로 지불해야 하는 음료수 가격 계산 (서비스 음료수를 제외한 음료의 가격)
		    int actualDrinkPrice = (k- freeDrinks) * drinkPrice ;

		    // 총 가격 계산 (양꼬치 가격과 실제 음료수 가격을 합칩니다)
		    int totalPrice = totalYakitoriPrice + actualDrinkPrice;

		    return totalPrice;
		    }
	 public static void main(String[] args) {
	        // 예제 1
	        int n1 = 10;
	        int k1 = 3;
	        int result1 = solution(n1, k1);
	        System.out.println(result1);

	        // 예제 2
	        int n2 = 64;
	        int k2 = 6;
	        int result2 = solution(n2, k2);
	        System.out.println(result2);
	    }
}
