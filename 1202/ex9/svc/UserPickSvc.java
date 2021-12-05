package svc;

import view.MainUi;

public class UserPickSvc {
    public void pickScissors(){
        MainUi.user.setvalue(MainUi.SPR.getScissors());
    }
    public void pickPaper(){
        MainUi.user.setvalue(MainUi.SPR.getPaper());
    }
    public void pickRock(){
        MainUi.user.setvalue(MainUi.SPR.getRock());
    }
}
