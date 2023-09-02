package stringLinkedList;
import java.util.*;

public class LinkedListString {
	Node head;

	Scanner sc=new Scanner(System.in);
	public LinkedListString()
	{
		head=null;
	}
	public Node getHead()
	{
		return head;
	}
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(" "+move.data);
			move=move.next;
		}
		System.out.println();
	}
	public void createLinkedList(int terms)
	{

		String ele;
		for(int i=1;i<=terms;i++)
		{
			System.out.println("Enter a Elelment to INSERT ");
			ele=sc.next();
			Node record=new Node(ele);
			if(head==null)
				head=record;
			else
			{
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}


		}
	}
	public void addNodeBeg()
	{
		String s;
		System.out.println("Enter a value to insert at begining :");
		s=sc.next();
		Node record=new Node(s);
		record.next=head;
		head=record;
	}
	public void addNodeEnd()
	{
		String s;
		System.out.println("Enter a value to insert at END :");
		s=sc.next();
		Node record=new Node(s);
		Node move=head;;
		while(move.next!=null)
			move=move.next;
		move.next=record;

	}
	public void deleteBeg()
	{
		String s;
		Node move=head;
		s=move.data;
		head=move.next;
		System.out.println("deleted String is :"+s);


	}
	public void deleteEnd()
	{
		String s;
		Node move=head;
		while(move.next.next!=null)
			move=move.next;
		s=move.next.data;
		move.next=null;
		System.out.println("deleted String from ENd is :"+s);
	}
	public void printFirstNode()
	{
		Node move=head;
		System.out.println("First Node is :"+move.data);
	}
	public void printLastNode()
	{
		String s;
		Node move=head;
		while(move.next!=null)
			move=move.next;
		s=move.data;
		System.out.println("Last Node is :"+s);
	}
	public void search()
	{
		boolean f=false;;
		String data;
		System.out.println("Enter a data to search :");
		data=sc.next();
		Node move=head;
		int cnt=0;
		while(move.next!=null)
		{
			cnt++;
			if(move.data==data)
			{
				f=true;
				break;
			}
			move=move.next;
			
			
		}


		System.out.println("Data is Found at : "+cnt+" Node");

	}
	public void addMid()
	{
		String data;
		System.out.println("Enter a newdata to insert  :");
		data=sc.next();
		System.out.println("Enter Position where to insert :");
		int pos=sc.nextInt();
		Node record=new Node(data);
		Node move=head;
		for(int i=1;i<pos-1;i++)
			move=move.next;
		record.next=move.next;
		move.next=record;

	}
	public void countNode()
	{
		int count=1;
		Node move=head;
		while(move.next!=null)
		{
			count++;
			move=move.next;
		}
		System.out.println("Total no of Nodes Are Present In The Linked LIst :"+count);
	}
	public void displayNthRecord()
	{
		int n;
		System.out.println("Enter a position you want to display : ");
		n=sc.nextInt();
		Node move=head;
		for(int i=1;i!=n;i++)
			move=move.next;
		System.out.println("Data at postion "+n+" is :"+move.data);

	}
	public void modify()
	{
		
		String data;
		String newData;
		System.out.println("Enter a old data to modify :");
		data=sc.next();
		System.out.println("Enter a New Data To be Modified :");
		newData=sc.next();
		Node move=head;
		
		while(move.next!=null)
		{
			if(move.data.equals(data))
				move.data=newData;
			move=move.next;
		}
	}
	public void deleteFromPosition()
	{
		int pos;
		System.out.println("Enter a postion of Node you Want to delete");
		pos=sc.nextInt();
		Node move=head;
		Node tmp;
		int i;
		if( head.next==null)//.........
			head=null;//.....
		else
		{
		for( i=1;i<pos-1;i++)
		
			move=move.next;
		
		move.next=move.next.next;
		}	
	}
	public void printReverse(Node move)
	{
	//	 move=head;
		if(move!=null)
		{
		printReverse(move.next);
		System.out.print(" "+move.data);
		}
		
	}   
	public void reverseList()
	{
		Node nxt,prev,curr;
		prev=head;
		curr=prev.next;
		nxt=curr.next;
		//if(head.next==null)
			
		while(curr!=null)
		{
			curr.next=prev;
			prev=curr;
			curr=nxt;
			if(nxt!=null)
				nxt=nxt.next;
		}
			head.next=null;
			head=prev;
			display();
	}
	public void deletebyData()
	{
		String data;
		System.out.println("Enter a data to delete ");
		data=sc.next();
		Node move=head;
		//if(move.next==null)
		//	head=null;
		if(head.data.equals(data))
		{
			if(head.next!=null)
			     head=head.next;
			else
				head=null;
		}
		else
		{
		while(move!=null)
		{
			if(move.next.data.equals(data))
			{                                                  
				move.next=move.next.next;
				break;
			}
			move=move.next;
		}
		}

	}
	public void removeDuplicate()
	{
		Node move=head;
		
		while(move!=null)
		{
			if(move.next!=null)
			{
			if(move.data.equals(move.next.data))
				move.next=move.next.next;
			
			}
			move=move.next;
		}
		
	}
	
}

public class Node {
String data;
Node next;
public Node(String data) {
	super();
	this.data = data;
	this.next=null;
}
public Node()
{
	data="";
	next=null;
}
@Override
public String toString() {
	return "Node [data=" + data + "]";
}


}
public class StringLinkedListDemo {
	
public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	LinkedListString list1=new LinkedListString();
	System.out.println("Enter a size of LinkedList");
	size=sc.nextInt();
	int choice;
	do {
		System.out.println("1.createLinkedList");
		System.out.println("2.addNodeFirst");
		System.out.println("3.addNodeLast");
		System.out.println("4.delete from Beginig");
		System.out.println("5.delte From End");
		System.out.println("6.print FIrst NODE");
		System.out.println("7.print LAst NODE");
		System.out.println("8. Display ");
		System.out.println("9.Search ");
		System.out.println("10.addMid on Position");
		System.out.println("11.Count Number of Nodes Availiable :");
		System.out.println("12.Display data of Nth Postioin ");
		System.out.println("13.Modify !");
		System.out.println("14.delete Node from Position ");
		System.out.println("15.Print Reverse Linked List !!");
		System.out.println("16.Reverse the LinkedList !");
		System.out.println("17.Delete by Data !!");
		System.out.println("18.Remove duplicates !");
		System.out.println("0.EXIT !!");
		System.out.println("Enter your Choice :");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			list1.createLinkedList(size);
			break;
		case 2:
			list1.addNodeBeg();
			break;
		case 3:
			list1.addNodeEnd();
			break;
		case 4:
			list1.deleteBeg();
			break;
		case 5:
			list1.deleteEnd();
			break;
		case 6:
			list1.printFirstNode();
			break;
		case 7:
			list1.printLastNode();
			break;
		case 8:
			list1.display();
			break;
		case 9:
			list1.search();
			break;
		case 10:
			list1.addMid();
			break;
		case 11:
			list1.countNode();
			break;
		case 12:
			list1.displayNthRecord();
			break;
		case 13:
			list1.modify();
			break;
		case 14:
			list1.deleteFromPosition();
			break;
		case 15:
			Node move=list1.getHead();
			list1.printReverse(move);
			System.out.println();
			break;
		case 16:
			list1.reverseList();
			break;
		case 17:
			list1.deletebyData();
			list1.display();
			break;
		case 18:
			list1.removeDuplicate();
			list1.display();
		}
	}while(choice!=0);
	
}
}