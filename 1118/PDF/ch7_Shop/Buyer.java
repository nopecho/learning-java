package ch7_Shop;

class Buyer {
	int money=1000;
	Product[] cart = new Product[3];
	int index=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("[!]�ܾ� ����,"+p+"��/�� ��� �����ϴ�.");
			return;
		}
		money=money-p.price;
		add(p);
	}
	
	void add(Product p) {
		if(index>=cart.length) {
			Product[] newCart = new Product[cart.length*2];
			for(int i=0;i<cart.length;i++) {
				newCart[i]=cart[i];	
			}
			cart=newCart;
		}
		cart[index]=p;
		index++;
	}
	
	void summary() {
		int result=0;
		System.out.print("������ ���� : ");
		for(int i=0;i<cart.length;i++) {
			result+=cart[i].price;
			System.out.print(cart[i]+",");
		}
		System.out.println("\n����� �ݾ� : "+result);
		System.out.println("���� �ݾ� : "+money);
	}
}
