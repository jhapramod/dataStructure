package list;

public class LinkedList {

	Node head;
	
	
	public void insert(int data) {
		  Node node= new Node(data);
		  if(head==null) {
			  head=node;
		  }else {
			  Node n= head;
				while(n.next!=null) {
					n=n.next;	
				}
				n.next=node; 
		  }
			
	}
	public void insertAtStart(int data) {
		  Node node= new Node(data);
		  node.next=head;
		  head=node;
		  
	}
	
	public void insertAtPos(int index,int data) {
		 Node node= new Node(data);
		 
		 Node n= head;
		if(index==0) {
			insertAtStart(data);
		}else {
			for (int i = 0; i < index-1; i++) {
				n=n.next;
				
			}			
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void delete(int index) {
		if(index==0) {
			head= head.next;
		}
		
		Node n=head;
	
		for (int i = 0; i < index-1; i++) {
			n=n.next;
		}
		Node n1= n.next;
		n.next=n1.next;
		System.out.println("deleted data "+n1.data);
	}
	public void printData() {
		
		while(head.next!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		
			
		}
		System.out.print(head.data);
	}
	
	public static void main(String[] as ) {
		LinkedList linkedList= new LinkedList();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(50);
		linkedList.insert(70);	
		linkedList.insertAtStart(21);
		linkedList.insertAtPos(3, 22);
		linkedList.delete(0);
		linkedList.printData();		
		
	//linkedList.reverse(linkedList.head);
		
	}
}

