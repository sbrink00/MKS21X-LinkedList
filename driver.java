public class driver{
  public static void main(String[]args){
    MyLinkedList a = new MyLinkedList();
    a.add(5);
    a.add(6);
    a.add(8);
    a.add(7);
    System.out.println(a);
    System.out.println(a.size());
    System.out.println(a.get(0));
    System.out.println(a.set(2, 1000));
    System.out.println(a);
  }
}
