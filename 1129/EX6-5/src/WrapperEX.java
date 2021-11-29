public class WrapperEX {
    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A')); //'A'를 소문자로 변환

        char c1='4', c2='F';
        if(Character.isDigit(c1)) System.out.println(c1+"은 숫자 입니다.");
        if(Character.isAlphabetic(c2)) System.out.println(c2+"는 영문자 입니다.");

        System.out.println(Integer.parseInt("-123")); //문자열"-123"을 10진수로 변환
        System.out.println(Integer.toHexString(123)); //정수 123을 16진수 문자열로 변환
        System.out.println(Integer.toBinaryString(123)); //정수 123을 2진수 문자열로 변환
        System.out.println(Integer.bitCount(123)); //123에 대한 2진수 1의 갯수

        Double d = Double.valueOf(3.14); //기본 데이터 타입3.14를 객체화
        System.out.println(d.toString()); //Double 객체를 문자열로 변환(Object의 toString()메소드)
    }
}
