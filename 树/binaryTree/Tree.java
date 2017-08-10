package tree.binaryTree;

/**
 * 瀹炵幇瀵逛簩鍙夋爲鐨勫墠涓悗閬嶅巻銆佹煡鎵炬寚瀹氬厓绱犮€佹眰浜屽弶鏍戞繁搴︺€傚垽鏂袱妫典簩鍙夋爲鏄惁鐩哥瓑銆?
 * Created by 寮犲織楣?on 2017/5/2.
 */
public class Tree {
    private Node root;
    public Tree(){
        this.root = root;
    }
    public Tree(Node root){
        this.root = root;
    }
    //鍓嶅簭閬嶅巻锛岄€掑綊瀹炵幇
    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.getData());
            preOrder(node.getLchild());
            preOrder(node.getRchild());
        }
    }
    //涓簭閬嶅巻,閫掑綊瀹炵幇
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.getLchild());
            System.out.println(node.getData());
            inOrder(node.getRchild());
        }
    }
    //鍚庡簭閬嶅巻锛岄€掑綊瀹炵幇
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.getLchild());
            postOrder(node.getRchild());
            System.out.println(node.getData());
        }
    }
    //鏌ユ壘鎸囧畾鍏冪礌
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
    //姹備簩鍙夋爲娣卞害
    public int getDepth(Node node){
        if(node != null){
            int lDepth = getDepth(node.getLchild());
            int rDepth = getDepth(node.getRchild());
            return 1 + (lDepth > rDepth ? lDepth:rDepth);
        }
        return 0;
    }
    //鍒ゆ柇涓ゆ５浜屽弶鏍戞槸鍚︾浉绛?
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
