public class Member {
    private String name;
    private int id;
    private String tel;

    Member(String name,int id,String tel){
        this.name=name;
        this.id=id;
        this.tel=tel;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String getTel(){
        return tel;
    }
}
