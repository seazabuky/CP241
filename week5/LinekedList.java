class LinkedList implements ListADT{
    Object e;
    MyNode first,current;
    int size;
    
    public LinkedList(){
        List();
    }

    public void List() {
        first=current=null;
    }

    @Override
    public void insert(Object e) throws Exception {
        MyNode p = new MyNode(e,null);
        if(isEmpty()){
            first=current=p;
        }else{
            p.setNextNode(current.getNextNode());
            current.setNextNode(p);
            current=p;
        }
    }

    @Override
    public Object retrive() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }else{
            return current.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public void delete() throws Exception {
        MyNode previous;
        if (isEmpty()){
            throw new Exception("List is empty");
        }else{
            previous=first;
            if(previous==current && current.getNextNode()==null){
                first=current=null;
            }else if(previous==current && current.getNextNode()!=null){
                first=first.getNextNode();
                current=first;
            }else{
                while(previous.getNextNode()!=current){
                    previous=previous.getNextNode();
                }
                previous.setNextNode(current.getNextNode());
                current=first;
            }
        }
    }

    @Override
    public void update(Object e) throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }else{
            current.setData(e);
        }
    }

    @Override
    public void findFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }else{current = first;}
    }

    @Override
    public void findNext() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }else if(current.getNextNode() == null){throw new Exception("Not have a next node");}
        else{
            current = current.getNextNode();
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean findKey(Object tKey) {
        return this==tKey;
    }
}
