package dao;

import svc.QuestionWordSvc;

import java.util.Scanner;

public class QuestionWordDao implements Dao{

    @Override
    public void response(Scanner sc) {
        QuestionWordSvc questionWord = new QuestionWordSvc();
    }
}
