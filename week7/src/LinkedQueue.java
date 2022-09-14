public class LinkedQueue implements QueueADT {
    Object e;
    MyNode head,tail;
    int size;

    public LinkedQueue() {
        Queue();
    }

    @Override
    public void Queue() {
        head=tail=null;
    }

    @Override
    public void enqueue(Object e) throws Exception {
        MyNode n = new MyNode(e);
        if (isEmpty()) {
            head = tail = n;
        }else{
            tail.setNextNode(n);
            tail = n;
        }
    }

    @Override
    public Object dequeue() throws Exception {
        return null;
    }
    @Override
    public Object front() throws Exception {
        return null;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {
        
    }

    @Override
    public int length() {
        return 0;
    }
    

}
