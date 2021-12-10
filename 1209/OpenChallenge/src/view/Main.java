package view;

import dao.*;
import java.util.*;
import controller.Controller;
import vo.Word;

public class Main {
    public static final List<Word> wordSet = new ArrayList<>();
    private final Controller controller = new Controller();
    public static boolean game=true;

    public void run(){
        Dao dao = new WordSettingDao();
        controller.request(dao);
        Util.startMsg();
        Util.countWordMsg(wordSet);

        while(game){
            dao = new QuestionWordDao();
            controller.request(dao);
            dao = null;
        }
    }
}