public class Node{
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

public class MyLinkedList {
  private Node start, end;
  private int size;

  public MyLinkedList(){

  }

  public int size(){
    return size;
  }


}
