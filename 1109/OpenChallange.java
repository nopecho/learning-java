import java.util.Scanner;

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
	public Fish(int startX,int startY, int distance){
		super(startX,startY,distance);
	}

	@Override
	protected void move() {
		int rand = (int)(Math.random()*4);
		switch(rand) {
		case 0:
			if(y==0) {
				return;
			} y--; break;				
		case 1:
			if(x==9) {
				return;
			} x++; break;						
		case 2:
			if(x==0) {
				return;
			} x--; break;		
		case 3:
			if(y==19) {
				return;
			} y++; break;				
		}
	}
	
	@Override
	protected char getShape() {	return '@'; }
}


class Bear extends GameObject{
	private Scanner sc= new Scanner(System.in);
	public Bear(int startX,int startY, int distance) {
		super(startX,startY,distance);
	}
	
	@Override
	protected void move() {	
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		String move = sc.next();
		switch(move) {
		case "a":
			if(y==0) {
				System.out.println("[!] 왼쪽으로 움직일 수 없습니다.");
				return;
			} y--; break;				
		case "s":
			if(x==9) {
				System.out.println("[!] 아래쪽으로 움직일 수 없습니다.");
				return;
			} x++; break;						
		case "d":
			if(x==0) {
				System.out.println("[!] 위쪽으로 움직일 수 없습니다.");
				return;
			} x--; break;		
		case "f":
			if(y==19) {
				System.out.println("[!] 오른쪽으로 움직일 수 없습니다.");
				return;
			} y++; break;				
		default :
			System.out.println("[!] 방향키를 제대로 확인하세요.");
		}
	}

	@Override
	protected char getShape() { return 'H'; }			
}

class Game{
	private static int gameCount=0;
	private static int moveCount=0;
	private String[][] stage=new String[10][20];
	private Fish fish = new Fish((int)((Math.random()*10+1)),(int)((Math.random()*20+1)),1);
	private Bear bear= new Bear(0,0,1);

	Game(){
		for (int i=0;i<stage.length;i++) {
			for (int j=0;j<stage[i].length;j++) {
				stage[i][j]=" - ";		
			}
		}
		stage[bear.getX()][bear.getY()]=" "+String.valueOf(bear.getShape())+" ";
		stage[fish.getX()][fish.getY()]=" "+String.valueOf(fish.getShape())+" ";
	}
	
	public void showStage() {
		for (int i=0;i<stage.length;i++) {
			for (int j=0;j<stage[i].length;j++) {
				System.out.print(stage[i][j]);
			}System.out.println();
		}
	}
	public void movingBear() {
		stage[bear.getX()][bear.getY()]=" - ";
		bear.move();
		stage[bear.getX()][bear.getY()]=" "+String.valueOf(bear.getShape())+" ";
		moveCount++;
		gameCount++;
	}
	public void movingFish() {
		stage[fish.getX()][fish.getY()]=" - ";
		fish.move();
		stage[fish.getX()][fish.getY()]=" "+String.valueOf(fish.getShape())+" ";
		moveCount=0;
	}
	public void run() {		
		while(true) {
			showStage();
			if(moveCount==3) {
				movingFish();
			}
			movingBear();
			if(fish.collide(bear)){
				showStage();
				System.out.println("[!] "+gameCount+" 회 만에 현준이가 물고기를 잡았다!");
				break;
			}
		}
	}
}

public class OpenChallange{	
	
	public static void main(String[] args) {
		Game g = new Game();
		System.out.println("*** 현준이의 물고기 잡기 게임 ***");	
		g.run();
	}
}
