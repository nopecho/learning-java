package util;

import vo.Memory;
import vo.SuperCom;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Util {
    private Util(){};
    public static final Scanner sc = new Scanner(System.in);

    public static void startMsg() {
        System.out.println("슈퍼컴이 작동합니다. 프로그램을 입력하세요. go를 입력하면 작동");
    }

    public static void insertCommandMsg() {
        System.out.print(">> ");
    }

    public static void commandErrorMsg() {
        System.out.println("해당 명령은 존재 하지 않습니다.");
    }

    public static void notFindKeyMsg() {
        System.out.println("변수를 찾을수 없습니다.");
    }

    public static void exitMsg(){
        System.out.println("슈퍼컴 프로그램을 종료합니다.");
    }

    public static void printComResult(int result) {
        System.out.println("\n출력할 결과는 " + result + " . 프로그램 실행 종료");
    }

    public static void printComAllMemory(SuperCom com) {
        System.out.println("[prt " + com.getResultOfName() + " 0]");
        for (Memory memory : com.getMemory()) {
            for (String key : memory.getMemoryAddr().keySet()) {
                System.out.print(key.toUpperCase() + ":" + memory.getMemoryAddr().get(key) + "\t ");
            }
        }
    }

    public static String findMemoryKey(SuperCom com, String Key) {
        if(com.getMemory().stream().anyMatch(memory -> memory.getMemoryAddr().containsKey(Key))){
            return Key;
        }return null;
    }

    public static Integer getMemoryValue(SuperCom com, String key) {
        for (Memory memory : com.getMemory()) {
            if (memory.getMemoryAddr().containsKey(key)) {
                return memory.getMemoryAddr().get(key);
            }
        }
        return null;
    }

    public static Integer castingValue(SuperCom com, String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return Util.getMemoryValue(com, value);
        }
    }
}