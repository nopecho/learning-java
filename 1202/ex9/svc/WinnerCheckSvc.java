package svc;

import view.MainUi;

public class WinnerCheckSvc {
    public Object compare() {
        String userValue = MainUi.user.getValue();
        String comValue = MainUi.com.getValue();
        if (userValue.equals(comValue)) {
            return null;
        } else if (userValue.equals(MainUi.SPR.getPaper()) && comValue.equals(MainUi.SPR.getRock())) {
            return MainUi.user;
        } else if (userValue.equals(MainUi.SPR.getRock()) && comValue.equals(MainUi.SPR.getScissors())){
            return MainUi.user;
        } else if (userValue.equals(MainUi.SPR.getScissors()) && comValue.equals(MainUi.SPR.getPaper())){
            return MainUi.user;
        }else {
            return MainUi.com;
        }
    }
}
