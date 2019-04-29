package Tree;

public class MyBinarySearchTree {
    Node root;

    public Node add(Node n, int value) {
        if (n == null) {
            n = new Node(value);// fac un nod nou
        } else {
            if (value < n.info) {
                n.left = add(n.left, value);
            } else {
                n.right = add(n.right, value);
            }

        }
        return n;
    }

    public void showInOrder(Node n){
        if(n == null){
            return; // return fara valoare iese din metoda
        }else{
            showInOrder(n.left);
            System.out.print(n.info + " ");
            showInOrder(n.right);
        }
    }

    public void showPreOrder(Node n){
        if(n == null){
            return;
        }else{
            System.out.print(n.info + " ");
            showPreOrder(n.left);
            showPreOrder(n.right);
        }
    }
    public void showPostOrder(Node n){
        if(n == null){
            return;
        }else{
            showPostOrder(n.left);
            showPostOrder(n.right);
            System.out.print(n.info + " ");
        }
    }

    public void showOutOrder(Node n){
        if(n == null){
            return;
        }else{
            showOutOrder(n.right);
            System.out.print(n.info + " ");
            showOutOrder(n.left);
        }
    }

    public int countNodes(Node n){// afiseaza greutatea arborelui adica numarul de noduri
        int count = 0;
        if(!(n == null)){ // se poate scrie si if( n != null )
            count = countNodes(n.right) + countNodes(n.left) + 1;
        }
        return count;
    }
}
