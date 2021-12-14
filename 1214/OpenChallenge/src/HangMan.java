import java.io.*;
import java.util.*;

public class HangMan {
    private Scanner sc;
    private final List<String> wordsList = new ArrayList<>();

    HangMan() {
        try {
            sc = new Scanner(new FileReader("d:/words.txt"));
            saveWords(sc);
            sc.close();
        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
        }
    }

    public void run() {
        System.out.println("행맨 게임 시작");
        do {
            String questionWord = wordsList.get((int) (Math.random() * wordsList.size()));
            showQuestionWord(questionWord);
        } while (continueGame());
    }

    private void saveWords(Scanner sc) {
        while (sc.hasNext()) {
            String word = sc.nextLine();
            wordsList.add(word);
        }
    }

    private void showQuestionWord(String word) {
        sc = new Scanner(System.in);
        int hideCount = 1;
        String hideWord = makeHideWord(word, hideCount);

        System.out.println(hideWord);
        for (int i = 0; i < 5; i++) {
            System.out.print(">>");
            String insert = sc.next();
            Integer index = checkWord(word,hideWord,insert);
            if (index !=null) {
                hideWord = correctWord(hideWord, insert, index);
            }
            System.out.println(hideWord);
            if (hideWord.equals(word)) {
                return;
            }
        }
        System.out.println("5번 실패\n" + word);
    }

    private boolean continueGame() {
        sc = new Scanner(System.in);
        System.out.print("next?[ y , n ] : ");
        String chose = sc.next();
        if (chose.equals("y")) return true;
        else if (chose.equals("n")) return false;
        System.out.println("y 또는 n을 입력하세요");
        return true;
    }

    private String makeHideWord(String word, int hideCount) {
        char[] hideWords = word.toCharArray();
        for (int i = 0; i < hideCount; i++) {
            int rand = (int) (Math.random() * hideWords.length);
            if (hideWords[rand] == '-') {
                i--;
                continue;
            }
            hideWords[rand] = '-';
        }
        return String.valueOf(hideWords);
    }

    private String correctWord(String hideWord, String insert, int index) {
        char[] hideArray = hideWord.toCharArray();
        hideArray[index] = insert.charAt(0);
        return String.valueOf(hideArray);
    }

    private Integer checkWord(String word, String hideWord, String insert) {
        char[] originWords = word.toCharArray();
        char[] hideWords = hideWord.toCharArray();
        char insertC = insert.charAt(0);
        for (int i = 0; i < originWords.length; i++) {
            if((hideWords[i]=='-') && (originWords[i] == insertC)){
                return i;
            }
        }return null;
    }
}
