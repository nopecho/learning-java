package svc;

import java.util.*;

import view.*;
import vo.Word;

public class QuestionWordSvc {

    public Word question(List<Word> list) {
        return list.get((int) (Math.random() * list.size()));
    }

    public Word select(Word word, List<Word> list) {
        Scanner sc = new Scanner(System.in);
        Word[] words = new Word[4];
        words[(int) (Math.random() * 4)] = word;

        Set<Word> set = new HashSet<>();
        while (true){
            for (int i = 0; i < words.length; i++) {
                if (words[i] == null ) {
                    words[i] = list.get((int) (Math.random() * list.size()));
                }
            }
            Collections.addAll(set, words);
            if(set.size() == words.length){
                break;
            }else{
                words = new Word[4];
                words[(int) (Math.random() * 4)] = word;
            }
        }
        Util.printSelcetWord(words);
        int selct = sc.nextInt();
        if (selct == -1) {
            Util.exitMsg();
            Main.game = false;
            return null;
        }
        return words[selct - 1];
    }
}
