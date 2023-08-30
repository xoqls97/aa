package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와, 평균을 출력
		 * 최고점수 찍기
		 * */
		

		Scanner scan = new Scanner(System.in);

		int size =5;
		int arr[] = new int[size];
		int sum = 0;
		double avg =0;
		int max= 0;
		int max1 =0;
		int min =100;
		int min1 =100;
		System.out.println("점수입력");
		for(int i=0; i<arr.length; i++) {
			arr[i] =scan.nextInt();
			sum += arr[i];
//			최대값 if문
			if(max< arr[i]) {
				max =arr[i];
			}
			if(min> arr[i]) {
				min =arr[i];
			}
			//최대값 Math.max
			max1 =Math.max(max1, arr[i]);
			min1 =Math.min(min1, arr[i]);
			
			
		}
		avg = (double)sum /arr.length;
		System.out.println("합계:"+ sum);
		System.out.println("평균:"+ avg);
		System.out.println("최고:"+ max);
		System.out.println("최저:"+ min);
		System.out.println("Math.최고:"+ max1);
		System.out.println("Math.최저:"+ min1);
		
		
		
		
		
		
		
		
		scan.close();
	}

}
