class DoubleMyNode {
    private Object data;
    private DoubleMyNode nextNode,previousNode;
    DoubleMyNode(Object object){
        this(object,null);
    }
    DoubleMyNode(Object object,DoubleMyNode node){
        data = object;
        nextNode = node;
    }
    public Object getData(){
        return data;
    }
    public DoubleMyNode getPreviousNode(){
       return previousNode;
    }
    public DoubleMyNode getNextNode(){
        return nextNode;
    }
    public void setData(Object object){
        data = object;
    }
    public void setNextNode(DoubleMyNode node){
        nextNode = node;
    }
    public void setPreviousNode(DoubleMyNode node){
        previousNode = node;
    }
}
