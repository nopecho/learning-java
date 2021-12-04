package view;

import dto.*;

public class ConsoleMsg {
    public void printStartMsg() {
        System.out.println("10초에 가까운 사람이 이기는 게임 입니다.");
    }

    public void printGameContinueMsg(Player player) {
        System.out.print("[" + player.getName() + "] 시작 <Enter>키 입력 >>>");
    }

    public void printSetGamePlayerMsg() {
        System.out.print("플레이어 이름을 설정 하세요 : ");
    }

    public void printTenSecAfterMsg(Player player) {
        System.out.print("[" + player.getName() + "] 10초 예상 후 <Enter>키 입력 >>>");
    }

    public void printNowSecMsg(Time time) {
        System.out.println("현재 초 시간 : " + time.getNowSecond());
    }

    public void printGameSetMsg(int player1sec, int player2sec,Player winner) {
        if(winner == null){
            System.out.println("무승부 입니다.");
        }else{
        System.out.println(Main.players[0].getName() + "의 결과 :"+player1sec+", "+Main.players[1].getName()+"의 결과 :"+player2sec + ", 최종우승 :"+
                winner.getName());
        }
    }
}