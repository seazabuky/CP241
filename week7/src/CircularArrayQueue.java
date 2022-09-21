public class CircularArrayQueue implements QueueADT {
    private int total;
    private Object s[];
    int front,rear,count;
    public CircularArrayQueue(){
        Queue();
    }
    @Override
    public void Queue() {
        front = -1;
        rear = -1;
        count = 0;
        total = 2;
        s = new Object[total];
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }else{
            count++;
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
            if(front==rear){
                count=0;
                front=rear=-1;
            }else{
                count--;
                front=(front+1)%total;
            }
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
        return count==total;
    }
    @Override
    public void clear() {
        front=rear= -1;
        count=0;
    }
    @Override
    public int length() {
        return total;
    }
}