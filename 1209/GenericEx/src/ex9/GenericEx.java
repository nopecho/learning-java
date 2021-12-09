package ex9;

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
}

public class GenericEx {
    public static void main(String[] args) {
        GStrack<String> stringGStrack = new GStrack<>();
        stringGStrack.push("서울");
        stringGStrack.push("대구");
        stringGStrack.push("부산");

        for (Object city : stringGStrack.getStack()) {
            System.out.println((String) city);
        }
        for(int m = 0 ; m<3;m++){
            System.out.println(stringGStrack.pop());
        }
    }
}
