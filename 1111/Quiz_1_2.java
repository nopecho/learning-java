class TV{
	private int size;
	public TV(int size) {
		this.size=size;
	}
	protected int getSize() {
		return size;
	}

}
class ColorTV extends TV{
	private int property;
	public ColorTV(int size,int property) {
		super(size);
		this.property=property;
	}
	public int getProperty() {
		return property;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+property+"컬러");
	}
}
class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip,int size,int property) {
		super(size,property);
		this.ip=ip;
	}
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+"주소의 "+getSize()+"인치 "+getProperty()+"컬러");
	}
}
public class Quiz_1_2 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
		IPTV myTV2 = new IPTV("199.99.99",42,2048);
		myTV2.printProperty();
	}
}
