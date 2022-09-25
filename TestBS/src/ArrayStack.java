

public class ArrayStack implements StackADT{
    private int top,total;
    private Object[] s;
    public ArrayStack(){
        top = -1;
        total = 100;
        s = new Object[total];
    }
    @Override
    public void push(Object item) throws Exception {
        if(isFull()){
            throw new Exception("Stack is Full");
        }else{
            top++;
            s[top] = item;
        }
    }

    @Override
    public Object pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is Empty");
        }else{
            Object temp = s[top];
            top--;
            return temp;
        }
    }

    @Override
    public Object top() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return s[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top+1 == total;
    }

    @Override
    public void clear() {
        top = -1;
    }
    
}
