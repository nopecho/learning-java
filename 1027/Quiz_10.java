
public class Quiz_10 {

	public static void main(String[] args) {
		char[] abcCode= {
				'~','!','@','#','$','%','^','&','*','(',')','-','_','+',
				'=','|','[',']','{','}',';',':',',','.','/'};
				
		char[] numCode= {'q','w','e','r','t','y','u','i','o','p'};
		
		String src="abc123";
		String result="";
		
		for(int i=0;i<src.length();i++) {
			char ch=src.charAt(i); //ch= src의 문자열을 각각의 char형으로 
			
			for(int j=0;j<abcCode.length;j++) {
				char A=97;
				char a;
				a=abcCode[j];
				abcCode[j]=A;	
				if(ch==abcCode[j]) {
					result+=a;
					A++;
				}
			}
			for(int k=0;k<numCode.length;k++) {
				char A=0;
				char a;
				a=numCode[k];
				numCode[k]=A;
				if(ch==abcCode[k]) {
					result+=a;
					A++;
				}
			}
		}
		
		System.out.println("src : "+src);
		System.out.println("result : "+result);
	}

}
