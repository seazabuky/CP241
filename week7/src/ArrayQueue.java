public class ArrayQueue implements QueueADT{
    private int total;
    private Object s[];
    int front,rear;
    public ArrayQueue(){
        Queue();
    }
    @Override
    public void Queue() {
        front = -1;
        rear = -1;
        total = 100;
        s = new Object[total];
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }else{
            rear = (rear+1)%total;
            s[rear] = e;
            if(front == -1){
                front = 0;
            }
        }
    }

    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            int removeitem = front;
            if(front==rear)
                front=rear=-1;
            else
                front=(front+1)%total;
            return s[removeitem];
            
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
        return rear == -1 && front == -1;
    }

    @Override
    public boolean isFull() {
        return rear==total;
    }

    @Override
    public void clear() {
        front=rear=-1;
    }

    @Override
    public int length() {
        if (isEmpty()) {
            return 0;}
        else{
            return rear-front+1;
        }
    }
    
}
