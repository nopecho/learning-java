package dao;

import svc.TestWord;
import util.*;
import vo.Word;
import java.util.InputMismatchException;
import java.util.List;

public class TestWordDao implements Dao {
    @Override
    public void response(DB db) {
        TestWord test = new TestWord();
        List<Word> list = db.getWords();

        Util.printStartTestMsg(db);
        Word questionWord;
        Word answerWord;
        while (true) {
            try {
                questionWord = test.getQuestionWord(list);
                Util.printQuestionWord(questionWord);
                answerWord = test.getAnswerWord(list, questionWord);
                if (answerWord == null) return;
                if (test.checkWord(questionWord, answerWord)) Util.successMsg();
                else Util.failMsg();
            } catch (Exception e) {
                if (e instanceof InputMismatchException) {
                    Util.sc.nextLine();
                    Util.errorMsg();
                } else {
                    return;
                }
            }
        }
    }
}
