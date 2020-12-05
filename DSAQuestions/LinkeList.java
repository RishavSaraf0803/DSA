package DSAQuestions;

public class LinkeList {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String[] args)
	{
		LinkeList obj=new LinkeList();
		head=new Node(10); 
		head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        Node reverselist=obj.reverse(head);
        
        //PrintLinkedList
        Node curr=reverselist;
        while(curr!=null)
        {
        	System.out.print(curr.data+" ");
        	curr=curr.next;
        }
	}
	///////Reverse LinkedList
	Node reverse(Node root) 
	{
		Node curr=root;
		Node prev=null;
		Node next=null;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		root=prev;
		return root;
	}

}
