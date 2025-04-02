public class Stack<E> implements StackInterface<E> {
   E[]array = (E[]) new Object[10];
   int size = 0;

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public E peek() {
        return array[size - 1];
    }

    @Override
    public E pop() {
        E temp = array[--size];
        array[size] = null;
        return temp;
    }

    @Override
    public Object push(Object obj) {
        array[size++] = (E)obj;
        return obj;
    }
}
