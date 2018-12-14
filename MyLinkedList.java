class MyLinkedList{
  private int length;
  private Node start,end;

  public MyLinkedList(){
    start = null;
    end = null;
    length = 0;
  }

  public boolean add(Integer value){
    Node n = new Node(value, end, null);
    n.prev().setNext(n);
    length ++;
    return true;
  }

  public int size(){
    return length;
  }

  public String toString(){
    String output = "[";
    Node current = start.next();
    while(current.getData() != null){
      output += current.getData();
      current = current.next();
    }
    return output.substring(0, output.length() - 2) + "]";
  }
}
