package tree.BalancedBinarySearchTree;

/**平衡二叉树(AVL)
 * 是一种二叉排序树，其中每一个节点的左右字子树的高度差不超过1。
 *二叉树左右子树深度的差值称为平衡因子。
 *
 * 提高了查找操作的速度，但是使得插入和删除操作复杂化，从而降低了插入和删除操作的速度。
 * 在平衡二叉树上进行查找的时间复杂度为O(log2n)
 *
 * Created by 张志鹏 on 2017/5/2.
 */
public class AVLTree {
    public Node root;

    //中序遍历
    public void inOrder(Node temp){
        if(temp != null){
            inOrder(temp.leftChild);
            System.out.println(temp.data);
            inOrder(temp.rightChild);
        }
    }
    //计算树深
    public int nodeHigh(Node temp){
        //如果结点为空，则返回-1，否则返回此结点的高度
        return temp == null?-1:temp.height;
    }
    //插入新结点
    public void insert(int element){
        root = insert(element,root);
    }
    //
    public Node insert(int data,Node rot){
        if(rot == null){
            return new Node(data);
        }
        if(data == rot.data){
            System.out.println("已存在！");
            return null;
        }
        //
        if(data < rot.data){
            rot.leftChild = insert(data,rot.leftChild);
            if(nodeHigh(rot.leftChild) - nodeHigh(rot.rightChild) == 2){
                /*

                 */
                if(data < rot.leftChild.data){
                    /*
                     * 若插入结点在根节点的左侧，则用距离插入点最近的根节点，因为插入在左侧 所以左侧的树的高度也许会升高
                     * 所以用最近根节点的左子树的高度减去其右子树的高度，若右子树的高度为0则右子树的高度返回-1；否则返回右子树的高度
                     * 因为插入之前的整棵树是平衡的 若插入左子树之后，以距离插入节点最近的根节点的高度会+1，再加上平衡树的性质（根节点左右子树的高度差的绝对值不会超过1）
                     * 因此 插入节点之后 若右子树与右子树的差为2的话 ，则说明树的平衡被打破，变得不平衡
                     */
                    rot = R_R(rot);

                }else{
                    //
                    rot = L_R(rot);
                }
            }
        }else if(data > rot.data){
            rot.rightChild = insert(data,rot.rightChild);
            if(nodeHigh(rot.rightChild) - nodeHigh(rot.leftChild) == 2){
                if(data < rot.rightChild.data){
                    rot = R_L(rot);
                }else{
                    rot = _L_L(rot);
                }
            }
        }
        rot.height = Math.max(nodeHigh(rot.leftChild),nodeHigh(rot.rightChild)) + 1;
        return rot;

    }


}



















