package view;

import util.DB;
import util.Util;

public class Main {
    public void run(){
        DB db = new DB();
        System.out.println("** 포인트 관리 시스템 **");
        while(true){
            if(Util.insertInfo(db)) Util.showMember(db);
            else break;
        }
    }
}
