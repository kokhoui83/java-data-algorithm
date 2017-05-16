package mypackage;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
  private T value;
  private Node<T> left;
  private Node<T> right;

  @Override
  public int compareTo (Node<T> node) {
    return getValue().compareTo(node.getValue());
  }

  public String toString () {
    return this.value.toString();
  }

  public Node (T value) {
    this.value = value;
  }

  public T getValue () {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Node<T> getLeft () {
    return this.left;
  }

  public void setLeft(Node<T> node) {
    this.left = node;
  }

  public Node<T> getRight () {
    return this.right;
  }

  public void setRight(Node<T> node) {
    this.right = node;
  }
}
