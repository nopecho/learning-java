package util;

public class MemberElementList {
    private final String[] element = {"아이디", "이름", "나이", "전화번호", "주소", "이메일", "취미"};
    private final String[] newElement;

    MemberElementList(String string) {
        newElement = new String[element.length];
        for (int i = 0; i < newElement.length; i++) {
            newElement[i] = string + element[i] + " : ";
        }
    }

    public String[] getElement() {
        return element;
    }

    public String[] getNewElement() {
        return newElement;
    }
}