package yj_1026_Quiz;

import java.util.Scanner;

public class Quiz_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] main= {"국어","영어","수학","과학","사회"};
		int[] score= {98,48,75,15,46,80};
		
		while(true) {
			System.out.print("과목을 입력하세요 >>");
			String text=sc.next();
			if(text.equals("그만")) {
				break;
			}int count=0;
			for(int i=0;i<main.length;i++) {
				if(!text.equals(main[i])) {
					count++;
				}
				if(count==5) {
					System.out.println("없는 과목입니다.");
				}
			}
			for(int i =0;i<main.length;i++) {
				if(text.equals(main[i])) {
					System.out.println(main[i]+"는 "+score[i]+"점 입니다.");
				}
			}			
		}sc.close();		
	}
}
