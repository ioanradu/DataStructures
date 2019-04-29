package Tree;

public class Main { // aici nu mai avem node avem left si right
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.root = bst.add(bst.root, 5);
        bst.add(bst.root, 1);
        bst.add(bst.root, 7);
        bst.add(bst.root, 6);
        bst.add(bst.root, 4);

        bst.showInOrder(bst.root);
        System.out.println();
        bst.showPreOrder(bst.root);
        System.out.println();
        bst.showPostOrder(bst.root);
        System.out.println();
        bst.showOutOrder(bst.root);
        System.out.println();
        System.out.println("Greutatea arborelui este: " + bst.countNodes(bst.root));

    }




}
