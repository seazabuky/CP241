

interface StackADT {
    //push pop top isEmpty isFull
    public void push(Object item)throws Exception; 
    public Object pop()throws Exception;
    public Object top()throws Exception;
    public boolean isEmpty();
    public boolean isFull();
    public void clear();
    
}
