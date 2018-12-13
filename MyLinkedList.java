class MyLinkedList{
  private int size;
  private Node start,end;

  public int size(){
    int len = 0;
    for (Node i = start; i != end; i = i.next) len++;
    return size + 1;
  }


  public boolean add(int value){
    Node current = end;
    end = new Node(value, start, current);
  }

  public String toString(){
    String output = "[";
    Node current = start;
    for (Node i = start; i != end; i = i.next){
      output += i.get() + ", ";
    }
    output += end.get();
    return output + "]";
  }
}
