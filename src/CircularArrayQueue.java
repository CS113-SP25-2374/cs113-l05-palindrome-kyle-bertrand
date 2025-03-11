public class CircularArrayQueue<E> implements QueueInterface<E>{

    private staric final int DEFAULT_CAPACITY = 10;
    private E[] queue;
    private int front;
    private int rear;
    private int size;

    @Override
    public boolean add(E e){
        //| | Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available. |
        if(size ==0){
            throw new IllegalStateException("Queue is full.");
        }
        queue[rear] = e;
        rear = (rear +1) % queue.length;
        size++;
        return true;
    }

    @Override
    public E element(){
        //| | Retrieves, but does not remove, the head of this queue. |
        if(size == 0){
            throw new NoSuchElementException("Queue is empty.");
        }
        return queue[front];
    }

    @Override
    public boolean offer(E e){
        //| | Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. |
        if(size == queue.length){
            return false;
        }
        queue[rear] = e;
        rear = (rear +1) % queue.length;
        size++;
        return true;
    }

    @Override
    public E peek();
    //| | Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. |

    @Override
    public E poll(){
        //| | Retrieves and removes the head of this queue, or returns null if this queue is empty. |
        if(size == 0){
            return null;
        }
        E element = queue[front];
        queue[front] = null;
        front = (front +1) % queue.length;
        size--;
        return element;
    }

    @Override
    public E remove(){
        //| | Retrieves and removes the head of this queue. |
        if(size == 0){
            throw new NoSuchElementException("Queue is empty.");
    
        }
        E element = queue[front];
        queue[front] = null;
        front = front(front+1) % queue.length;
        size--;
        return element;
        }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0 ;
    }
}