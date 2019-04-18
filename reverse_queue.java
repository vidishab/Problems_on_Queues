
import java.util.Stack;

public class reverse_queue {
    static Stack<Integer> s = new Stack<>();
    private static int front,rear,capacity;
    private static int queue[];
    reverse_queue(int c)
    {
        front=0;
        rear=0;
        capacity=c;
        queue=new int[capacity];
    }
    public void queueEnqueue(int d)
    {
        if(rear==capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear]=d;
        rear++;
        s.push(d);
    }
    public void queueDequeue()
    {
        if(front == rear)
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<rear;i++)
        {
            queue[i]=queue[i+1];
        }
        rear--;
    }
    public void display()
    {
        if(front==rear)
        {
            System.out.println("No elements");
            return;
        }
        while(front != rear)
        {
            System.out.println(queue[front]);
            front++;
        }
    }
    public static void main(String args[])
    {

        reverse_queue ob = new reverse_queue(10);
        for(int i=1;i<capacity-1;i++)
        {
            ob.queueEnqueue(i);
        }
        while(!s.empty())
        {
            System.out.println(s.pop());
        }
        //ob.queueDequeue();
        //ob.queueDequeue();
        System.out.println("Elements in a queue");
        ob.display();

    }
}

