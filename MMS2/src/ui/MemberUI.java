package ui;

import java.util.Scanner;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {
    public static Member[] memberArray = new Member[0];

    public static void main(String[] args) {
        MemberController memberController = new MemberController();
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        Action action = null;
        int menu = 0;
        do {
            System.out.println("====회원데이터 관리====");
            System.out.print("1.회원 가입");
            System.out.print("2.회원 목록 보기");
            System.out.print("3.회원 정보 수정");
            System.out.print("4.회원 정보 삭자");
            System.out.print("5.회원 정보 검색");
            System.out.print("6.프로그램 종료");
            System.out.println();

            System.out.println("메뉴 번호:");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    action = new MemberRegistAction();
                    break;
                case 2:
                    action = new MemberListAction();
                    break;
                case 3:
                    action = new MemberUpdateAction();
                    break;
                case 4:
                    action = new MemberDeleteAction();
                    break;
                case 5:
                    action = new MemberSearchAction();
                    break;
                case 6:
                    stop = true;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    break;
            }

            if (action != null) {
                memberController.processRequest(sc, action);
            }

        } while (!stop);
    }
}