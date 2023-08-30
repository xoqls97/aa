package day07;

public class Method04 {

	public static void main(String[] args) {
 
		/* 메서드 : 기능을 하기위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * ......(실행x)
		 * }
		 * 
		 * return : 메서드에서 전달해야하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴 타입의 값을 전달하고 메서드를 종료 
		 * */

		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드(정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 ( 평균을 리턴)
		 * 3. 배열의 5개와 평균을 출력하는 메서드 (출력 리턴x)
		 * 메인에서는 연산식이 있으면 안됨.
		 * */

	
 sys();
	
	
	}
		public static int[] arr() {
			int ar[] = new int[5];
			for(int i=0; i<ar.length; i++) {
				int r = (int)(Math.random()*100)+1;
				ar[i]=r;
				
			
			}
			return ar;
		}
			
		public static double avg() {
			int a []= arr();
			int sum =0;
			for(int i=0; i<a.length; i++) {
				sum+=a[i];
			}
			double avg=(double)sum/a.length;
			return avg;
		}
		
		public static void sys() {
			int a [] = arr();

			for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			double b = avg();
			System.out.println("평균:"+b);
				
				
				
				
		}
		
		
	

}
