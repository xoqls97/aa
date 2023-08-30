package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수
		 * 
		 * */
		/*num을 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num =13 -> 소수입니다.
		 *    num=12->소수가아닙니다
		 * 
		 * */
//      Scanner scan = new Scanner(System.in);
//      int num=scan.nextInt();
//      int count=0;
//      for(int i=1; i<=num; i++) {
//    	  if(num%i==0) {
//    		   //System.out.print(i+" ");
//    		  //약수의 개수
//    		  count = count+1; //count++;
//    	  }
//    	  
//      }
//      
//      
//      if(count==2) {
//    	  System.out.println("소수");
//      }else {
//    	  System.out.println("소수가아닙니다.");
//      }
//      
//      
//      
//      
//      scan.close();
		// 2~100까지 중 소수를 출력 
	 
		int count = 0;
		 count = 0;// 각 ㄴmim                                                   
		for(int i=2; i<=100; i++) {
		
			for(int j=1;i<=j;j++)    {   //약수를 구하기 위해 돌리는 값.
				
			 if(i%j ==0)
				 count++;
			
			}
			if(count ==2) {
				System.out.println(i);
				
			
		}

		}

	
				

	}

}

