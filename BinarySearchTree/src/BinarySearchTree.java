public class BinarySearchTree {

    private BinaryNode root;

    BinarySearchTree(){
        root = null;
    }

    // Insert Method

    private BinaryNode insert(BinaryNode currentNode, int value){
        if(currentNode == null){
            BinaryNode newNode = new BinaryNode();
            newNode.setValue(value);
        }
    }
}
