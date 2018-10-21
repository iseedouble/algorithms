
public class BinaryTree {

    Node root;

public void addNode(int key, String name){

Node node = new Node(key, name);

    if(root == null){

       root = node;
    } else {
    Node tempNode = root;
    Node parent;

        while(true){
            parent = tempNode;

            if(node.key < tempNode.key){
                tempNode = tempNode.leftChild;
                if(tempNode == null){
                    parent.leftChild = node;
                    return;
                }
            } else {
                tempNode = tempNode.rightChild;
                if(tempNode == null){
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }

}

public static void inorderTranverserTree(Node root){

    if(root != null){
        inorderTranverserTree(root.leftChild);
        System.out.println(root.key + " " + root.name);
        inorderTranverserTree(root.rightChild);
    }
}


public static void main(String args[]) {

    
    BinaryTree tree = new BinaryTree();
    tree.addNode(50, "Steven");
    tree.addNode(10, "Steven1");
    tree.addNode(30, "Steven2");
    tree.addNode(32, "Steven3");
    tree.addNode(5, "Steven4");
    tree.addNode(58, "Steven5");
    tree.addNode(149, "Steven6");
    tree.addNode(17, "Steven7");

    inorderTranverserTree(tree.root);
}

}

class Node {

    int key;
    String name;
    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

}