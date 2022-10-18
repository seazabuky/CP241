import java.util.Iterator;

interface TreeADT {
    
    //Accessor methods
    public TreeNode root();
    public TreeNode parent(TreeNode node);
    public Iterator<TreeNode> children(TreeNode node);
    public int numChildren(TreeNode node);
           
    //Query methods
    public boolean isInternal(TreeNode node);
    public boolean isExternal(TreeNode node);
    public boolean isRoot(TreeNode node);
    
    //Tree traversal
    public void preOrderTraversal(TreeNode node);
    public void postOrderTraversal(TreeNode node);
    public void breadthFirst(TreeNode node);
    public void visit(TreeNode node);
    
    //Build a tree
    public void addTreeNode(TreeNode parent, TreeNode child);
    
    //Properties
    public int size();
    public boolean isEmpty();
    public int depth(TreeNode node);
    public int height(TreeNode node);
   
}
