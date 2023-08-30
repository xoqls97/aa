package day04;

public class While02 {

	public static void main(String[] args) {
		// 2 4 6 8 10
		// 12 14 16 18 20
		// 22 24 26 28 30
		//1~ 50 까지 짝수만 출력
		//5개씩 한줄로
		
		
		int i = 0;
		while(i<=50) {
			i++;
			if(i%2==1){
				continue;
				
			}
			System.out.print(i+" ");
			if(i%10==0){
				System.out.println();
				
			}
			
		}
		System.out.println();
		System.out.println("--------------");
		for(int a=1; a<=50; a++) {
			if(a%2==0) {
				System.out.printf("%3d",a);
			}
			if(a%10==0) {
				System.out.println();
			}
		
		
		
		}
		
		System.out.println();
		System.out.println("-----------");
		
//		System.out.println (): 줄바꿈을 포함하는 출력 
//		System.out.print (): 줄바꿈이 없는 출력 =>괄호안에 값이없으면 에러
//		system.out.printf (): 지시자를 이용한 출력
//		서식 지정자를 통해 출력할 데이터의 서식을 지정할 수 있음.
//		%n(\n 줄바꿈),%d(정수형),%f(실수형), %c(문자), %s(문자열)
//		소수점 설정, 공백(띄어쓰기) 설정 가능
         
		int num1=5;
		int num2=3;
		// 5 + 3 = 8
		System.out.printf("%d + %d = %d\n",num1, num2, num1+num2);
		
		double num3 = 1.23;
		double num4 = 5;
//	    1.23 / 5 = 값
		System.out.printf("%.1f / %.1f = %.1f",num3,num4,(num3/num4));
		
		
		
		
		
		
		
	}

}
