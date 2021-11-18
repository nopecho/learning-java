package ch7_Sutda;

class SutdaDeck {
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			cards[i]=new SutdaCard(i%10+1,false);
			if(i==0 || i==2 || i==7) {
				cards[i]=new SutdaCard(i+1,true);			
			}
		}
	}
	SutdaCard pick(int num) {
		return cards[num];
	}
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
	void shuffle() {
		SutdaCard temp;
		for(int i=0;i<cards.length;i++) {
			int rand=(int)(Math.random()*20);
			temp=cards[i];
			cards[i]=cards[rand];
			cards[rand]=temp;		
		}
	}
}
