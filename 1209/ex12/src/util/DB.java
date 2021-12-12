package util;

import vo.Word;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private final List<Word> words = new ArrayList<>();

    public List<Word> getWords() {
        return words;
    }
}
