package ch7_Shop;

class Buyer {
	int money=1000;
	Product[] cart = new Product[3];
	int index=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("[!]잔액 부족,"+p+"을/를 살수 없습니다.");
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
		System.out.print("구입한 물건 : ");
		for(int i=0;i<cart.length;i++) {
			result+=cart[i].price;
			System.out.print(cart[i]+",");
		}
		System.out.println("\n사용한 금액 : "+result);
		System.out.println("남은 금액 : "+money);
	}
}
