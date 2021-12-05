package dto;

public class Spr {
    private final String[] spr = {"가위","바위","보"};

    public String getScissors(){
        return spr[0];
    }
    public String getPaper(){
        return spr[2];
    }
    public String getRock(){
        return spr[1];
    }
    public String[] getSpr(){
        return spr;
    }
}
