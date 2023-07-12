public class QueueImp {
    private Object[] queueArray;
    private int size;
    private int front, rear;
    public QueueImp(int size) {
        this.size = size;
        this.front = this.rear = -1;
        queueArray = new Object[size];
    }
    public void enqueue(Object value) {
        if(front == size) {
            System.out.println("Queue is full");
        }else{
            if(front == -1) {
                front = 0;
                rear = 0;
            }
            queueArray[front++] = value;
        }
    }
    public void deque() {
        if(rear >= front) {
            System.out.println("Queue is empty");
        }else{
            System.out.println("The element removed is : " + queueArray[rear]);
            rear++;
        }
    } 
    public void display() {
        if(rear >= front) {
            System.out.println("Queue is empty");
        }else{
            System.out.print("The elements of the queue are : ");
            for(int i = rear; i < front;i++)
                System.out.print(queueArray[i] + " ");
            System.out.println();
        }
    }
    public Object peek() {
        return queueArray[front - 1];
    }
    public static void main(String args[]) {
        QueueImp q1 = new QueueImp(5);
        q1.display();
        q1.enqueue(2);
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(8);
        q1.enqueue(10);
        q1.display();
        q1.deque();
        q1.deque();
        q1.display();
        q1.enqueue(12);
        System.out.println("The element present at the front is : " + q1.peek());
    }
}
