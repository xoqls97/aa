package day03;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		// 최대공약수 찾기
		// 약수 : 1부터 자기 자신까지 나누어서 떨어지는 수
		// 공약수 : 두 정수의 공통된 약수
		// 최대공약수 : 공약수 중 갖아 큰 값
		// 두 정수 num1, num2를 입력받아 최대 공약수를 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 수를입력");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int a=0;
		for(int i =1; i<=num1; i++) {
			if(num1%i ==0 && num2%i == 0){
				//i => 공약수
				a=i;
				
				
				
			}
		}
		System.out.println(a);
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
	     * break; 
	     * 중첩 for문일 경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
	     * 벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 벗어날 수 있음
		 * */
		
		for(int i = num1 ; ; i--) {
			if(num1 % i == 0 && num2%i==0) {
				a = i;
				System.out.println("두 수의 최대공약수: " + i);
				break;
			}
		}
		
	
		
		
		
		
		
	
		
		
       		scan.close();
       	
		
		
		
		
	}

}
