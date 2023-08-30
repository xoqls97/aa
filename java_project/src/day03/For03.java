package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 숫자를 입력받아서 구구단을 출력


	   
		Scanner scan = new Scanner(System.in);
		 System.out.println("수를입력하세요");
		 int a = scan.nextInt();
		 int b;
		 for(int i =1; i<10;i++) {
			b= a * i;
			System.out.println(a+"*"+i+"="+b);
			
		 }
		
		
	scan.close();
	
	
	
	}

}
