import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String query = "name=nopecho&addr=daego&age=26";
        StringTokenizer st = new StringTokenizer(query, "&");

        int n = st.countTokens();
        System.out.println(n);
        System.out.println(st); //st 자체는 StringTokenizer의 객체기 때문에 레퍼런스값을 출력함
        System.out.println(st.nextToken()); //st의 다음 토큰을 리턴
        int n2 = st.countTokens(); // nextToken()으로 토큰을 리턴하면 해당 토큰은 사라짐
        System.out.println(n2);

        StringTokenizer st2 = new StringTokenizer("홍길동/장화/홍련/콩쥐","/");
        while( st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        System.out.println(st2.countTokens()); // 모든 토큰을 리턴하고 나면 토큰개수는 0
    }
}
