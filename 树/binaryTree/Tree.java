package tree.binaryTree;

/**
 * 实现对二叉树的前中后遍历、查找指定元素、求二叉树深度。判断两棵二叉树是否相等。
 * Created by 张志鹏 on 2017/5/2.
 */
public class Tree {
    private Node root;
    public Tree(){
        this.root = root;
    }
    public Tree(Node root){
        this.root = root;
    }
    //前序遍历，递归实现
    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.getData());
            preOrder(node.getLchild());
            preOrder(node.getRchild());
        }
    }
    //中序遍历,递归实现
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.getLchild());
            System.out.println(node.getData());
            inOrder(node.getRchild());
        }
    }
    //后序遍历，递归实现
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.getLchild());
            postOrder(node.getRchild());
            System.out.println(node.getData());
        }
    }
    //查找指定元素
    public Node searchNode(Node node,Object obj){
        if(node != null){
            if(node.getData().equals(obj))
                return node;
            else{
                Node lresult = searchNode(node.getLchild(),obj);
                Node rresult = searchNode(node.getRchild(),obj);
            }
        }
        return null;
    }
    //求二叉树深度
    public int getDepth(Node node){
        if(node != null){
            int lDepth = getDepth(node.getLchild());
            int rDepth = getDepth(node.getRchild());
            return 1 + (lDepth > rDepth ? lDepth:rDepth);
        }
        return 0;
    }
    //判断两棵二叉树是否相等
    public boolean isEqual(Node node1,Node node2){
        if(node1 == null && node2 == null)
            return true;
        if(node1 != null && node2 != null)
            if(node1.getData().equals(node2.getData()))
                if(isEqual(node1.getLchild(),node2.getLchild()))
                    if(isEqual(node1.getRchild(),node2.getRchild()))
                        return true;
        return false;
    }
}
