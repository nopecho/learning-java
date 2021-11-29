class Point{
    private int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object obj){ //Object클래스의 equals()메소드 오버라이딩
        Point p = (Point) obj;
        if(this.x == p.x && this.y==p.y){
            return true;
        }else return false;
    }
}
public class EqualsEX {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = a;
        if(a==b){
            System.out.println("a==b");
        }if(a.equals(b)){
            System.out.println("a.equals(b)");
        }if(c==a){
            System.out.println("a==c");
        }if(c.equals(b)){
            System.out.println("c.equals(b)");
        }
    }
}
