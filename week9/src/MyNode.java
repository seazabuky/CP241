public class MyNode {
    
    private Object data;
    private MyNode nextNode;
    
    public MyNode(Object aData, MyNode aNextNode){
        data = aData;
        nextNode = aNextNode;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @return the nextNode
     */
    public MyNode getNextNode() {
        return nextNode;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(MyNode nextNode) {
        this.nextNode = nextNode;
    }
    
  
}
