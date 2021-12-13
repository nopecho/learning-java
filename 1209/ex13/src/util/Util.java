package util;

import vo.Memory;
import vo.SuperCom;
import java.util.Scanner;

public class Util {
    public static final Scanner sc = new Scanner(System.in);

    public static void startMsg(){
        System.out.println("수퍼컴이 작동합니다. 프로그램을 입력하세요. Go를 입력하면 작동");
    }

    public static void insertCommandMsg(){
        System.out.print(">> ");
    }

    public static void commandErrorMsg(){
        System.out.println("해당 명령은 존재 하지 않습니다.");
    }

    public static void exitMsg(){
        System.out.println("프로그램을 종료합니다.");
    }

    public static void notFindKey(){
        System.out.println("해당 변수를 찾을수 없습니다.");
    }

    public static void comResultMsg(int result){
        System.out.println("\n출력할 결과는 "+result+" . 프로그램 실행 종료");
    }

    public static void superComAllMsg(SuperCom com){
        System.out.println("[prt "+com.getResultOfName()+" 0]");
        for(Memory memory : com.getMemory()){
            for(String key : memory.getMemoryAddr().keySet()){
                System.out.print(key+":"+memory.getMemoryAddr().get(key)+"\t ");
            }
        }
    }

    public static String findMemoryKey(SuperCom com, String Key){
        for(Memory memory : com.getMemory()){
            if(memory.getMemoryAddr().containsKey(Key)){
                return Key;
            }
        }return null;
    }

    public static Integer findMemoryValue(SuperCom com,String value){
        for(Memory memory : com.getMemory()){
            if(memory.getMemoryAddr().containsKey(value)){
                return memory.getMemoryAddr().get(value);
            }
        }return null;
    }

    public static Integer castingValue(SuperCom com,String value){
        try {
            return Integer.parseInt(value);
        }catch (Exception e){
            return Util.findMemoryValue(com,value);
        }
    }
}
