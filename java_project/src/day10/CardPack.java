package day10;

public class CardPack {
	//멤버변수
	private Card[] pack = new Card[52];		
	private int cnt =0; //pack 배열의 index 체크용 , 클래스에서 배열을 쓸 때는 멤버변수로 index용을 무조건씀
	private int index;
	
	
	//생성자 : 52장의 카드를 모두 생성
	public CardPack() {
//		♥(1~13) ◆(1~13) ♣(1~13) ♠(1~13)
		String shape ="♥";
		for(int i=1; i<5; i++) {
			switch(i) {
			case 1:
				shape="♥";
				break;
			case 2:
				shape="◆";
				break;
			case 3:
				shape="♣";
				break;
			case 4:
				shape="♠";
				break;
			}
			for(int j=1; j<14; j++) {// 숫자
				Card c = new Card(); //카드한장생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
				
			}
		}
	}
//	- 카드를 섞는 기능   shuffle
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int idex = (int)(Math.random()*52)+0;
	       Card tmp = pack[i];
	       pack[i]=pack[index];
	       pack[index]=tmp;
		}
	}
//	- 카드를 한장 빼는 기능 
	public Card pick() {
		if(cnt ==0) {
			return null;
		}
			cnt--;
		return pack[cnt];
	}
	
	
	
	//메서드
	
	//getter /setter

	public Card[] getPack() {
		return pack;
	}




	public void setPack(Card[] pack) {
		this.pack = pack;
	}




	public int getCnt() {
		return cnt;
	}




	public void setCnt(int cnt) {
		this.cnt = cnt;
	}




	public static void main(String[] args) {

		/* CardPack 클래스
		 * -카드팩 : 52장의 카드들
		 * 
		 * 멤버변수 : 카드를 52장담을수 있는 배열
		 * 생성자 : 52장의 카드를 모두 생성
		 * 메서드 :  
		 * 
		 *  
		 * - 카드 출력 => Card 클래스의 print 메서드 사용
		 * - 카드 초기화 메서드
		 * */

		
	}

}
