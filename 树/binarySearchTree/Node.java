package tree.binarySearchTree;

/**
 * 二叉树的结点类
 * 数据域、指针域（左、右）
 * Created by 张志鹏 on 2017/5/2.
 */
public class Node {
    private Object data;
    private Node lchild,rchild;
    public Node(){
        this(null);
    }
    public Node(Object data){
        this(data,null,null);
    }
    public Node(Object data, Node lchild, Node rchild){
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setLchild(Node lchild) {
        this.lchild = lchild;
    }

    public void setRchild(Node rchild) {
        this.rchild = rchild;
    }

    public Object getData() {
        return data;
    }

    public Node getLchild() {
        return lchild;
    }

    public Node getRchild() {
        return rchild;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
