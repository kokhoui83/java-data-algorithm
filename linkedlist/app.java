import mypackage.*;

public class app {
  public static void main(String[] args) {
    SingleLinkedList list = new SingleLinkedList<String>();
    list.add("Apple");
    list.add("Pineapple");
    list.add("Ciku");
    list.add("Orange");
    list.add("Lanjiao");
    list.traverse();
  }
}
