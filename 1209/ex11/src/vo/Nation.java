package vo;

public class Nation {
    private String contry;
    private String capital;

    public Nation(String contry, String capital){
        this.contry = contry;
        this.capital = capital;
    }

    public String getContry(){
        return contry;
    }
    public String getCapital(){
        return capital;
    }
}
