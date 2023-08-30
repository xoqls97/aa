package day01;

public class 과제 {

	public static void main(String[] args) {
	     /* 매일 마지막 시간 과제 출제
	      * 카페에 제출
	      * 국어, 영어, 수학의 점수 합계와 평균소수점으로 출력
	      * 조건선택 연산자 이용하여
	      * 평균이 80이상이면 결과: 합격, 아니면 결과: 불합격 출력
	      *  
	      * */
		
		int kor,eng,math,sum;
		double avg;
		kor=75;
		eng=90;
		math=85;
		sum=kor+eng+math;
		avg=(double)sum/3;
		System.out.println("합계:"+sum+", 평균:"+avg);
		System.out.println((avg>=80)? "결과:합격" : "결과:불합격");

	}

}
