package day04;

public class Continue {

	public static void main(String[] args) {
		/* Continue : pass, skip 키워드 의미
		 *  1~10까지 출력 5만 빼고
		 * */
		
		for(int i =1; i<=10; i++) {
			if(i==5) {
				continue; // 조건에 맞다면 건너 뛰어라.
				
			}
			System.out.print(i+" ");
			
		}
		/* 홀수만 출력
		 * 짝수일 때 continue를 써서 출력
		 * */
		System.out.println();
		System.out.println("---------------");
		for(int i =1; i<=10; i++) {
			if(i%2 ==0) {
				continue;
		  	}
			System.out.print(i+" ");
		}

	}

}
