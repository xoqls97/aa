package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총30칸을 이동하면 완주
		 * 주사위:1~6까지 랜덤수
		 * ex) 주사위:3 => 3칸이동=>27칸남았습니다.
		 *     주사위:6 => 6칸이동=>??칸 남았습니다.
		 *     ..
		 *     도착~!! 총 이동 횟수 : 8번 완주
		 *     
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("주사위를 굴리시려면 1을 입력하세요");
		int cnt = 0;
		int num = scan.nextInt();
		       if(num ==1) {
		    	   a: for(int i=1;cnt<30;i++) {
		    		   int random = (int)(Math.random()*6)+1;
		    		   System.out.println("주사위 값은"+random+"입니다");
		    		   System.out.println(random+"칸이동합니다.");
		    		   cnt +=random;
		    		   System.out.println("남은 이동 거리는 "+(30-cnt)+", 굴린 주사위 횟수는 "+i+"입니다");
		    		   if(30-cnt<=0) {
		    			   System.out.println("완주입니다,총 주사위굴린 횟수는 "+i+"입니다");
		    			   
		    			   break a;
		    		   }
		    		   System.out.println("다시 주사위를 굴리려면 '1'을 입력하세요");
		    		   num=scan.nextInt();
		    		   
		    	   }

		       }else {
		    	   System.out.println("잘못된입력 다시입력");
		       }
				scan.close();

	}

}
