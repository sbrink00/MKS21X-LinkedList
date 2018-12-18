class MyLinkedList{
  private int length;
  private Node start,end;

  public MyLinkedList(){
    start = null;
    end = null;
    length = 0;
  }

  public MyLinkedList(int[] ary){
    for (int idx = 0; idx < ary.length; idx ++){
      add(ary[idx]);
    }
  }

  public Node start(){
    return start;
  }

  public Node end(){
    return end;
  }

  public void setLength(int val){
    length = val;
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
    String error = "index must be greater than 0 and less than the size";
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException(error);
    }
    int idx = 0;
    Node current = start;
    while (idx != index){
      current = current.next();
      idx ++;
    }
    return current.getData();
  }

  public Integer set(int index, Integer value){
    String error = "index must be greater than 0 and less than the size";
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException(error);
    }
    int idx = 0;
    Node current = start;
    while (idx != index){
      current = current.next();
      idx ++;
    }
    return current.setData(value);
  }

  public boolean contains(Integer value){
    Node current = start;
    while(current != null){
      if (current.getData() == value) return true;
      current = current.next();
    }
    return false;
  }

  public int indexOf(Integer value){
    Node current = start;
    int idx = 0;
    while(current != null){
      if (current.getData() == value) return idx;
      current = current.next();
      idx++;
    }
    return -1;
  }

  public void add(int index, Integer value){
    String error = "index must be greater than 0 and less than the size";
    if (index < 0 || index > length){
      throw new IndexOutOfBoundsException(error);
    }
    if (index == length) add(value);
    else if (index == 0){
      Node n = new Node(value, null, start);
      start = n;
      n.next().setPrev(n);
      length++;
    }
    else{
      int idx = 0;
      Node current = start;
      while (idx != index){
        current = current.next();
        idx++;
      }
      Node n = new Node(value, current.prev(), current);
      n.next().setPrev(n);
      n.prev().setNext(n);
      length++;
    }
  }

  public Integer remove(int index){
    String error = "index must be greater than 0 and less than the size";
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException(error);
    }
    Integer output = get(index);
    Node current = start;
    int idx = 0;
    while (idx != index){
      current = current.next();
      idx ++;
    }
    Node n = current;
    if (current.next() == null){
      current.prev().setNext(null);
      end = current.prev();
    }
    else if(current.prev() == null){
      current.next().setPrev(null);
      start = current.next();
    }
    else{
      n.next().setPrev(n.prev());
      n.prev().setNext(n.next());
    }
    length--;
    return output;
  }

  public boolean remove(Integer value){
    boolean contains = false;
    Node current = start;
    int idx = 0;
    while(!contains && current != null){
      if (current.getData() == value) contains = true;
      else {
        current = current.next();
        idx++;
      }
    }
    if (contains){
      remove(idx);
      return true;
    }
    else return false;
  }

  public void extend(MyLinkedList other){
    Node temp = other.start();
    Node temp2 = other.end();
    end.setNext(temp);
    temp.setPrev(end);
    end = temp2;
    length += other.size();
    other = new MyLinkedList();
  }

  public String toString(){
    if (length == 0) return "[]";
    String output = "[";
    Node current = start;
    int idx = 0;
    while (idx < length){
      output += current.getData() + ", ";
      current = current.next();
      idx ++;
    }
    return output.substring(0, output.length() - 2) + "]";
  }

  public String toStringBackwards(){
    if (length == 0) return "[]";
    String output = "[";
    Node current = end;
    int idx = 0;
    while (idx < length){
      output += current.getData() + ", ";
      current = current.prev();
      idx ++;
    }
    return output.substring(0, output.length() - 2) + "]";
  }

}
