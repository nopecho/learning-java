package ch7_Sutda;

class SutdaCard {
	private int num;
	private boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	public String toString() {
		return num+(isKwang?"K":"");
	}
}
