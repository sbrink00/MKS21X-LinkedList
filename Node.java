public class Node{
  private Integer data;
  private Node next,prev;

  public Node(int val, Node behind, Node ahead){
    data = val;
    next = ahead;
    prev = behind;
  }

  public Node next(){
    return next;
  }

  public Node prev(){
    return prev;
  }

  public void setNext(Node other){
    next = other;
  }

  public void setPrev(Node other){
    prev = other;
  }

  public Integer getData(){
    return data;
  }

  public Integer setData(Integer newVal){
    Integer output = data;
    data = newVal;
    return output;
  }
}
