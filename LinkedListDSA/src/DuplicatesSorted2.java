public class DuplicatesSorted2 {
    Node head;
    class Node{
        int data;
        Node next;
    }

    public void insert(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head==null){
            head=newNode;
        }
        else {
         Node second = head;
            while(second.next!=null)
            {
                second=second.next;
            }
            second.next = newNode;
        }
    }
    public void display()
    {
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        else {

            Node second = head;
            while(second!=null)
            {
                System.out.print(second.data+"-->");
                second = second.next;
            }
            System.out.print("null\n");
        }
    }
    public void Delete(Node head)
    {
        Node temp = new Node(0,head);
        Node prev = temp;
    }
    public static void main(String[] args) {
       DuplicatesSorted2 del = new DuplicatesSorted2();
        del.insert(1);
        del.insert(2);
        del.insert(3);
        del.insert(3);
        del.insert(4);
        del.insert(4);
        del.insert(5);
        del.display();
    }

}
