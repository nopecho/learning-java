
public class Quiz_7 {

	public static void main(String[] args) {
		int[] numlist=new int[10];
		double result=0;
		System.out.print("·£´ý Á¤¼ö : ");
		for(int i=0;i<numlist.length;i++) {
			numlist[i]=(int)(Math.random()*10+1);
			result+=numlist[i];
			System.out.print(numlist[i]+" ");
		}System.out.println();
		System.out.println("Æò±Õ : "+result/numlist.length);
	}

}
