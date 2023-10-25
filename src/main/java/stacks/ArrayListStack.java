package stacks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private List<T> stack;
    //back the stack into an array list
    //we haven't declared it yet

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }
   // we declare it here





    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }
//checks if empty
    @Override
    public T peak() {
        return this.stack.get(this.stack.size() - 1);
    }
//looks at the top of the stack
    @Override
    public T pop() {
        return this.stack.remove(this.stack.size() - 1);
    }

    @Override
    public void push(T element) {
        this.stack.add(element);
    }

    @Override
    public int search(T item) {
        return this.stack.size() - this.stack.lastIndexOf(item);
    }
//difference between the first intancse
}
