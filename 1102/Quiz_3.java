class Song{
	String title,artist,contry;
	int year;
	
	Song(){
	}
	Song(int year,String title,String artist,String contry){
		this.year=year;
		this.title=title;
		this.artist=artist;
		this.contry=contry;
	}
	
	void show() {
		System.out.println(year+"�� "+contry+"������ "+artist+"�� �θ� "+title);
	}
}
public class Quiz_3 {

	public static void main(String[] args) {
		Song a = new Song(1978,"Dancig Queen","ABBA","������");
		a.show();
	}

}
