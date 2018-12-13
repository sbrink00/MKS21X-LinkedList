public class Node{
  private int data;
  private Node next,prev;

  public Node(){}

  public Node(int val, Node behind, Node ahead){
    data = val;
    next = ahead;
    prev = behind;
  }

  public int get(){
    return this.data;
  }

  public void set(int newVal){
    this.data = newVal;
  }

  public Node getNextSibling(){
    return this.next;
  }

}
