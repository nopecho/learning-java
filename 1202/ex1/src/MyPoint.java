public class MyPoint {
    int x,y;

    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        MyPoint p = (MyPoint) obj;
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Point ("+x+","+y+")";
    }
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3,40);
        MyPoint q = new MyPoint(4,50);
        System.out.println(p);
        if(p.equals(q)) {
            System.out.println("같은점");
        }else{
            System.out.println("다른점");
        }
    }
}
