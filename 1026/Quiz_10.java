package yj_1026_Quiz;

public class Quiz_10 {

	public static void main(String[] args) {
		
		int[][] numlist =new int[4][4];
		
		for(int i=0;i<numlist.length;i++) {
			for(int j=0;j<numlist[i].length;j++) {
				numlist[i][j]=(int)(Math.random()*10+1);
			}
		}
			
		for (int count=0;count<6;) {
			int j=(int)(Math.random()*3);
			int k=(int)(Math.random()*3);
			if(numlist[j][k]!=0) {
				numlist[j][k]=0;
				count++;
			}
		}
		
		for (int i=0;i<numlist.length;i++) {
			for(int j=0;j<numlist[i].length;j++) {
				System.out.print(numlist[i][j]+"\t");
			}System.out.println();
		}
	}
}


