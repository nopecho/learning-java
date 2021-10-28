
public class Quiz_7 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE:Java 블라블라");
			System.exit(0);
		}
		int money = Integer.parseInt(args[0]);
		
		System.out.println("momey : "+money);
		
		int[] coin= {500,100,50,10};
		int[] a= {5,5,5,5};
		
		for (int i=0;i<coin.length;i++) {
			int coinNum=0;		
			
			coinNum=money/coin[i];
			if(coinNum>5) {
				coinNum-=coinNum-5;
			}
			a[i]-=coinNum;
			money-=coinNum*coin[i];
			
			System.out.println(coin[i]+"원 :"+coinNum);		
			}
		
		if(money>0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("= 남은 동전 갯수 =");
		
		for (int i =0; i<coin.length;i++) {
			System.out.println(coin[i]+"원:"+a[i]);
		}
	}
}
