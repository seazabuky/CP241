public class ArrayQueue implements QueueADT{
    private int total;
    private Object s[];
    int front,rear,count;
    public ArrayQueue(){
        Queue();
    }
    @Override
    public void Queue() {
        front = -1;
        rear = -1;
        total = 3;
        s = new Object[total];
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }else{
            rear = rear+1;
            s[rear] = e;
        }
    }

    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            front = front+1;
            if (front == rear){
                int temp = front;
                front = rear = -1;
                return s[temp];
            }else{
                return s[front];
            }
            
        }
    }
    @Override
    public Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            return s[front];
        }
    }

    @Override
    public boolean isEmpty() {
        return rear == -1;
    }

    @Override
    public boolean isFull() {
        return rear+1==total;
    }

    @Override
    public void clear() {
        front=rear=-1;
    }

    @Override
    public int length() {
            return total;
    }
    
}
