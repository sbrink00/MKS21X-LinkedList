public class Node{
  private int data;
  private Node next,prev;

  public Node(int val, Node behind, Node ahead){
    data = val;
    next = ahead;
    prev = behind;
  }

  public Integer getData(){
    return this.data;
  }

  public Integer setData(Integer newVal){
    this.data = newVal;
  }

  public Node getNextSibling(){
    return this.next;
  }

  public Node getPreviousSibling(){
    return this.prev;
  }

}
