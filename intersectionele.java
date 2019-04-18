
import java.util.Stack;

public class intersectionele {
    private static int rear,front,capacity;
    private static int[] queue;
    static Stack<Integer> s = new Stack<>();
    intersectionele(int c)
    {
        rear=0;
        front=0;
        capacity=c;
        queue=new int[capacity];
    }
    public static void insert(int d)
    {
        if(rear==capacity)
        {
            System.out.println("Queue is full");
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
    public static void display()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }
        for(int i=0;i<rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void push1(Stack s,int r)
    {
        s.push(r);
    }
    public static void find()
    {
        int c = capacity-1;
        if(c%2!=0)
            return;
        int size = c/2;
        for(int j=0;j<size;j++)
        {
            int r = del();
            push1(s,r);
        }
        while(!s.empty())
        {
            insert(s.pop());
        }
        for(int j=0;j<size;j++)
        {
            int r=del();
            insert(r);
        }
        for(int j=0;j<size;j++)
        {
            int r = del();
            push1(s,r);
        }
        while(!s.empty())
        {
            insert(s.pop());
            int r=del();
            insert(r);
        }

    }
    public static void main(String args[])
    {
        intersectionele ob = new intersectionele(7);
        for(int i=0;i<capacity-1;i++)
        {
            insert(i);
        }
        //del();
        //display();
        find();
        display();
    }
}

