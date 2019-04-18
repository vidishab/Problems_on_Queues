
public class simplecirculararrayQ
{
    static int front,rear,capacity;
    static int queue[];
    simplecirculararrayQ(int c)
    {
        front=0;rear=0;
        capacity=c;
        queue=new int[capacity];
    }
    public void queueEnqueue(int data)
    {
        if(rear==capacity)
            System.out.println("Queue overflow");
        queue[rear]=data;
        rear++;
    }
    public void queueDequeue()
    {
        if(front==rear)
            System.out.println("Queue underflow");
        for(int i=0;i<rear;i++)
        {
            queue[i]=queue[i+1];
        }
        rear--;
    }
    public void displayqueue()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public static void main(String args[])
    {
        simplecirculararrayQ ob = new simplecirculararrayQ(11);
        ob.queueEnqueue(1);
        ob.queueEnqueue(2);
        ob.queueEnqueue(3);
        //ob.queueEnqueue(4);
        //ob.queueEnqueue(5);
        //ob.queueEnqueue(6);
        //ob.queueEnqueue(7);
        //ob.queueEnqueue(8);
        //ob.queueEnqueue(9);
        //ob.queueEnqueue(10);
        System.out.println("1st iteration");
        ob.queueDequeue();
        ob.displayqueue();
        System.out.println("2nd iteration");
        ob.queueDequeue();
        ob.displayqueue();
        System.out.println("3rd iteration");
        ob.queueDequeue();
        ob.displayqueue();

    }

}

