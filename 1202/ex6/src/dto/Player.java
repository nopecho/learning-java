package dto;

public class Player {
    private int oriTime;
    private int myTime;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMyTime(int time) {
        this.myTime = time;
    }

    public int getMyTime() {
        return myTime;
    }

    public void setOriTime(int time) {
        this.oriTime = time;
    }

    public int getOriTime() {
        return oriTime;
    }

    @Override
    public String toString() {
        return "플레이어 이름 :" + name;
    }
}
