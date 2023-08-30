package day07;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("야구게임시작");
		System.out.println("컴퓨터가 숫자를 결정");
		

		int [] comNum = new int[3];
		int [] myNum = new int[3];
		
		randomArray(comNum);
		for(int i =0; i<comNum.length; i++) {
			System.out.println(comNum[i]+" ");
		}
		System.out.println("컴퓨터가 숫자를 정했습니다. 숫자를 입력해주세요.(1~9,3자리)");
		for(int i=0; i<myNum.length; i++) {
			myNum[i] = scan.nextInt();
		}
		int ball =0;
		int strike=0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<myNum.length; j++) {
				if(comNum[i] == myNum[j] && i==j) {
					strike++;
				}else if(comNum[i] == myNum[j] && i !=j) {
					ball++;
				}
				
				
				
			}
		}
		System.out.println("스트라이크 :"+ strike+"개");
		System.out.println("볼 :"+ball+"개");
		System.out.println("프로그램종료");
		
		scan.close();
		
		}
		public static int random() {
			return (int)(Math.random()*9)+1;
		}
		public static void randomArray(int arr[]) {
			int i=0;
			while(i<arr.length) {
				int r = random();
				if(!isContain(arr,r)) {
				
					arr[i]=r;
					i++;

				}
			}
		}

		public static boolean isContain(int arr[], int random) {
			for(int tmp : arr) {
				if(tmp == random) {
					return true;
				}
			}
		return false;
		}
		
		
	}
