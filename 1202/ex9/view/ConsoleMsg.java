package view;

import dto.*;

public class ConsoleMsg {
    public void printUserSettingMsg(){
        System.out.print("플레이어 이름을 설정해 주세요 : ");
    }
    public void printUserPick(User user){
        System.out.print("["+user.getName()+"] 가위(1), 바위(2), 보(3), 종료(4) : ");
    }
    public void printComparison(User user,Com com){
        System.out.println(user.getName()+"("+user.getValue()+") : COM("+com.getValue()+")");
    }
    public void printGameResult(Object obj){
        if(obj instanceof Com){
            obj=(Com)obj;
        }else if(obj instanceof User){
            obj=(User)obj;
        }else if(obj == null){
            System.out.println("무승부 입니다.");
            return;
        }
        System.out.println("승자 : "+obj);
    }
}
