package mypackage;

import java.util.*;
import mypackage.Node;

public class BinaryTree<T extends Comparable<T>> {
  public Node<T> root;

  public void add (T value) {
    Node<T> node = new Node<T>(value);

    if (this.root == null) {
      this.root = node;
      return;
    }

    Node<T> focus = this.root;
    while (true) {
      if (focus.compareTo(node) > 0) {
        Node<T> left = focus.getLeft();
        if (left == null) {
          focus.setLeft(node);
          return;
        }
        focus = left;
      } else {
        Node<T> right = focus.getRight();
        if (focus.getRight() == null) {
          focus.setRight(node);
          return;
        }
        focus = right;
      }
    }
  }

  public void inOrderTraversal () {
    System.out.println("inOrderTraversal");
    inOrderTraversal(this.root);
  }

  private void inOrderTraversal (Node<T> focus) {
    if (focus != null) {
      // travel left nodes
      inOrderTraversal(focus.getLeft());

      // print left node value
      System.out.println(focus.getValue());

      // travel right nodes
      inOrderTraversal(focus.getRight());
    }
  }

  public void preOrderTraversal () {
    System.out.println("preOrderTraversal");
    preOrderTraversal(this.root);
  }

  private void preOrderTraversal (Node<T> focus) {
    if (focus != null) {
      // print current node
      System.out.println(focus.getValue());

      // travel left node
      preOrderTraversal(focus.getLeft());

      // travel right node
      preOrderTraversal(focus.getRight());
    }
  }

  public void postOrderTraversal () {
    System.out.println("postOrderTraversal");
    postOrderTraversal(this.root);
  }

  private void postOrderTraversal (Node<T> focus) {
    if (focus != null) {
      // travel the left node
      postOrderTraversal(focus.getLeft());

      // travle the right node
      postOrderTraversal(focus.getRight());

      // print currnet node
      System.out.println(focus);
    }
  }

  public void breadthFirstTraversal () {
    System.out.println("breadthFirstTraversal");
    breadthFirstTraversal(this.root);
  }

  private void breadthFirstTraversal (Node<T> focus) {
    if (focus != null) {
      Queue<Node<T>> queue = new LinkedList<Node<T>>();
      queue.add(focus);

      while(queue.peek() != null) {
        Node<T> node = queue.remove();
        System.out.println(node);

        if (node.getLeft() != null) {
          queue.add(node.getLeft());
        }

        if (node.getRight() != null) {
          queue.add(node.getRight());
        }
      }
    }
  }
}
