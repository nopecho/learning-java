
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
		System.out.println("�����մϴ�.");
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
		System.out.println("[����]�� �����մϴ�.");
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
		System.out.println("[�׶�]�� �����մϴ�.");
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
		System.out.println("[�����佺]�� �����մϴ�.");
	}
}

class Zergling extends Zerg{
	Zergling(int hp,int aumor){
		super(hp,aumor);
	}
	@Override
	public void Attack() {
		System.out.println("���۸��� �����մϴ�.");
	}
}

class Zilut extends Zerg{
	Zilut(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("[����] ������ �����մϴ�.");
	}
}

class Marine extends Terran{
	Marine(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("������ �����մϴ�.");
	}
}

class Dragun extends Protoce{
	Dragun(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("����� �����մϴ�.");
	}
}

class Zilut2 extends Protoce{
	Zilut2(int hp, int aumor) {
		super(hp, aumor);
	}

	@Override
	public void Attack() {
		System.out.println("[�����佺] ������ �����մϴ�.");
	}
}

public class Star {
	public static void attackAll(Unit unit) {
		unit.Attack();
	}
	public static void main(String[] args) {
//		Zilut a =  new Zilut(); //����ڴ� Zilut�� �����佺 ���� �˰� �����佺�� ���� ����� ������ ����
//		a.Attack(); //�� ����� [����]�� ���� ����� Zilut�̶�� ������ Ÿ���� Zerg�� ��ӹޱ⶧����
//		
//		Protoce b = new Zilut2(); //��ĳ�������� Zilut2�� �ν��Ͻ��� ProtoceŸ���̶�� ��������� ����ε� �����佺 Attack()����� ������ ����
//		b.Attack();
		
		Unit unit0 = new Dragun(180,100); //��ĳ����
		//(Protoce)������ Ÿ�Կ��� setHp()��� �޼ҵ尡 ������ (Protoce)Ÿ�Ե� (Unit)Ÿ���� ��� �޾����Ƿ� ��� ����.
		unit0.setName("�߶�");
		unit0.showUnit();
//		unit0.setShield(); //setShield() �޼ҵ忡�� ���� �Ұ�, Unit������ Ÿ��(hp,aumor,name)���� ���ٰ���.
		Protoce dragun = (Dragun)unit0; //�ٿ� ĳ����
		dragun.setShield(30); //�ٿ�ĳ���� �����μ� new Dragun()�� �����Ϳ� ���� ����
		dragun.showUnit();
		
		Unit unit1 = new Zilut2(100,50);
		unit1.setName("��");
		unit1.showUnit();
		
		Unit unit2 = new Marine(80,10);
		unit2.setHp(50);
		unit2.setAumor(10);
		unit2.setName("���� ����");
//		unit2.showUnit();
		Marine marin=(Marine)unit2;
		marin.setRange(10);
		marin.showUnit();
		
		Unit unit3 = new Zergling(30,0);
		unit3.setName("¼��¼����");
		Zerg zergling=(Zergling)unit3;
		zergling.setFast(5);
		unit3.showUnit();
		//...������ Unit�� ���鰳 �����? ���ö��� �ϳ��ϳ� ������
		
		Unit[] u = {unit0,unit1,unit2,unit3};
		
		for(int i=0;i<u.length;i++) { //��� (Unit)Ÿ���� ��ü ���ö��� ���� for��
			u[i].Attack();
		}
		
	}
}
