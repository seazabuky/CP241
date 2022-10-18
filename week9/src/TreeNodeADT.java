
import java.util.Iterator;

public interface TreeNodeADT<E> {
    
    public boolean addChild(TreeNode child);
    public boolean addChild(E data);
    public void addChildren(Iterator<TreeNode> children);
       
    public boolean searchChildByKey(E key);
   
}
