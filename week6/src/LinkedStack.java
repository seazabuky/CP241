public class LinkedStack implements MyStack{
    private MyNode top;
    public LinkedStack(){
        MyStack();
    }
    @Override
    public void MyStack() {
        top = null;
    }
    public void push(Object e )throws Exception{
        MyNode newNode = new MyNode(e);
        newNode.setNextNode(top);
        top = newNode;
    }
    public Object pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else{
        Object temp = top.getData();
        top = top.getNextNode();
        return temp;}
    }
    public Object top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return top.getData();
    }
    public boolean isEmpty(){
        return top == null;
    }
    public boolean isFull(){
        return false;
    }
    public void clear(){
        top = null;
    }
    // public String toString(){
    //     String s = "";
    //     MyNode temp = top;
    //     while(temp != null){
    //         s += temp.getData() + " ";
    //         temp = temp.getNextNode();
    //     }
    //     return s;
    // }
}
