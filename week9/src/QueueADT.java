interface QueueADT<E> {

    public void enqueue(E e) throws Exception;

    public E dequeue() throws Exception;

    public E front() throws Exception;

    public boolean isEmpty();

    public boolean isFull();

    public void clear();

    public int size();

}
