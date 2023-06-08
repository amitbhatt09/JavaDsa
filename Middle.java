public class Main {
    Node head;
    int s =0;
    public class Node
    {
        int data;
        Node next;
    }

    public void insert(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null)
        {
            head = newNode;
            s++;
        }
        else
        {
            Node currNode = head;
            while(currNode.next!=null)
            {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            s++;
        }
    }
    public void display()
    {
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+ " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public void size()
    {
        System.out.println("size is = "+s);
    }
    public void middle()
    {
      Node slow = head;
      Node fast = head;
      while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }


    public static void main(String[] args) {
       Main list = new Main();
       list.insert(5);
        list.insert(1);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(2);
        list.insert(14);
        list.insert(70);
        list.insert(17);
        list.insert(70);
        list.display();
        list.size();
        list.middle();

    }
}
