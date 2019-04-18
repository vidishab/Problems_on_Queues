
public class linkedlistimplementationQ {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void insert(int d)
        {
            Node newnode = new Node(d);
            if(head==null)
            {
                head=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
    }
    public void del()
    {
        if(head==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp=head;
        temp=temp.next;
        head=temp;
    }
    public void display()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        linkedlistimplementationQ ob = new linkedlistimplementationQ();
        Node head;
        for(int i=1;i<8;i++)
        {
            ob.insert(i);
        }
        ob.del();
        ob.del();
        ob.del();
        ob.display();
    }
}

