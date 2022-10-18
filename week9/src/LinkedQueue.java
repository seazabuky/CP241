import javax.swing.*;

public class LinkedQueue implements QueueADT<MyNode> {

    private MyNode head;
    private MyNode tail;

    private int size;

    public LinkedQueue() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void enqueue(MyNode e) throws Exception {
        if (isEmpty()) {
            head = tail = e;
        } else {//Add to the back of the list
           //System.out.println("Hello in push");
            tail.setNextNode(e);
            tail = e;
        }
        size++;
    }

    @Override
    public MyNode dequeue() throws Exception {

        if (!isEmpty()) {
            MyNode node = head;
            head = head.getNextNode();
            node.setNextNode(null);
            size--;
            return node;
        } else {
            JOptionPane.showMessageDialog(null, "Queue is empty.");
            return null;
        }
    }

    @Override
    public MyNode front() throws Exception {
        return head;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {

        MyNode curNode = head;
        MyNode tmpNode = null;
        while (curNode != null) {
            tmpNode = curNode;
            curNode = curNode.getNextNode();
            tmpNode = null;
            size--;
        }
        //Do the above or just reset head=null, tail=null, and size=0
    }

    @Override
    public int size() {
        return size;
    }

}
