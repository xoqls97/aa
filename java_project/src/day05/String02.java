package day05;

public class String02 {

	public static void main(String[] args) {
		/* 이것이 자바다.txt => 파일명과 확장자를 분리하여 출력
		 * */
		String filename = "이것이자바다.txt";
			System.out.print("파일명은: ");
	System.out.println(filename.substring(0,filename.indexOf(".")));
	System.out.print("확장자는: ");
	System.out.println(filename.substring(filename.indexOf(".")+1));
		
	//contains(str) : 해당글자를 포함하고 있는 지를 체크 boolean
	System.out.println(filename.contains("이것이"));
	

	}

}
