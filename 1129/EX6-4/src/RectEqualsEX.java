class Rect{
    private int width;
    private int height;
    public Rect(int width,int height){
        this.height=height;
        this.width=width;
    }
    @Override
    public boolean equals(Object obj) {
        Rect r = (Rect) obj;
        if ((width * height) == (r.height * r.width))  return true;
        else return false;
    }
}
public class RectEqualsEX {
    public static void main(String[] args) {
        Rect r1 = new Rect(5,8);
        Rect r2 = new Rect(8,5);
        if(r1.equals(r2)) System.out.println("r1과 r2의 면적은 같습니다.");
        if(r1 == r2 ) System.out.println("r1과 r2는 같습니다.");
    }
}
