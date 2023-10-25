package stacks;

public interface Stack<E> {
    //methods in stack
    boolean empty();
    E peak();
    E pop();
    void push(E element);
    int search(E item);
    // returns one base position, returns topmost item
}
