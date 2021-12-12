package svc;

import util.Util;
import vo.Word;

import java.util.List;

public class TestWord {

    public Word getQuestionWord(List<Word> list) {
        return list.get((int) (Math.random() * list.size()));
    }

    public Word getAnswerWord(List<Word> list, Word word) {
        Word[] words = new Word[4];
        words[(int) (Math.random() * 4)] = word;

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                words[i] = list.get((int) (Math.random() * list.size()));
            }
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    words[i] = null;
                    i--;
                }
            }
        }
        Util.printChoseWords(words);
        int chose = Util.sc.nextInt();
        if (chose == -1) return null;
        return words[chose - 1];
    }

    public boolean checkWord(Word question, Word answer) {
        return question.equals(answer);
    }
}
