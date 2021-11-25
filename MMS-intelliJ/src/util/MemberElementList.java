package util;

import java.util.HashMap;

public class MemberElementList {
    private String[] element = {"아이디", "이름", "나이", "전화번호", "주소", "이메일", "취미"};
    private  String[] newElement;
    private HashMap<String,String> elementList = new HashMap<String,String>();
    private HashMap<String,Integer> elementOtherList = new HashMap<String,Integer>();

    MemberElementList(String string){
        newElement = new String[element.length];
        for(int i=0;i<newElement.length;i++){
            newElement[i]=string+element[i]+" : ";
        }
    }

    public String[] getElement(){ return element; }

    public String[] getNewElement(){ return newElement; }
}
