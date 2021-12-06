package dto;

public class Person {
    private String name;
    private Numbers numbers;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setNumbers(Numbers numbers){
        this.numbers = numbers;
    }

    public Numbers getNumbers(){
        return numbers;
    }
}