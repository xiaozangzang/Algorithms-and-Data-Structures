package tree.binarySearchTree;

/**
 * Binary Sort Tree二叉排序树（二叉查找树）
 * 操作：增删改查
 * Created by 张志鹏 on 2017/5/2.
 */
public class BSTree {
    private Node root;
    public BSTree(){
        root = null;
    }

    //增加一个结点
    public void insert(Object data){
        if(root == null){
            root = new Node();
            root.setData(data);
            return;
        }
    }

}
