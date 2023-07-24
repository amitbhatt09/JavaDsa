
public class Main {
    Node head;
    class Node {
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
            System.out.print("null");
        }
    }
    public void delete(int target)
    {
       Node currNode = head;
       while(currNode.data!=target)
       {
           currNode=currNode.next;
       }
       currNode.next = currNode.next;



    }


    public static void main(String[] args) {
        Main list = new Main();
        list.insert(5);
        list.insert(12);
        list.insert(13);
        list.insert(52);
        list.insert(18);
        list.insert(22);
        list.display();
        list.delete(13);
        System.out.println("\nAfter deleting node");
        list.display();
    }
}