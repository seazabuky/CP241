public class MyNode {
    private MyNode node;
    private Object data;
    public MyNode(Object data, MyNode nextNode) {
        this.data = data;
        this.node = nextNode;
    }
    public MyNode(Object data) {
        this(data, null);
    }
    public void setNextNode(MyNode nextNode) {
        node = nextNode;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public MyNode getNextNode() {
        return node;
    }
    public Object getData() {
        return data;
    }
    
}
 