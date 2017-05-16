import mypackage.*;

public class app {
  public static void main(String[] args) {
    System.out.println("binary tree");

    BinaryTree tree = new BinaryTree<Integer>();
    tree.add('F');
    tree.add('B');
    tree.add('G');
    tree.add('A');
    tree.add('D');
    tree.add('C');
    tree.add('E');
    tree.add('I');
    tree.add('H');

    tree.inOrderTraversal();
    tree.preOrderTraversal();
    tree.postOrderTraversal();
  }
}
