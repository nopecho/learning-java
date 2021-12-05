package svc;

import view.MainUi;

public class UserSettingSvc {
    public void setUser(String name){
        MainUi.user.setName(name);
    }
}
