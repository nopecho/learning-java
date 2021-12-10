package dao;

import svc.QuestionWordSvc;
import view.*;
import vo.Word;

public class QuestionWordDao implements Dao{

    @Override
    public void response() {
        QuestionWordSvc questionSvc = new QuestionWordSvc();

        Word questionWord = questionSvc.question(Main.wordSet);
        Util.printQuestionWord(questionWord);
        Word selectWord = questionSvc.select(questionWord,Main.wordSet);

        if(selectWord==null) {
            Util.exitMsg();
            Main.game = false;
        }else if(questionWord.equals(selectWord)){
            Util.successMsg();
        }else{
            Util.failMsg();
        }
    }
}