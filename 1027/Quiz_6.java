
public class Quiz_6 {

	public static void main(String[] args) {
		int[] m= {500,100,50,10};
		
		int mo=2680;
		System.out.println("mo= "+mo);
		
		for (int i=0; i<m.length;i++) {
			System.out.println(m[i]+"¿ø"+mo/m[i]);
			mo%=m[i];
		}
	}
}
