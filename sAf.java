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



class slow_and_fast
{
	public boolean hasCycle(Node head)
{
	if (head ==null)
	{
	return false;
}

	Node slow =head ;
Node fast =head ;
	while (fast!=null && fast.next!=null)
		{
	slow =slow.next;
	fast =fast.next.next;
if (fast==slow)
{
	return true;
}
}
return false ;
}
}

class sAf
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

  
	slow_and_fast r=new slow_and_fast();
	System.out.println("has this list cycle:"+r.hasCycle(n1));
}
}
