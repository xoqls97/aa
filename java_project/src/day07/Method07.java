package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {

		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex) 3, * => ***
		 * ex) 5, o => ooooo
		 * ex) 7, ☆ => ☆☆☆☆☆☆☆
		 * main에서 숫자와 기호를 입력받아 메서드에서 출력
		 * */

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자와 기호 ㄱ");
		int a = scan.nextInt();
		String b = scan.next();
		a(a,b);
		scan.close();
	}
	public static void a(int num, String str) {
		for(int i=1; i<=num; i++) {
			System.out.print(str);
		}
	}
	
}