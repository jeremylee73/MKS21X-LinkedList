public class Driver {
  public static void main(String[] args) {

    System.out.println("---------TESTING MYLINKEDLIST ---------");
    System.out.println();

    System.out.println("---- Testing toString() / add(value) / size() ----");
    System.out.println();
    MyLinkedList list = new MyLinkedList();
    System.out.println("Empty List should print []: " + list);
    System.out.println("List size should be 0: " + list.size());
    System.out.println("Adding the value 0 should print true: " + list.add(0));
    System.out.println("List should now be [0]: " + list);
    System.out.println("List size should now be 1: " + list.size());
    for (int x = 1; x < 10; x++){
      list.add(x);
    }
    System.out.println("Adding values up to 10, list should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]: " + list);
    System.out.println("List size should now be 10: " + list.size());
    for (int x = 0; x < 1000; x++) {
      list.add(x);
    }
    System.out.println("Adding 1000 values to list, size should be 1010: " + list.size());
    System.out.println();
    System.out.println();
    System.out.println("---- Testing get(index) ----");
    System.out.println();
    list = new MyLinkedList();
    for (int x = 0; x < 10; x++){
      list.add(x);
    }
    System.out.println("Current list: " + list);
    System.out.println("Get first index should print 1: " + list.get(1));
    System.out.print("Get -1th index, should print an error: ");
    try {
      list.get(-1);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    System.out.println();
    System.out.println();

    System.out.println("---- Testing set(index, value) ----");
    System.out.println();
    System.out.println("Current list: " + list);
    System.out.println("Set 3rd index to 10 should print 3: " + list.set(3, 10));
    System.out.println("Current list: " + list);
    System.out.print("Set -1th index, should print an error: ");
    try {
      list.set(-1, 0);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    for (int x = 0; x < 10; x++) {
      list.set(x, x+1);
    }
    System.out.println("Setting every index of list with a loop, should be a list of 1-10 inclusive: " + list);
    System.out.println();
    System.out.println();

    System.out.println("---- Testing contains and indexOf ----");
    System.out.println();
    System.out.println("Current list: " + list);
    System.out.println("list.contains(6) should print true: " + list.contains(6));
    System.out.println("list.contains(70) should print false: " + list.contains(70));
    System.out.println("list.indexOf(4) should print 3: " + list.indexOf(4));
    System.out.println("list.indexOf(50) should print -1: " + list.indexOf(50));
    System.out.println("list.indexOf(1) should print 0: " + list.indexOf(1));
    System.out.println("list.indexOf(10) should print 9: " + list.indexOf(10));
    System.out.println();
    System.out.println();

    System.out.println("---- Testing add(index, value) ----");
    System.out.println();
    System.out.println("Current list: " + list);
    System.out.print("Add to -1th index, should print an error: ");
    try {
      list.add(-1, 0);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    list.add(0, 0);
    System.out.println("Add 0 to the 0th index: " + list);
    list.add(10, 11);
    System.out.println("Add 11 to the 10th index: " + list);
    System.out.println();
    System.out.println();

    System.out.println("---- Testing remove methods ----");
    System.out.println();
    System.out.println("Current list: " + list);
    System.out.println("Remove 0th index should print 0: " + list.remove(0));
    System.out.println("Current list: " + list);
    System.out.print("Removing -1th index, should print an error: ");
    try {
      list.remove(-1);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    Integer num = 11;
    System.out.println("Removing by value, trying to remove 11, should print true: " + list.remove(num));
    System.out.println("Current list: " + list);
    num = 100;
    System.out.println("Trying to remove value 100, should print false: " + list.remove(num));
    System.out.println("Current list: " + list);
    System.out.println();
    System.out.println();

    System.out.println("---- Testing Extend with two LinkedLists: a and b----");
    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for (int x = 0; x < 5; x++) {
      a.add(x);
      b.add(x+5);
    }
    System.out.println("linkedlist a should be [0, 1, 2, 3, 4]: " + a);
    System.out.println("linkedlist b should be [5, 6, 7, 8, 9]: " + b);
    a.extend(b);
    System.out.println("After a.extend(b), a should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]: " + a);
    System.out.println("After extending, b should be []: " + b);
    System.out.println("Size of a should be 10: " + a.size());
    System.out.println("Size of b should be 0: " + b.size());
    System.out.println();
    a.extend(b);
    System.out.println("Trying to extend b (now empty) to a, a should be the same: " + a);
    System.out.println("b should still be []: " + b);
    System.out.println();
    System.out.println("----Changing a and b----");
    a = new MyLinkedList();
    b.add(5);
    b.add(7);
    System.out.println("a should be []: " + a);
    System.out.println("b should be [5, 7]: " + b);
    a.extend(b);
    System.out.println("after a.extend(b), a should be [5, 7]: " + a);
    System.out.println("b should still be []: " + b);
    System.out.println("size of a should be 2: " + a.size());
    System.out.println("size of b should be 0: " + b.size());
    System.out.println("--------- END OF TEST ----------");

  }


}
