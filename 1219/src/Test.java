public class Test {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int num) {
            int answer = 0;
            while(true){
                if(num%2==0){
                    num/=2;
                }else{
                    num*=3;
                    num++;
                }
                answer++;
                if(num == 1){
                    return answer;
                }else if(answer == 500){
                    return -1;
                }
            }
        }
    }

    class Solutions{
        boolean solution(String s) {
            s.toLowerCase();
            if(!s.contains("p") && !s.contains("y")) return true;

            char[] test = s.toCharArray();
            int i=0;
            int j=0;
            for(char x : test){
                if(x =='p'){
                    i++;
                }else if( x == 'y'){
                    j++;
                }
            }
            return i == j;
        }
    }
}
