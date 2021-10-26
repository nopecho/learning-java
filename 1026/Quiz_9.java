
public class Quiz_9 {

	public static void main(String[] args) {
		int[][] numlist=new int[4][4];
		for (int i =0;i<numlist.length;i++) {
			for (int j=0;j<numlist[i].length;j++) {
				numlist[i][j]=(int)(Math.random()*10+1);
				System.out.print(numlist[i][j]+"\t");
			}System.out.println();
		}
	}
}
