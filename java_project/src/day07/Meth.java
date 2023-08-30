package day07;

public class Meth {

	public static void main(String[] args) {
		// 랜덤 생성 메서드 호출
		int arr[] = random();
		double avg= average(arr);
		print(arr, avg);

	}
	public static int [] random() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100)+1;
		}
	
		return arr;
	}
	/* 배열을 전달받아서 평균을 연산하;는 메서드( 평균을 리턴)
	 * 리턴타입 : 평균을 리턴 => double
	 * 매개변수 : 배열 =>int arr[]
	 * 메서드명 : average
	 * */
	public static double average(int arr[]) {//랜덤수를 생성한 배열이 이미 있다.
		//계산만 하면됨
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return (double) sum / arr.length;
	}
	/* 배열의 정수 5개와 평균을 출력하는 메서드(출력)
	 * 리턴타입 : void(없음)
	 * 매개변수 : 정수배열, 평균
	 * 메서드명 : print
	 * */
	public static void print(int arr[], double avg) {
 
		System.out.print("5개의 랜덤 정수: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("평균: "+avg);
		
	}
		
		
		

}
