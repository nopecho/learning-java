package dao;

import svc.WordSettingSvc;

import java.util.Scanner;

public class WordSettingDao implements Dao{
    @Override
    public void response(Scanner sc) {
        WordSettingSvc wordSetting = new WordSettingSvc();
        wordSetting.wordSetting();
    }
}
