public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next=null;

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node currNode = head;
            while(currNode.next!=null)
            {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

    }

    public void display()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void insertAtPos(int value,int data)
    {
        
        Node newNode = new Node();
        newNode.data = data;
        Node currNode = head;
        Node prePtr = currNode;

        while(currNode.data != value)
        {
            prePtr = currNode;
            currNode = currNode.next;
        }
        prePtr.next=newNode;
        newNode.next=currNode;
    }

    public void deleteNode(int value)
    {
        Node currNode = head;
        Node prePtr = currNode;
        while(currNode.data!=value)
        {
            prePtr = currNode;
            currNode = currNode.next;
        }
        prePtr.next = currNode.next;
        currNode = prePtr.next;
    }

    public void sortAscending()
    {
        Node currnode = head;
        int temp;
        Node prePtr = currnode;
        while(currnode.next!=null){
            prePtr = currnode.next;
            while(prePtr!=null)
            {
                if(currnode.data> prePtr.data)
                {
                    temp = currnode.data;
                    currnode.data = prePtr.data;
                    prePtr.data = temp;
                }
                prePtr = prePtr.next;
            }
            currnode = currnode.next;

        }
    }

    public void deleteDuplicate()
    {
            Node currNode = head;
            while(currNode.next!=null)
            {
                if(currNode.data !=currNode.next.data)
                {
                    currNode = currNode.next;
                }
                else
                {
                    currNode.next = currNode.next.next;
                }

                }
    }

    public void Reverse()
    {
        Node currNode = head;
        Node prev = null;
        Node forNode=null;
        while(currNode!=null)
        {
            forNode = currNode.next;
            currNode.next=prev;
            prev = currNode;
            currNode=forNode;
        }


    }
}
