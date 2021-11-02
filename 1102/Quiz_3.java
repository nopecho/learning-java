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
		System.out.println(year+"년 "+contry+"국적의 "+artist+"가 부른 "+title);
	}
}
public class Quiz_3 {

	public static void main(String[] args) {
		Song a = new Song(1978,"Dancig Queen","ABBA","스웨덴");
		a.show();
	}

}
