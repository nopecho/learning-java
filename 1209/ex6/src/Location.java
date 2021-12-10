public class Location {
    private String name;
    private int lat;
    private int lon;

    @Override
    public String toString(){
        return name+"\t"+lat+"\t"+lon;
    }
}
