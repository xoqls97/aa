package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6 의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수: 1236
		 * 12의 약수: 1 2 3 4 6 12
		 * */
        // 6/1=0, 6/2=0, 6/3=0, 6/4=2........6/6=0
		//1부터 num까지 1씩증가
	
	     int num=14;	
		for(int i = 1; i<=num; i++) {
			if(num%i ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("-------------");
		int num1 = 6;
		for(int i=1; i<=num1; i++) {
		     
			switch(num1 %i) {
			case 0 :
				System.out.print(i+" ");
				break;
		
						
			}
		
		}
		
		System.out.println();
		System.out.println("-----------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		
		int num2 =scan.nextInt();
		
		for(int i=1; i<=num2 ; i++) {
			switch(num2%i) {
			
			case 0 :
				System.out.println(i);
				break;

		}
		}
				
				
				
				
				
				
				
				
				
				
				
               scan.close();

		
	
	
	}

}
