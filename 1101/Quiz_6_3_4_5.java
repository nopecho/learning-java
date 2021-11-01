class Student{
	String name;
	int ban,no,kor,eng,math;
	public Student() {
	}
	
	public Student(String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.no=no;
		this.ban = ban;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
	public int getTotal() {
		int total=0;
		total= kor+eng+math;
		return total;
	}
	
	public float getAverage() {		
		String num = String.format("%.1f",(float)this.getTotal()/3);
		return  Float.parseFloat(num);
	}
	
	public String info() {
		return name+","+ban+","+no+","+eng+","+kor+","+math+","+getTotal()+","+getAverage();
	}
}

public class Quiz_6_3_4_5 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name="È«±æµ¿";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("ÀÌ¸§ : "+s.name);
		System.out.println("ÃÑÁ¡ : "+s.getTotal());
		System.out.println("Æò±Õ : "+s.getAverage());
		
		Student s2 = new Student("Á¶ÇöÁØ",1,1,100,60,76);
		
		System.out.println(s2.info());
	}
}




