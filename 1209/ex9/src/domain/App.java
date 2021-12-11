package domain;

public class App {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<>();
        for(int i=0;i<10;i++) stack.push(i);
        while(true){
            Integer n = stack.pop();
            if(n == null) break;
            System.out.print(n+" ");
        }
    }
}
