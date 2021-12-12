package svc;

import util.*;
import vo.Word;

public class InsertWord {
    public Word insertWords() {
        Util.printInsertWord();
        String word = Util.sc.nextLine();
        String[] words = word.split(" ");
        if (words[0].equals("그만")) return null;
        return new Word(words[0], words[1]);
    }

    public void saveWord(DB db, Word insertWord) {
        for (Word word : db.getWords()) {
            if (word.getEng().equals(insertWord.getEng())) {
                Util.printOverlapWord();
                return;
            }
        }
        db.getWords().add(insertWord);
    }
}
