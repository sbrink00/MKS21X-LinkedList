class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(Node s, Node e){
    start = s;
    end = e;
    size = 2;
  }

  public int size(){
    return this.size;
  }


  public boolean add(int value){
    Node current = new Node(value, start, end);
    size++;
    return true;
  }

  public String toString(){
    String output = "[";
    for (Node i = start.getNextSibling(); i != end; i = i.getNextSibling()){
      output += i.get() + ", ";
    }
    return output.substring(0, output.length() - 2) + "]";
  }
}
