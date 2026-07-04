//finding start node of cycle using slow fast pointer

class Node 
{
int data ;
Node next;

Node (int data)
{
	this.data=data;
	this.next=null;
}
}

class  soln
{
public Node start_node(Node head)
{
	Node slow =head ;
	Node fast=head;
while (fast!=null && fast.next!=null)
{
slow =slow.next;
fast=fast.next.next;

if (fast==slow)
{
	slow =head;
	while (fast!=slow)
		{
		slow =slow.next;
		fast=fast.next;
}
return fast;    // or return slow 	
}
}
return null;

}
}
class startCycle
{
	public static void main (String[]args)
	{
	Node n1=new Node(10);
	Node n2=new Node(20);
	Node n3=new Node(30);
	Node n4=new Node(40);

	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
  // isse melegi cycle 
    n4.next=n2;

  
	soln r=new soln();
	System.out.println("starting node of cycle:"+r.start_node(n1));
}
}