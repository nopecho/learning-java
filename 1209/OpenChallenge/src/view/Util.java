package view;

import vo.Word;

import java.util.List;

public class Util {
    public static void startMsg(String appName) {
        System.out.println(appName + "의 단어 테스트를 시작합니다.");
    }

    public static void countWordMsg(List<Word> list) {
        System.out.println("현재 " + list.size() + " 개의 단어가 들어가 있습니다.");
    }

    public static void successMsg() {
        System.out.println(" * 정답 * ");
    }

    public static void failMsg() {
        System.out.println(" ! 오답 !");
    }

    public static void exitMsg(String appName) {
        System.out.println(appName + "을 종료 합니다..ㅜㅜ");
    }

    public static void insertWord(List<Word> list) {
        list.add(new Word("love","사랑"));
        list.add(new Word("animal","동물"));
        list.add(new Word("baby","아기"));
        list.add(new Word("baer","곰"));
        list.add(new Word("snow","눈"));
        list.add(new Word("photograph","사진"));
        list.add(new Word("person","사람"));
        list.add(new Word("deal","거래"));
        list.add(new Word("eye","사람 눈"));
        list.add(new Word("face","얼굴"));
    }
}
