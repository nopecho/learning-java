package ex2;

import java.util.Vector;

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();
        v.add(new Rect(1,3));
        System.out.println(v.get(0));
        v.add(new Point(2,3));
        System.out.println(v.get(1));

        for(Point p : v){
            System.out.println(p);
        }

        Vector<Rect> v2 = new Vector<>();
        v2.add(new Rect(3,3));
        v2.add(new Rect(4,3));

        v.addAll(v2);
        for(Point p : v){
            System.out.println(p);
        }
        for(Rect r : v2 ){
            System.out.println(r.getSun());
        }
    }
}

class Point{
    private int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}

class Rect extends Point{
    private int sun;

    Rect(int x, int y) {
        super(x, y);
        this.sun=x*y;
    }
    public int getSun(){
        return sun;
    }
}
