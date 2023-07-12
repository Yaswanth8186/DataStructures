public class StackImp {
	private  Object[] stackarray;
	private int size;
	private int top;
	public StackImp(int size)
	{
		this.size=size;
		this.top=-1;
		stackarray=new Object[size];
	}
	public void push(Object value)
	{
		if(top==size-1 ) {
			System.out.println("Stack is Full");
		}
		else {
		top++;
		stackarray[top]=value;
		}
	}
	public void pop()
	{
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else
		{
            System.out.println("The element removed is " + stackarray[top]);
			top--;
		}
	}
	public Object peek()
	{
		return stackarray[top];
	}
    public void display() {
        if(top == -1) {
            System.out.println("satck is empty");
        }else{
            System.out.print("The elements of the stack are : ");
            for(int i = 0;i <= top;i++)
                System.out.print(stackarray[i] + " ");
            System.out.println();
        }
    }
	public static void main(String[] args) {
		StackImp s=new StackImp(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.pop();
        System.out.println("The element at the top is : " + s.peek());
        s.display();
	}
}