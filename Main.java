public class Main {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
      list.insert(5);
      list.insert(10);
      list.insert(24);
      list.insert(4);
//      list.insert(5);
//      list.insert(10);https://www.hackerrank.com/certificates/177f611cba78
//      list.insert(24);
//      list.insert(24);
//      list.insert(34);
//      list.insert(34);
      System.out.println("Before Reversing");
      list.display();
//      System.out.println("\nInserting at position");
//      list.insertAtPos(24,15);
//      list.display();
//      System.out.println("\nAfter deleting node 24");
//      list.deleteNode(24);
//      list.display();
//      System.out.println("\nAfter sorting the linked list");
//      list.sortAscending();
//      list.display();
//        System.out.println("After removing duplicates");
//        list.deleteDuplicate();
//        list.display();
        System.out.println("After Reversing linkedlist");
        list.Reverse();
        list.display();

    }
}