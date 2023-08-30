package day05;

public class Array02 {

	public static void main(String[] args) {
		/* Array 배열 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50 사이의 랜덤값을 저장 한 후 출력
		 * */
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
			 
		}
		System.out.println();
		System.out.println("--------------");
		
		//정렬(오름차순) 교환
		//3 43 38 42 46
		//3 43 38 42 46 pass1
		//3 38 43 42 46 pass2
		//3 38 42 43 46 pass3
		//3 38 42 43 46 pass4
		//버블정렬
	    // 뒤에서부터정렬 더짧음
		//이중for문 필요
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp =arr[i];
					arr[i] = arr[j];
					tmp = arr[j];
				}
				
			}
		}
	
		
	for(int i =0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
		
	}		
	System.out.println();
	System.out.println("--------------");
	for(int tmp : arr) {
	}

	}

}
