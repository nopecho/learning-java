package view;

import dto.*;


public class ConsoleMsg {
    void printStartMsg(){
        System.out.println("10초에 가까운 사람이 이기는 게임 입니다.");
    }
    void printGameContinueMsg(Player player){
        System.out.println(player.getName()+" 시작 <Enter>키 입력 >>>");
    }
    void printSetGamePlayerMsg(){
        System.out.println("플레이어 이름을 설정 하세요 : ");
    }
    void printTenSecAfterMsg(){
        System.out.println("10초 예상 후 <Enter>키 입력 >>>");
    }
    void printNowSecMsg(Time time){
        System.out.println("현재 초 시간 : "+time.getNowSecond());
    }
    void printGameSetMsg(Player player1, Player player2, Time time){
        System.out.println(player1.getName()+"의 결과 :");
    }
}
