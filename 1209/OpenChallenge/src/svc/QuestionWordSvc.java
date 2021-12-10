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

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                words[i] = list.get((int) (Math.random() * list.size()));
            }
            for (int j = 0; j < i; j++) { //중복 제거
                if (words[j].equals(words[i])) {
                    words[i] = null;
                    i--;
                }
            }
        }
        Util.printSelcetWord(words);
        int selct = sc.nextInt();
        if (selct == -1) return null;
        return words[selct - 1];
    }
}