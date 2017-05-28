package skipList;

/**
 * 跳跃表节点类型
 * Created by 张志鹏 on 2017/5/2.
 */
public class Node {
    public String key;
    public int value;
    public Node up, down, left, right;
    public static String tou = new String("--头--");
    public static String wei = new String("--尾--");
    public Node(){

    }

    public Node(String k, int v) {
        this.key = k;
        this.value = v;
        up = down = left = right = null;
    }
    public void setUp(Node up) {
        this.up = up;
    }
    public Node getUp() {
        return up;
    }
    public void setDown(Node down) {
        this.down = down;
    }
    public Node getDown() {
        return down;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getLeft() {
        return left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public Node getRight() {
        return right;
    }
    public void setKey(String k) {
        this.key = k;
    }
    public String getKey() {
        return key;
    }
    public void setValue(int v) {
        this.value = v;
    }
    public int getValue() {
        return value;
    }

}
