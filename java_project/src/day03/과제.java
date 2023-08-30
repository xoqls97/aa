package day03;
import java.util.Scanner;
public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50 사이의 랜덤 수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤으로 수 생성 : 35
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력>40
		 * down~!!
		 * 입력>35
		 * 정답~!!
		 * */
		 // 0은포함, 1은미포함
	     Scanner scan = new Scanner(System.in);
	
	     
	     int random = (int)(Math.random()*50)+1;
	     System.out.println(random);//정답확인
	     System.out.println("수를 입력하세요");
	     for(;;) {
	    	 
	    	 int a = scan.nextInt();
	    	 if(a>random) {
	    		 System.out.println("작은수를입력하세요");
	    	 }else if(random>a) {
	    		 System.out.println("큰수를 입력하세요");
	    		 
	    	 }else {
	    		 System.out.println("정답");
	    		 break;
	    	 }
	    	 
	     }
	     
	     scan.close();
	
		

	}

}
