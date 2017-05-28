package tree.BalancedBinarySearchTree;

/**
 * 平衡二叉树结点类
 * 数据域、左右子指针域。
 * Created by 张志鹏 on 2017/5/2.
 */
public class Node {
    public int data;
    public int height;
    public Node leftChild;
    public Node rightChild;

    public Node(int data){
        this.data=data;
        this.height=0;
        this.leftChild=this.rightChild=null;
    }

}
