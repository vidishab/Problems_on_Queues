
import java.util.Stack;

public class reversingk_elements {
    Stack<Integer> s = new Stack<>();
    private static int front,rear,capacity;
    private static int[] queue;
    reversingk_elements(int c)
    {
        front=0;
        rear=0;
        capacity=c;
        queue=new int[capacity];
    }
    public void insert(int d)
    {
        if(rear==capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        queue[rear]=d;
        rear++;
    }
    public static int del()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }
        int res=queue[front];
        for(int i=0;i<rear;i++)
        {
            queue[i]=queue[i+1];
        }
        rear--;
        return res;
    }
    public void display()
    {
        for(int i=0;i<rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public void find(int k)
    {
        for(int i=0;i<k;i++)
        {
            int p = del();
            s.push(p);
        }
        while(!s.empty())
        {
            insert(s.pop());
        }
        for(int i=0;i<capacity-k-1;i++)
        {
            int p = del();
            insert(p);
        }
    }
    public static void main(String args[])
    {
        reversingk_elements ob = new reversingk_elements(11);
        for(int i=0;i<capacity-1;i++) {
            ob.insert(i);
        }
        //ob.display();
        ob.find(4);
        ob.display();
    }
}

