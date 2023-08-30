package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// 
		
		for(int i=1; ; i++) {
			System.out.print(i+" ");
			if(i == 10) {
				break;
			}
		}
		
		/*한글자를 입력받아서 글자를 그대로 출력 (반복해서 출력_
		 * y를 입력받으면 종료
		 * a->a, b->b, ... y -> 종료
		 * */
		System.out.println();
		System.out.println("---------------");
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			char ch = scan.next().charAt(0);
			if(ch=='y') {
				break;
			}
			System.out.println(ch);
		}
		
		
		
		
		
		scan.close();

	}

}
