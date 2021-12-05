package dao;

import svc.UserSettingSvc;

import java.util.Scanner;

public class UserSettingDao implements Dao {
    @Override
    public void execute(Scanner sc) {
        UserSettingSvc userSettingSvc = new UserSettingSvc();
        String name = sc.next();
        userSettingSvc.setUser(name);
    }
}
