package day10;

public class CardMain {

	public static void main(String[] args) {

		CardPack cp = new CardPack();
		cp.shuffle();
		cp.pick().print();
		cp.getPack()[51].print();
		for(int i = 0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
		}
	}

}
