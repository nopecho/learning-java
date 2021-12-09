package view;

import dao.*;
import java.util.*;
import controller.Controller;
import vo.Word;

public class Main {
    private final String appName;
    public static final List<Word> wordSet = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    private final Controller controller = new Controller();
    private Dao dao;

    public Main(String appName){
        this.appName=appName;
    }

    public void run(){
        Util.startMsg(appName);
        Util.countWordMsg(wordSet);
        dao = new WordSettingDao();
        controller.request(dao,sc);

        while(true){
            dao = new QuestionWordDao();
            controller.request(dao,sc);
            dao = new SelectWordDao();
            controller.request(dao,sc);
            dao = new CheckWordDao();
            controller.request(dao,sc);
        }
    }
}
