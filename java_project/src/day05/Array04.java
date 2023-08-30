package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/*5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19547 => 74591 => 1+9+5+4+7
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
				int num = scan.nextInt();
				int arr[] = new int[5];
//				나누기(/), 나머지(%)
//				12345=> %10 => 5 =>배열에 저장
//				값을 나눈 몫만 다시 나눌값으로 지정
//				12345 / 10 => 정수만 저장
//				1234 = %10 => 4 => 배열에 저장
//				123=>%10=>3=>배열에 저장...
				
	    int sum=0;
	    int i=0;
	    while(num>0) { //입력받은 num가 0보다 작아지면 false로 끝
	    	int b = num %10; //마지막 자리를 나머지로 받기
	    	arr[i]=b;
	    	sum+=b;
	    	num= num/10; //몫 저장=> 정수/정수=정수

	    	System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    System.out.println("합계: "+sum);
			
		scan.close();

		
		
	}

}
