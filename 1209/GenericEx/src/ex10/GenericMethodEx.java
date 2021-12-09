package ex10;

class GStrack<T> {
    int tos;
    Object[] stack;

    GStrack() {
        tos = 0;
        stack = new Object[10];
    }

    public void push(T itme) {
        if (tos == 10) {
            return;
        }
        stack[tos] = itme;
        tos++;
    }

    public T pop() {
        if (tos == 0) {
            return null;
        }
        tos--;
        return (T) stack[tos];
    }

    public Object[] getStack() {
        return stack;
    }

    public void printStack(){
        for(Object a : stack){
            System.out.print(a+"\t");
        }
    }
}

public class GenericMethodEx {
    public static <T> GStrack<T> reverse(GStrack<T> a) {
        GStrack<T> newStack = new GStrack<>();
        while (true) {
            T temp;
            temp = a.pop();
            if (temp == null) {
                break;
            } else {
                newStack.push(temp);
            }
        }
        return newStack;
    }

    public static void main(String[] args) {
        GStrack<Double> gs = new GStrack<>();

        for (int i = 0; i < 5; i++) {
            gs.push((double) i);
        }
        gs = reverse(gs);
        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }
        gs.printStack();
    }
}

interface MyInterface<T> {
    void add(T a);
    T get();
}
