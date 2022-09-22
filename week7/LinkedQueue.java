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
        size = 0;
    }

    @Override
    public void enqueue(Object e) throws Exception {
        MyNode n = new MyNode(e);
        if (isEmpty()) {
            head = tail = n;
            size++;
        }else{
            tail.setNextNode(n);
            tail = n;
            size++;
        }
    }

    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            if (head == tail) {
                e = head.getData();
                head = tail = null;
                size--;
            }else{
                e = head.getData();
                head = head.getNextNode();
                size--;
            }
            return e;
        }
    }
    @Override
    public Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            return head.getData();
        }
    }
    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int length() {
        return size;
    }
    

}
