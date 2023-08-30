package day10;


public class ClassEx02 {

	public static void main(String[] args) {

		/* 자동차 클래스 생성
		 * 멤버변수 : name, year, color, power, speed
		 * 메서드 : 전원on,전원off,스피드up, 스피드down
		 * getter / setter 필요
		 * 생성자
		 * 
		 */
	
		Car c = new Car();
		c.powerOn();
	}
}

	class Car{
		//멤버변수 선언
		private String name;
		private String year;
		private String color;
		private boolean power;
		private int speed;
		//생성자
		public Car() {}
		public Car(String name, String year, String color) {
			this.name = name;
			this.year = year;
			this.color= color;
		}
		
		//메서드 : 전원on,전원off,스피드up, 스피드down
		public void powerOn() {
			power = true;
			System.out.println("전원이 켜짐");
		}
	
		public void powerOff() {
			power = false;
			System.out.println("전원이꺼짐");
		}
		public void speedUp() {
			speed++;
			System.out.println("현재속도: "+speed);
		}
		public void speedDown() {
			speed--;
			if(speed ==0) {
				System.out.println("속도가 0입니다.");
			}else {
				speed = speed-10;
				System.out.println("속도를 더낮출 수없음");
			}
			System.out.println("현재속도:"+speed);
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isPower() {
			return power;
		}
		public void setPower(boolean power) {
			this.power = power;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
		//getter / setter
	}




	
