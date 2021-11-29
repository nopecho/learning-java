class Point{
    private int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){ //Object의 toSting메소드를 Point class에서 오버라이딩(객체를 문자열로 리턴)
        return "Point("+x+","+y+")";
    }
}
public class ToStringEX {
    public static void main(String[] args) {
        Point p = new Point(5,5);
        System.out.println(p.toString());
        System.out.println(p); //system.out.print() 메소드 자체가 파라미터 값을 toString으로 바꿔서 리턴
        System.out.println(p+"입니다");
    }
}
