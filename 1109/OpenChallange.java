abstract class GameObject { //추상 클래스
	protected int distance; // 한번 이동 거리
	protected int x,y; // 현재 위치(화면 맵 상의 위치 x,y좌표)
	
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
	public boolean collide(GameObject p) { //이 객체가 객체p와 충돌했으면 true;
		if(this.x==p.getX() && this.y==p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	protected abstract void move(); //이동한 후의 새로운 위치로 x,y변경
	protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
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
	private char [][] stage = new char [10][20]; //stage 초기화 10행20열;
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
		System.out.println("*** 현준의 Fish먹기 게임 ***");
		showStage();
	}
}

public class OpenChallange{	
	public static void main(String[] args) {
		Game g = new Game();
		g.run();
	}
}
