public class TreeTest {
    
    public static void main(String[] args){
        
        Employee s1 = new Employee(1, "A", 10);
        Employee s2 = new Employee(2, "B", 20);
        Employee s3 = new Employee(3, "C", 30);
        Employee s4 = new Employee(4, "D", 40);
        Employee s5 = new Employee(5, "E", 50);
        Employee s6 = new Employee(6, "F", 60);
        Employee s7 = new Employee(7, "G", 70);
        Employee s8 = new Employee(8, "H", 80);
        Employee s9 = new Employee(9, "I", 90);
        Employee s10 = new Employee(10, "J", 100);
        Employee s11 = new Employee(11, "K", 110);
        Employee s12 = new Employee(11, "K", 120);
        
        //                  root
        //            b      c        d
        TreeNode root = new TreeNode(s1);
        Tree tree = new Tree(root);
        
        //
        //tree.addTreeNode(parent, node-to-be-added)
        TreeNode b = new TreeNode(s2);
        TreeNode c = new TreeNode(s3);
        TreeNode d = new TreeNode(s4);
        tree.addTreeNode(root, b);
        tree.addTreeNode(root, c);
        tree.addTreeNode(root, d);
        
        //             b
        //          e     f
        TreeNode e = new TreeNode(s5);
        TreeNode f = new TreeNode(s6);
        tree.addTreeNode(b, e);
        tree.addTreeNode(b, f);
        
        //                   c
        //                g     h
        TreeNode g = new TreeNode(s7);
        TreeNode h = new TreeNode(s8);
        tree.addTreeNode(c, g);
        tree.addTreeNode(c, h);
        
        //                 f
        //             i   j   k
        TreeNode i = new TreeNode(s9);
        TreeNode j = new TreeNode(s10);
        TreeNode k = new TreeNode(s11);
        tree.addTreeNode(f, i);
        tree.addTreeNode(f, j);
        tree.addTreeNode(f, k);
        
        TreeNode l = new TreeNode(s12);
        tree.addTreeNode(f,l);//Test addTreeNode if the same employee
        
        
        //                           root
        //            b               c              d
        //         e     f         g     h
        //           i   j   k  
        
        //Internal node/ External node
        System.out.println("Internal: "+tree.isInternal(k));
        System.out.println("External: "+tree.isExternal(k));
        
        System.out.println("Depth = "+tree.depth(e));
        System.out.println("Height ===> "+tree.height(root));
               
        System.out.println("preOrder Traversal:");
        tree.preOrderTraversal(root);
        //(1, A), (2, B), (5, E), (6, F), (, I), (, J), (, K), (, C), (, G), (, H), (, D)
             
        System.out.println("\n");
        
        System.out.println("postOrder Traversal:");
        tree.postOrderTraversal(root);
        //(, E), (, I), (, J), (, K), (, F), (, B), (, G), (, H), (, C), (, D), (, A)
        System.out.println("\n");
        System.out.println("Number of tree nodes: "+tree.size());
        System.out.println("\n");
        System.out.println("BreadthFirst Traversal:");
        tree.breadthFirst(root);
        //(, A), (, B), (, C), (, D), ...., (, K)
        
    }
}
