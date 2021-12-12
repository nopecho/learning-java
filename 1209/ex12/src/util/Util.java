package util;

import vo.Word;

import java.util.List;
import java.util.Scanner;

public class Util {
    public static final Scanner sc = new Scanner(System.in);

    public static void printStartMsg() {
        System.out.println("*** 영어 단어 테스트 프로그램 ***");
    }

    public static void printChoseMenuMsg() {
        System.out.print("(1)단어 테스트, (2)단어 삽입, (3)종료 : ");
    }

    public static void printExitMsg() {
        System.out.println("단어테스트 종료");
    }

    public static void printStartTestMsg(DB db) {
        System.out.println(db.getWords().size() + " 개의 단어가 저장 돼있습니다.");
    }

    public static void printQuestionWord(Word word) {
        System.out.println(word.getEng() + " 는 ??");
    }

    public static void printChoseWords(Word[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print("(" + (i + 1) + ")" + words[i].getKor() + " ");
        }
        System.out.print(" : ");
    }

    public static void errorMsg() {
        System.out.println("숫자만 입력하세요!!");
    }

    public static void insertWord(List<Word> list) {
        list.add(new Word("love", "사랑"));
        list.add(new Word("animal", "동물"));
        list.add(new Word("baby", "아기"));
        list.add(new Word("baer", "곰"));
        list.add(new Word("snow", "눈"));
        list.add(new Word("photograph", "사진"));
        list.add(new Word("person", "사람"));
        list.add(new Word("deal", "거래"));
        list.add(new Word("eye", "사람 눈"));
        list.add(new Word("face", "얼굴"));
    }

    public static void successMsg() {
        System.out.println(" ** 정답 **");
    }

    public static void failMsg() {
        System.out.println(" !! 오답 !!");
    }

    public static void printInsertInfo() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
    }

    public static void printInsertWord() {
        System.out.print("[영어 한글]로 입력하세요: ");
    }

    public static void printOverlapWord() {
        System.out.println("이미 존재하는 단어 입니다.");
    }
}
