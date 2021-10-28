
public class Quiz_7 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE:Java �����");
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
			
			System.out.println(coin[i]+"�� :"+coinNum);		
			}
		
		if(money>0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
		
		System.out.println("= ���� ���� ���� =");
		
		for (int i =0; i<coin.length;i++) {
			System.out.println(coin[i]+"��:"+a[i]);
		}
	}
}
