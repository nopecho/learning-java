package domain;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements IStack<T> {
    private final List<T> stack = new ArrayList<>();
    @Override
    public T pop() {
        if(stack.isEmpty()) return null;
        int lastIndex = stack.size()-1;
        T obj = stack.get(lastIndex);
        stack.remove(lastIndex);
        return obj;
    }

    @Override
    public boolean push(T ob) {
        stack.add(ob);
        return true;
    }
}
