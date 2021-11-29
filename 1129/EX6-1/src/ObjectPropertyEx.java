class Point{
    private int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class ObjectPropertyEx {
    public static void print(Object obj){ //업캐스팅 이루어짐
        System.out.println(obj.getClass().getSimpleName()); //obj의 클래스, 클래스의 이름
        System.out.println(obj.hashCode()); //obj의 해시코드값
        System.out.println(obj.toString()); // toString() 메소드는 Object의 포함된 메소드 (객체를 String타입으로 리턴해줌)
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Point p = new Point(5,5);
        print(p);
    }
}
