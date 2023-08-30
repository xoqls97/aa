package day02;


public class Swtch01 {

	public static void main(String[] args) {
		/* switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * switch(변수 / 식){
		 * case 값1 : 실행문1; break;
		 * case 값2 : 실행문2; break;
		 * case 값3 : 실행문3; break;
		 * default : 나머지 실행문; //마지막은 break를 안해도댐
		 * }
		 * break; : switch문을 빠져나갈 때 사용
		 * */

		int num =2 ;
		switch(num) {
		case 1:
			System.out.println("num는 1입니다.");
			break;
		case 2:
			System.out.println("num는 2입니다.");
			break;
		case 3:
			System.out.println("num는 3입니다.");
			break;
			default:
				System.out.println("잘못된 입력");
				}
		
		//1~6까지의 수를 랜덤으로 추출하여 주사위 : 1칸 전진 출력
		// (0*6) ~ (1*6)+1 => 1~6까지 
		int num1;
		num1= (int)(Math.random()*7)+1;
		switch(num1) {
		case 1:
			System.out.println("주사위 1이 나왔습니다.");
			System.out.println("1칸전진");
			break;
		case 2:
			System.out.println("주사위 2이 나왔습니다.");
			System.out.println("2칸전진");
			break;
		case 3:

			System.out.println("주사위 3이 나왔습니다.");
			System.out.println("3칸전진");
			break;
		case 4:

			System.out.println("주사위 4가 나왔습니다.");
			System.out.println("4칸전진");
			break;
		case 5:

			System.out.println("주사위 5가 나왔습니다.");
			System.out.println("5칸전진");
			break;
		case 6:

			System.out.println("주사위 6이 나왔습니다.");
			System.out.println("6칸전진");
			break;
			default:
				System.out.println("다시던져");
		}
       		
		
		
	}

}
