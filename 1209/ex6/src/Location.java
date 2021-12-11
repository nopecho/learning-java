public class Location {
    private String name;
    private int lat;
    private int lon;

    Location(String name, int lat, int lon){
        this.name=name;
        this.lat=lat;
        this.lon=lon;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name+"\t"+lat+"\t"+lon;
    }
}
