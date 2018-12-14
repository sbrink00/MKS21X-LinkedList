class MyLinkedList{
  private int length;
  private Node start,end;

  public MyLinkedList(){
    start = null;
    end = null;
    length = 0;
  }

  public boolean add(Integer value){
    if (length == 0){
      Node n = new Node(value, null, null);
      start = n;
      end = n;
    }
    else{
      Node n = new Node(value, end, null);
      end = n;
      n.prev().setNext(n);
    }
    length ++;
    return true;
  }

  public int size(){
    return length;
  }

  public Integer get(int index){
    int idx = 0;
    Node current = start;
    while (idx != index){
      current = current.next();
      idx ++;
    }
    return current.getData();
  }

  public String toString(){
    if (length == 0) return "[]";
    String output = "[";
    Node current = start;
    while (current != null){
      output += current.getData() + ", ";
      current = current.next();
    }
    return output.substring(0, output.length() - 2) + "]";
  }
}
