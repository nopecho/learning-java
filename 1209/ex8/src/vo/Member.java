package vo;

public class Member {
    private String name;
    private int point;

    public void setName(String name){
        this.name = name;
    }
    public void setPoint(int point){
        this.point = point;
    }

    public int getPoint(){
        return point;
    }

    @Override
    public String toString(){
        return "("+name+", "+point+")";
    }
}
