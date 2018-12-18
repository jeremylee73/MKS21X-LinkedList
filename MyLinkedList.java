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

  public void add(int index, int value){
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException();
    }
    Node newNode = new Node(value, getNode(index-1), getNode(index));
    getNode(index-1).setNext(newNode);
    getNode(index).setPrev(newNode);
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
  public Node getNode(int index){
    Node current = first;
    for (int i=0; i<size; i++){
      if (i==index){
        return current;
      }
      current = current.getNext();
    }
    return first; // placeholder
  }

  public int get(int index){
    return getNode(index).getData();
  }
  public int set(int index, int value){
    int oldData = get(index);
    getNode(index).setData(value);
    return oldData;
  }

  public boolean contains(int value){
    Node current = first;
    for (int i=0; i<size; i++){
      if (current.getData() == value){
        return true;
      }
    }
    return false;
  }

  public int indexOf(int value){
    Node current = first;
    for (int i=0; i<size; i++){
      if (current.getData() == value){
        return i;
      }
    }
    return -1;
  }

  public int remove(int index) {
   if (index < 0 || index >= size()) {
     throw new IndexOutOfBoundsException();
   }
   int ans = get(index);
   if (index == 0) {
     first = getNode(index+1);
     return ans;
   }
   if (getNode(index).getNext() == null) {
     getNode(index-1).setNext(last);
     last = getNode(index-1);
     last.setNext(null);
     size--;
     return ans;
   }
   getNode(index-1).setNext(getNode(index+1));
   getNode(index).setPrev(getNode(index-1));
   size--;
   return ans;
 }
}
