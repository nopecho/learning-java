package practice;

public class Transaction {
    private final Trader trander;
    private final int year;
    private final int value;

    public Transaction(Trader trander, int y, int v){
        this.trander=trander;
        this.year=y;
        this.value=v;
    }

    public Trader getTrander(){
        return trander;
    }

    public int getYear(){
        return year;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "trander / "+trander+" year : "+year+" value : "+value;
    }

}
