package test;
import java.util.Arrays;
import java.util.Collections;

public class app {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1578979529));
    }
}
class Solution {
    public long solution(long n) {
        String[] test = String.valueOf(n).split("");
        Arrays.sort(test,Collections.reverseOrder());
        String result = String.join("", test);
        return Long.parseLong(result);
    }
}
