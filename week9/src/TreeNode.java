import java.util.*;

public class TreeNode implements TreeNodeADT<Employee>{

    private TreeNode parent;
    private Employee data;
    private List<TreeNode> children;

    public TreeNode(){
        this.parent = null;
        this.data = null;
        this.children = new ArrayList<TreeNode>();
    }

    public TreeNode(Employee e){
        this.parent = null;
        this.data = e;
        this.children = new ArrayList<TreeNode>();
        
    }

    public TreeNode(Employee e, TreeNode p){
        this.parent = p;
        this.data = e;
        this.children = new ArrayList<TreeNode>();
    }
    @Override
    public boolean addChild(TreeNode child) {
        if(!searchChildByKey(child.getData())){
            this.children.add(child);
            child.setParent(this);
            return true;
        }

        return false;
    }

    @Override
    public boolean addChild(Employee data) {
        if(!searchChildByKey(data)){
            TreeNode tnode = new TreeNode(data);
            children.add(tnode);
            tnode.setParent(this);
            return true;
        }
        return false;
    }

    @Override
    public void addChildren(Iterator<TreeNode> children) {
        while(children.hasNext()){
            addChild(children.next());
        }
    }

    @Override
    public boolean searchChildByKey(Employee key) {
        Iterator<TreeNode> itr = children.iterator();
        while(itr.hasNext()){
            Employee e = itr.next().getData();
            if(e.equals(key)){
                return true;
            }
        }
        return false;
    }

    public TreeNode getParent() {
        return parent;
    }
    public void setParent(TreeNode p){
        this.parent = p;
    }
    
    public Employee getData(){
        return data;
    }
    public void setData(Employee e){
        this.data = e;
    }
    public List<TreeNode> getChildren(){
        return children;
    }
    public void setChildren(List<TreeNode> children){
        this.children = children;
    }
    
}
