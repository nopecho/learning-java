package dao;

import svc.WordSettingSvc;

public class WordSettingDao implements Dao{
    @Override
    public void response() {
        WordSettingSvc wordSetting = new WordSettingSvc();
        wordSetting.wordSetting();
    }
}
