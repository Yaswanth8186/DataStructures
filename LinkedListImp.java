class Node{
    public Object item;
    public Node next;
}


public class LinkedListImp {
    private int size =  0;
    private Node head;
    public LinkedListImp() {// constructor
        this.size = 0;
        this.head=null;
    }


    public void insertingNode(String i) {
        Node node = new Node();
        node.item = i;
        Node current=this.head;

        if(this.head==null) {
            this.head=node;
            this.head.next=null;
            this.size=1;
            //System.out.println(this.head.toString());
        } else {
            while(current.next!=null) {
                current=current.next;
            }
            current.next=node;
            node.next=null;
            this.size+=1;
        }
    }
    public void addAtStarting(String i) {
        Node n = new Node();
        n.item = i;
        n.next = this.head;
        this.head = n;
        this.size+=1;
    }
    public void addAtMiddle(String i,int pos)
	{
		Node node=new Node();
		Node current=this.head;
		if(this.head!=null && pos<=this.size)
		{
			for(int j=0;j<pos - 1;j++) {
				current=current.next;
			}
			node.item=i;
			node.next=current.next;
			current.next=node;
			this.size+=1;
		}
		else
		{
			System.out.println("position is greater than size");
		}
	}
    public void deleteatEnd() {
		Node current=this.head;
		if(this.head==null) {
			System.out.println("list is empty");
		}else {
			while(current.next.next!=null) {
				current=current.next;
			}
            current.next=null;
			this.size-=1;
		}
	}
    public void deleteAtStarting() {
        if(this.head == null) {
            System.out.println("List is empty");
        }else{
            this.head = this.head.next;
            this.size -= 1;
        }
    }
    public void deleteatMiddle(int pos) {
		Node current = this.head;
        Node temp = null;
		if(this.head!=null && pos<=this.size) {
		for(int j=0;j<pos;j++) {
            temp = current;
			current=current.next;
		}
		temp.next=current.next;
		this.size-=1;
		}else {
			System.out.println("Position is greater than size");
		}
	}
    public void find(String value) {
        Node current = this.head;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if (current.item.equals(value)) {
                System.out.println("Element present at index " + i);
                flag = true;
                // break;
            }
            
            current = current.next;

        }
        if (!flag) {
            System.out.println("Element not present in Linked List");
        }

    }
    public void display() {
        Node current = this.head;
        System.out.print("The elements of the linked list are : ");
        for(int i = 0; i < size; i ++) {

            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    LinkedListImp list = new LinkedListImp();
    list.insertingNode("Yaswanth");
    list.insertingNode("Sunny");
    list.insertingNode("Suresh");
    list.display();
    list.addAtStarting("Sadik");
    list.addAtStarting("Kasi");
    list.display();
    list.addAtMiddle("Rakshith",2);
    list.display();
    list.deleteAtStarting();
    list.display();
    list.deleteatEnd();
    list.display();
    list.deleteatMiddle(1);
    list.display();
    list.find("Sunny");
    }

}