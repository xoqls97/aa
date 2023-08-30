package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {

		/* day08 과제 -> 메서드로 변경
		 * 랜덤번호 생성
		 * 배열에 추가(중복제거 메서드)
		 * 출력메서드
		 * 스트라이크 메서드 => 개수리턴
		 * 볼 메서드 => 개수리턴
		 * 
		 * 
		 * 
		 * */

		int comNum [] = new int [3];
		int myNum [] = new int [3];
		
	
	//랜덤수 범위
	Scanner scan = new Scanner(System.in);
	int count = 9;
	int start =3;
	int s=0, b=0;
	int cnt = 0; //게임횟수
	randomArray(comNum,count,start);
	System.out.println("야구시작");
	System.out.println("컴퓨터가 수를정해슴");
	while(s!=3) {
		//사용자 번호받기
		System.out.println("1~9까지 숫자 3개입력");
		for(int i=0; i<myNum.length; i++) {
			myNum[i] = scan.nextInt();
		}
		cnt++; //게임횟수 증가
		
	//결과출력
		s= strike(comNum, myNum);
		b = ball(comNum, myNum);
		
		if( s!=0) {
			System.out.println(s+"s ");
			
		}if(b!=0) {
			System.out.println(b+"b ");
		}

		System.out.println(); //줄바꿈
		System.out.println("게임횟수: "+cnt);
		if(s==0 && b==0) {
			System.out.println("out");
		}
			
	}
}
	
	
	
	
	/* 랜덤번호 생성 : 매개변수로 범위를 설정
	 * 매개변수 => 개수, 시작값
	 * if처리 => 개수와 시작값이 바뀌어서 들어올 때 처리
	 * */
	public static int random(int count, int start) {
		if(count < start) { //값이 바뀌어서 들어오는 경우
			int tmp = count;
			count = start;
			start = tmp;
		}
		return (int)(Math.random()*count)+start;
	}
	//중복확인 메서드
	public static boolean isContains (int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
 
//	배열 생성 메서드
//	리턴 boolean : 배열이 잘 생성되면 true, 아니면false
//	매개변수 : 배열, count,start
	public static boolean randomArray(int arr[],int count, int start) {
		if(arr==null) {
			return false;
		}
		if(count<arr.length) {
			return false;
		}
		int i =0;
		while(i<arr.length) {
			int r = random(count,start);
		
			if(!isContains(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
	 	return true;
	 	
	}
	//배열 출력 메서드
	public static void printArray(int arr[]) {

		for(int tmp : arr) {
		System.out.println(tmp+" ");	
		
		}
		System.out.println();//줄바꿈
		
		}
	//스트라이크 메서드
	//기능: com[],my[] 위치와 값이 일치하면 count 리턴
	public static int strike(int com[], int my[] ) {
		int cnt =0;
		for(int i=0; i<com.length; i++) {
			if(com[i]== my[i]) {
				cnt++;
			}
		}
		return cnt;
		
	}
	//볼 메서드
	// 기능: com[], my[] 위치 상관없이 일치하면 카운트 증가 리턴
	public static int ball(int com[], int my[]) {
		int cnt =0 ;
		for(int i=0; i<com.length; i++) {
			if(isContains(my,com[i])) { //위치와 상관없이 일치
				cnt++;
			}
		}
		//스트라이크 포함하는 갯수
		return cnt -strike(com,my);
	}
	
	
	

}
	
	
