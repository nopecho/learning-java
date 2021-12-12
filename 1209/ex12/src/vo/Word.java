package vo;

public class Word {
    private final String eng;
    private final String kor;

    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }

    public String getKor() {
        return kor;
    }
}
