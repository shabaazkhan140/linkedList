class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head;
	public void insert(int d)
	{
		Node newnode= new Node();
		newnode.data=d;
		newnode.next=null;
		if(head==null)
		{
			head=newnode;
			
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;

		}

}
	public void show()
	{
		Node n=new Node();
		n=head;
		do {
			System.out.println(n.data);
			n=n.next;
			
		} while (n.next!=null) ;
		System.out.println(n.data);
		
	}
	public void insertatstart(int d)
	{
		Node startnode=new Node();
		startnode.data=d;
		startnode.next=head;
		head=startnode;
	}
public void insertloc(int n,int d)
{
	Node c=head;     
	Node newnode=new Node();
	newnode.data=d;
	int count=0;
	while(count!=n-1)
	{c=c.next;
	count++;
	
	}
	Node temp=c.next;
	c.next=newnode;
	newnode.next=temp;

	}
public void delete(int n)
{
	Node del;
	del=head;
	Node temp = null;
	int count=0;
	while(count!=n-1)
	{
		count++;
		del=del.next;
		temp=del;
	}
	del=del.next;
	temp.next=del.next;
	}
}   
public class LinkedListImplementation {
	public static void main(String []args)
	{
		LinkedList list=new LinkedList();
		System.out.println("before editing start position");
		list.insert(6);
		list.insert(2);
		list.insert(25);
		list.insert(27);
		list.show();
		System.out.println("after editing start position");
		list.insertatstart(1);
		list.show();
		System.out.println("after adding elements in between");
		list.insertloc(2,3);
		list.insertloc(3, 5);
		list.show();
		System.out.println("after deleting");
		list.delete(4);
		list.show();
		
	}

}
