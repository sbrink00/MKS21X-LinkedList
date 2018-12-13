public class Node{
  private int data;
  private Node next,prev;

  public Node(int val, Node ahead, Node behind){
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

}
