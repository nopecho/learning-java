package ex8_8;

import java.io.File;

public class FileEx {
    public static void listDirectory(File dir){
        System.out.println("---------"+dir.getPath()+"의 서브 리스트 입니다.---------");

        File[] subFile = dir.listFiles();

        for(File file : subFile){
            long t = file.lastModified();
            System.out.print(file.getName());
            System.out.print("\t파일크기 : "+file.length());
            System.out.printf("\t수정 시각 : %tb %td %ta %tT\n",t,t,t,t);
        }
    }
    public static void main(String[] args) {
        File file1 = new File("c:/Windows/system.ini");
        System.out.println(file1.getPath()+", "+file1.getParent()+", "+file1.getName());

        String res ="";
        if(file1.isFile()) res = "파일";
        else if(file1.isDirectory()) res = "디렉토리";
        System.out.println(file1.getPath()+"는 "+res+"입니다.");

        File file2 = new File("d:/make/test");
        if(!file2.exists()) file2.mkdir();

        listDirectory(new File("d:/make"));
        file2.renameTo(new File("d:/make/TEST"));
        listDirectory(new File("d:/make"));
    }
}
