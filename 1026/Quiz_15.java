package yj_1026_Quiz;

import java.util.Scanner;

public class Quiz_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] main= {"����","����","����","����","��ȸ"};
		int[] score= {98,48,75,15,46,80};
		
		while(true) {
			System.out.print("������ �Է��ϼ��� >>");
			String text=sc.next();
			if(text.equals("�׸�")) {
				break;
			}int count=0;
			for(int i=0;i<main.length;i++) {
				if(!text.equals(main[i])) {
					count++;
				}
				if(count==5) {
					System.out.println("���� �����Դϴ�.");
				}
			}
			for(int i =0;i<main.length;i++) {
				if(text.equals(main[i])) {
					System.out.println(main[i]+"�� "+score[i]+"�� �Դϴ�.");
				}
			}			
		}sc.close();		
	}
}
