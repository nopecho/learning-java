abstract class GameObject { //�߻� Ŭ����
	protected int distance; // �ѹ� �̵� �Ÿ�
	protected int x,y; // ���� ��ġ(ȭ�� �� ���� ��ġ x,y��ǥ)
	
	public GameObject(int startX,int startY, int distance) {
		this.x=startX;
		this.y=startY;
		this.distance=distance;
	}
	public int getX(){
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean collide(GameObject p) { //�� ��ü�� ��üp�� �浹������ true;
		if(this.x==p.getX() && this.y==p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	protected abstract void move(); //�̵��� ���� ���ο� ��ġ�� x,y����
	protected abstract char getShape(); // ��ü�� ����� ��Ÿ���� ���� ����
}


class Fish extends GameObject{
	public Fish(int x,int y, int distance){
		super(x,y,distance);
	}

	@Override
	protected void move() {		
	}

	@Override
	protected char getShape() {
		return '@';
	}
}


class Bear extends GameObject{
	public Bear(int x,int y, int distance) {
		super(x,y,distance);
	}
	
	@Override
	protected void move() {		
	}

	@Override
	protected char getShape() {
		return 'H';
	}
}

class Game{
	private char [][] stage = new char [10][20]; //stage �ʱ�ȭ 10��20��;
	private Fish fish;
	private Bear bear;
	
	Game(){
		bear=new Bear(0,0,1);
		fish=new Fish((int)Math.random()*9,(int)Math.random()*19,1);
		for (int i=0;i<stage.length;i++) {
			for (int j=0;j<stage[i].length;j++) {
				stage[i][j]='-';
				stage[bear.getX()][bear.getY()]=bear.getShape();
				stage[fish.getX()][fish.getY()]=fish.getShape();			
			}
		}
	}
	
	public void showStage() {
		for (int i=0;i<stage.length;i++) {
			for (int j=0;j<stage[i].length;j++) {
				System.out.print(stage[i][j]);
			}System.out.println();
		}
	}
	public void run() {
		System.out.println("*** ������ Fish�Ա� ���� ***");
		showStage();
	}
}

public class OpenChallange{	
	public static void main(String[] args) {
		Game g = new Game();
		g.run();
	}
}
