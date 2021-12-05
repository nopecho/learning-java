package svc;

import view.MainUi;

public class ComPickSvc {
    public void randPick() {
        MainUi.com.setvalue(MainUi.SPR.getSpr()[(int) (Math.random() * 3)]);
    }
}
