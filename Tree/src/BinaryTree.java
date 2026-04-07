class Node{

    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

}

public class BinaryTree {

    Node root;
    BinaryTree(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root,data);
    }


    public Node insertRec(Node current, int data) {
        if(current == null){
            return new Node(data);
        }
        else if(data < current.data){
            current.left = insertRec(current.left,data);
        }
        else if(data > current.data){
            current.right = insertRec(current.right,data);
        }
        return current;
    }


    public void inOrder(){
        inOrderRec(root);


    }

    private void inOrderRec(Node current) {
        if (current == null) return;

        inOrderRec(current.left);
        System.out.print(current.data + " ");
        inOrderRec(current.right);
    }

}
