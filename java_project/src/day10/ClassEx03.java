package day10;

public class ClassEx03 {

	public static void main(String[] args) {

		//파워,채널업다운,볼륨업다운
		TV tv = new TV("LG");
		tv.isPower();
		tv.channelDown();
		tv.isPower();
		tv.isPower();
		
		
		
	
	}

}
class TV{
	/* 멤버변수 : name, power, chnnel, vol
	 * 메서드 : 전원, 채널up / down, vol up/down
	 * */
	private String name;
	private boolean power;
	private int channel;
	private int volume;

	//생성자
	public TV() {}
	public TV(String name) {
		this.name = name;
	}
	
	//메서드
	public void isPower() {
	if(!power) {
		power = true;
		System.out.println("전원이켜짐");
	}else {
		power = false;
		System.out.println("꺼짐");
	}
	}
	//channel 상태
	public void channelUp() {

		if(channel==100) {
			channel=0;
			System.out.println("현재채널:"+channel);
		}else {
			channel++;
			System.out.println("현재채널:"+channel);
		}
		
	}
	public void channelDown() {

		if(channel == 0) {
			channel = 100;
		}else {
		
		channel--;
		}
		System.out.println("현재채널:"+channel);
	}
	
	public void volumeUp() {
		//maxVolume =10;
		if(volume ==10) {
			System.out.println("더이상 못올림");
		}else {
			
			volume++;
			System.out.println("현재볼륨:"+volume);
		}
	}
	public void voulumeDown() {

		if(volume ==0) {
			System.out.println("mute");
			
		}
		else {
		volume--;
		System.out.println("현재볼륨:"+volume);
	}
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
