import java.util.Iterator;

public class Tree implements TreeADT{
    private TreeNode root;
    private int size;
    
    public Tree(){
        this.root = null;
        this.size = 0;
    }
    public Tree(TreeNode root){
        this.root = root;
        size = 1;
    }
    @Override
    public TreeNode root() {
        return this.root;
    }

    @Override
    public TreeNode parent(TreeNode node) {
        return node.getParent();
    }

    @Override
    public Iterator<TreeNode> children(TreeNode node) {
        return node.getChildren().iterator();
    }

    @Override
    public int numChildren(TreeNode node) {
        return node.getChildren().size();
    }

    @Override
    public boolean isInternal(TreeNode node) {
        return numChildren(node)!=0;
    }

    @Override
    public boolean isExternal(TreeNode node) {
        return numChildren(node)==0;
    }

    @Override
    public boolean isRoot(TreeNode node) {
        return node.getParent()==null;
    }

    @Override
    public void preOrderTraversal(TreeNode node) {
        visit(node);
        Iterator<TreeNode> itr = children(node);
        while(itr.hasNext()){
            preOrderTraversal(itr.next());
        }
        
    }

    @Override
    public void postOrderTraversal(TreeNode node) {
        Iterator<TreeNode> itr = children(node);
        while(itr.hasNext()){
            postOrderTraversal(itr.next());
        }
        visit(node);
        
    }

    @Override
    public void breadthFirst(TreeNode node) {
        LinkedQueue q = new LinkedQueue();
        MyNode n = new MyNode(node,null);
        try{
            q.enqueue(n);
            while(!q.isEmpty()){
                MyNode p = q.dequeue();
                TreeNode t = (TreeNode)p.getData();
                visit(t);
                Iterator<TreeNode> itr = children(t);
                while(itr.hasNext()){
                    MyNode tmp = new MyNode(itr.next(),null);
                    q.enqueue(tmp);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void visit(TreeNode node) {
        System.out.println(node.getData());
    }

    @Override
    public void addTreeNode(TreeNode parent, TreeNode child) {
        if(parent.addChild(child)){
            size++;
        }
    }
        

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int depth(TreeNode node) {
        if(isRoot(node)){
            return 0;
        }
        return depth(node.getParent())+1;
    }

    @Override
    public int height(TreeNode node) {
        if(isExternal(node))
            return 0;
        return maxHeight(children(node))+1;
    }

    private int maxHeight(Iterator<TreeNode> children){
        int maxH = Integer.MIN_VALUE;
        while(children.hasNext()){
            int h = height(children.next());
            if(h>maxH){
                maxH = h;
            }
        }
        return maxH;
    }
    
}
