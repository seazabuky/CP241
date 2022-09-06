public class StudentLinkedList implements StudentADT {
    MyNode firstNode;
    MyNode lastNode;
    MyNode currentNode,p;
    int totalStd;
    Stat statADT;

    StudentLinkedList(){
        firstNode = lastNode = currentNode = null;
        totalStd = 0;
    }
    @Override
    public Student getCurrentStudent(){
        MyNode outputNode = currentNode;
        currentNode = currentNode.getNextNode();
        return outputNode.getData();
    }
    @Override
    public void setCurrentStudent(Student std){
        if(empty()){
            statADT = new Stat();
            lastNode = new MyNode(std);
            firstNode = lastNode;
            currentNode = firstNode;
            statADT.setData(currentNode.getData().getTotalScore());
            totalStd++;
        }else{
            lastNode.setNextNode(new MyNode(std));
            lastNode = lastNode.getNextNode();
            statADT.setData(lastNode.getData().getTotalScore());
            totalStd++;
        }
    }
    @Override
    public int getLength(){
        return -1;
    }
    @Override
    public boolean empty() {
        return firstNode == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public double getMean() {
        return statADT.getMean();
    }

    @Override
    public double getSD() {
        return statADT.getSD();
    }

    @Override
    public double getMax() {
        return statADT.getMax();
    }

    @Override
    public double getMin() {
        return statADT.getMin();
    }

    @Override
    public double getTotal() {
        return statADT.getTotal();
    }
    
}
