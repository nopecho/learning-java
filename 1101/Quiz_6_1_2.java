class SutdaCard{
	int num; //1~10������ ����
	boolean isKwang; //���̸� true, �ƴϸ�false
	
	public SutdaCard(){
		this(1,true);
	}
	public SutdaCard(int num,boolean isKwang) {
		this.num=num;
		this.isKwang=isKwang;
	}
	public String info() {
		if(isKwang) {
			return this.num+"K";
		}else {
			return num+"";
		}
	}
}

public class Quiz_6_1_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
