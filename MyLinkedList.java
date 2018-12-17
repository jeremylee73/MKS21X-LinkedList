class Node{
  private int data;
  private Node prev, next;

  public Node(int data, Node prev, Node next){
    this.data = data;
    this.prev = prev;
    this.next = next;
  }

  public int getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }
  public void setData(int data){
    this.data = data;
  }
  public void setNext(Node next){
    this.next = next;
  }
  public void setPrev(Node prev){
    this.prev = prev;
  }
}

class MyLinkedList {
  private Node first, last;
  private int size;

  public MyLinkedList(){

  }

  public int size(){
    return size;
  }

  public boolean add(int n){
    if (last == null){
      last = new Node(n, last, null);
      first = last;
    } else {
      Node newNode = new Node(n, last.getPrev(), null);
      last.setNext(newNode);
      last = newNode;
    }
    size++;
    return true;
  }

  public String toString(){
    String ans = "[" + first.getData() + ", ";
    Node current = first.getNext();
    for (int i=1; i<size-1; i++){
      ans += current.getData() + ", ";
      current = current.getNext();
    }
    ans += current.getData() + "]";
    return ans;
  }
}
