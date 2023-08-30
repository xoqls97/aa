package day06;

public class Method02 {

	public static void main(String[] args) {
		/*메서드를 활용하여 계산기를 작성
		 * 
		 *  메서드는 + - x / %
            두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
            + 일때 호출
            - 일때 호출
            % 일때 호출 메서드에서 출력
            x 일때 호출 메서드에서 출력
            / 일때 호출 메서드에서 출력 => 리턴을 double		 
		 */  
		int sum = sum(3,5);
		 System.out.println(sum);

		 int min = min(3,5);
		 System.out.println(min);
		 mul(3,5);
		 div(3,5);
		 per(3,5);
//		 Method01.sum(10, 30)//Method01 클래스에서 정의함

	}// 다른 클래스에 있는 메서드를 사용(static 있는경우)
//	클래스명.메서드명
//	클래스 => 정의서 =? 객체를 생성해서 메서드를 사용
	// 현재 시점에서 객체 생성없이 메서드를 사용할 수잇는 이유는 static
	// (static이 없는 경우) = 선언만 해놓고 생성이 안되어있다는 것을앎
	//
	
	public static int sum(int num1, int num2) {
		return num1 + num2; 
	}
	public static int min(int num1, int num2) {
		return num1 - num2;
	}
	public static void mul(int num1, int num2) {
	
		System.out.println(num1*num2);
	}
	public static void div(double num1, double num2) {
		System.out.println(num1/num2);
		
	}
	public static void per(int num1, int num2) {
		System.out.println(num1%num2);
		
	}


}
