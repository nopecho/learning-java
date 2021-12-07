package view;

public class ConsoleMsg {

    public void startMsg() {
        System.out.print("문자를 입력하세요 >>");
    }

    public void printString(StringBuffer string) {
        System.out.println(string);
    }

    public void notFindStringMsg() {
        System.out.println("찾을 수 없습니다.");
    }

    public void callCommandMsg() {
        System.out.print("명령 : ");
    }

    public void exitProgramMsg() {
        System.out.println("종료합니다.");
    }

    public void invalidCommandMsg() {
        System.out.println("잘못된 명령 입니다.");
    }
}
