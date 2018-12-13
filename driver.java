public class driver{
  public static void main(String[]args){
    Node s = new Node();
    Node e = new Node();
    MyLinkedList a = new MyLinkedList(s, e);
    //Node first = new Node(5, e, s);
    a.add(5);
    System.out.println(a);
  }
}
