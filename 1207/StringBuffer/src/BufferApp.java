import java.util.StringTokenizer;

public class BufferApp {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("java");
        System.out.println(sb.length()); // 4
        System.out.println(sb.capacity()); // 16 (초기 StringBuffer크기)
        System.out.println(sb);

        sb.insert(4," my"); //insert()함수 호출시 버퍼의 길이보다 크면 오류
        System.out.println(sb);
    }
}
