package day09;

public class MethodEx02 {

	public static void main(String[] args) {

		//두 정수의 사칙연산(+ - / * %)을 처리
	
		MethodEx02 me = new MethodEx02();
		int a=3,b=5;
		me.sum(a,b);
		int sub = me.sub(a,b);
		int mul = me.mul(a,b);
		int div = me.div(a,b);
		int rem = me.rem(a,b);
	    System.out.println(sub);
	    System.out.println(mul);
	    System.out.println(div);
	    System.out.println(rem);
		
		
	}
	
	// 사칙 연산의 메서드 생성 no static
	public void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public int div(int num1, int num2) {
		return num1/num2;
	}
	public int rem(int num1, int num2) {
		return num1%num2;
	}
	

}
