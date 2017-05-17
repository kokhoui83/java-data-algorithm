import java.util.*;

public class app {
  public static void main (String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("A");

    System.out.println(list);

    Stack<String> stack = new Stack<String>();

    for (String str : list) {
      stack.push(str);
    }

    int match = 0;
    
    for (int i = 0; i < list.size(); i++) {
      String value1 = list.get(i);
      String value2 = stack.pop();

      System.out.println(value1 + " == " + value2);

      if (value1.compareTo(value2) == 0) {
        match++;
      }
    }

    Boolean isPando = (match == list.size());
    System.out.println("Is pando: " + isPando);
  }
}
