public class Student {
    private final String name;
    private final String department;
    private final int id;
    private final double average;

    Student(String name,String department, int id, double average){
        this.id=id;
        this.average=average;
        this.name = name;
        this.department =department;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("--------------------");
        System.out.println("이름 : " + name);
        System.out.println("학과 : " + department);
        System.out.println("아이디 : " + id);
        System.out.println("평균 : " + average);
    }

    @Override
    public String toString(){
        return name+", "+department+", "+id+", "+average;
    }
}
