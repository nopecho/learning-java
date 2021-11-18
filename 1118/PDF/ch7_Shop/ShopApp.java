package ch7_Shop;

class ShopApp {

	public static void main(String[] args) {
		Buyer v = new Buyer();
		v.buy(new Tv());
		v.buy(new Computer());
		v.buy(new Tv());
		v.buy(new Audio());
		v.buy(new Computer());
		v.buy(new Computer());
		v.buy(new Computer());
		
		v.summary();
	}
}
