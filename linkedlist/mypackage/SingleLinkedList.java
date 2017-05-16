package mypackage;

import mypackage.Node;

public class SingleLinkedList<T> {
  private Node<T> head;
  private Node<T> current;

  public void add(T value) {
    Node<T> node = new Node<T>(value);

    if (this.head == null) {
      this.head = node;
      this.current = node;
      return;
    }
    
    this.current.setNext(node);
    this.current = node;
    return;
  }

  public void traverse () {
    if (this.head != null) {
      Node<T> tmp = this.head;
      while(tmp != null) {
        System.out.println(tmp.getValue());
        tmp = tmp.getNext();
      }
    }
  }
}
