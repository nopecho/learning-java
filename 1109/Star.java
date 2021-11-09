
class Unit{
	protected final int LIFE = 1;
	protected String name;
	protected int hp=0;
	protected int aumor=0;
	
	Unit(int hp,int aumor){
		this.hp=hp;
		this.aumor=aumor;
	}
	
	public void setHp(int hp) {
		this.hp=hp;
	}
	public void setAumor(int aumor) {
		this.aumor=aumor;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void showUnit() {
	}
	public void Attack() {
		System.out.println("공격합니다.");
	}
}

class Zerg extends Unit{
	private int fast;
	Zerg(int hp,int aumor){
		super(hp,aumor);
	}
	public void setFast(int fast) {
		this.fast=fast;
	}
	@Override
	public void showUnit() {
		System.out.println("[UNIT NAME]:"+name+"  [LIFE]:"+LIFE+"  [HP]:"+hp+"  [AUMOR]:"+aumor+"  [FAST]:"+fast);
	}
	@Override
	public void Attack() {
		System.out.println("[저그]가 공격합니다.");
	}
}

class Terran extends Unit{
	Terran(int hp, int aumor) {
		super(hp, aumor);
	}
	private int range;
	public void setRange(int range) {
		this.range=range;
	}
	@Override
	public void showUnit() {
		System.out.println("[UNIT NAME]:"+name+"  [LIFE]:"+LIFE+"  [HP]:"+hp+"  [AUMOR]:"+aumor+"  [RANGE]:"+range);
	}
	@Override
	public void Attack() {
		System.out.println("[테란]이 공격합니다.");
	}
}

class Protoce extends Unit{
	Protoce(int hp, int aumor) {
		super(hp, aumor);
	}
	private int shield;
	public void setShield(int shield) {
		this.shield=shield;
	}
	@Override
	public void showUnit() {
		System.out.println("[UNIT NAME]:"+name+"  [LIFE]:"+LIFE+"  [HP]:"+hp+"  [AUMOR]:"+aumor+"  [SHIELD]:"+shield);
	}
	@Override
	public void Attack() {
		System.out.println("[프로토스]가 공격합니다.");
	}
}

class Zergling extends Zerg{
	Zergling(int hp,int aumor){
		super(hp,aumor);
	}
	@Override
	public void Attack() {
		System.out.println("저글링이 공격합니다.");
	}
}

class Zilut extends Zerg{
	Zilut(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("[저그] 질럿이 공격합니다.");
	}
}

class Marine extends Terran{
	Marine(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("마린이 공격합니다.");
	}
}

class Dragun extends Protoce{
	Dragun(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("드라군이 공격합니다.");
	}
}

class Zilut2 extends Protoce{
	Zilut2(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("[프로토스] 질럿이 공격합니다.");
	}
}

public class Star {
	public static void attackAll(Unit unit) {
		unit.Attack();
	}
	public static void main(String[] args) {
//		Zilut a =  new Zilut(); //사용자는 Zilut이 프로토스 인줄 알고 프로토스의 공격 명령을 내리고 싶음
//		a.Attack(); //위 결과는 [저그]의 공격 명령임 Zilut이라는 데이터 타입은 Zerg를 상속받기때문에
//		
//		Protoce b = new Zilut2(); //업캐스팅으로 Zilut2의 인스턴스는 Protoce타입이라고 명시함으로 제대로된 프로토스 Attack()명령을 내릴수 있음
//		b.Attack();
		
		Unit unit0 = new Dragun(180,100); //업캐스팅
		//(Protoce)데이터 타입에는 setHp()라는 메소드가 없지만 (Protoce)타입도 (Unit)타입을 상속 받았으므로 사용 가능.
		unit0.setName("뜨라군");
		unit0.showUnit();
//		unit0.setShield(); //setShield() 메소드에는 접근 불가, Unit데이터 타입(hp,aumor,name)에만 접근가능.
		Protoce dragun = (Dragun)unit0; //다운 캐스팅
		dragun.setShield(30); //다운캐스팅 함으로서 new Dragun()의 데이터에 접근 가능
		dragun.showUnit();
		
		Unit unit1 = new Zilut2(100,50);
		unit1.setName("찔럿");
		unit1.showUnit();
		
		Unit unit2 = new Marine(80,10);
		unit2.setHp(50);
		unit2.setAumor(10);
		unit2.setName("개병 마린");
//		unit2.showUnit();
		Marine marin=(Marine)unit2;
		marin.setRange(10);
		marin.showUnit();
		
		Unit unit3 = new Zergling(30,0);
		unit3.setName("쩌끌쩌끌링");
		Zerg zergling=(Zergling)unit3;
		zergling.setFast(5);
		unit3.showUnit();
		//...밑으로 Unit이 수백개 생기면? 어택땅을 하나하나 못찍음
		
		Unit[] u = {unit0,unit1,unit2,unit3};
		
		for(int i=0;i<u.length;i++) { //모든 (Unit)타입의 객체 어택땅을 위한 for문
			u[i].Attack();
		}
		
	}
}
