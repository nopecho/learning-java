package dao;

import svc.InsertWord;
import util.*;
import vo.Word;

public class InsertWordDao implements Dao {
    @Override
    public void response(DB db) {
        InsertWord insert = new InsertWord();
        Util.printInsertInfo();
        Util.sc.nextLine();
        while (true) {
            Word insertWord = insert.insertWords();
            if (insertWord == null) return;
            insert.saveWord(db, insertWord);
        }
    }
}
