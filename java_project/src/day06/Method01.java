package day06;

public class Method01 {

	//메서드 선언 위치
	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수
		 * 접근제어자(제한자) : 접근 할 수 있는 주체의 제한범위
		 * 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드의 이름 => 소문자로 시작
		 * 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수명)
		 * 메서드 선언구현
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수, 매개변수){
		 * 구현;
		 * }
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * 4번 또는 21번 위치
		 * */
		int sum= sum(3,5);
		System.out.println(sum);

		int sum1 = sum(sum, 2);
		System.out.println(sum1);
		int mul = mul(4,5);
		System.out.println(mul);
		int mul1 = mul(mul,12);
		System.out.println(mul1);
		
		System.out.println();
		System.out.println("---------");
		
		sum2(10,20);
	}
//    메서드 선언위치
	/*기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는것 => 합 (int)
	 * 매개변수 : 두 정수=>int num1, int num2
	 * 메서드명 : sum
	 * */
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
		/*두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
		 * 리턴타입: 곱 int
		 * 매개변수: 두 정수 =>int num3 int num4
		 * 메서드명 : mul 
		 **/
    public static int mul(int num3, int num4) {
    	
    	return num3*num4;
    }
    /* 기능 : 두 정수가 주어지면 두정수의 합을 출력하는 메서드
     * 리턴타입 : 없음 (void)
     * 매개변수 : 두정수(int num1, int num2)
     * 메서드 명 : sum2
     * 결과를 다른 값에 이용을 하려면 return이 필요
     * */
    public static void sum2(int num1, int num2) {
    	System.out.println(num1 + num2);
    }
	
}
