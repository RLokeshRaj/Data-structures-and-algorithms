package Week5_Linkedlist;

public class SingleImplementation {

	
	Node head, tail;
	int length = 0;
	
	
	void add(int value) {
		Node temp =new Node(value);
		
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
		
		length++;
	}
	
	int size() {
		return length;
	}
	
	// 1 
	void removeFirst() {
		Node temp = head.next;
		head = temp; 
		length--;
	}
	
	boolean remove(int index) {
		
		if( index > length - 1) 
			return false;
		Node temp = head;
		if(temp == null)
			return false;
		for(int i = 0; i < index - 1; i++) 
			temp = temp.next; 
		if(temp.next == null) 
			return false;
		temp.next = temp.next.next; 
		length --;
		return true;
	}
	
	boolean removeValue(int value) {
		
		Node temp = head;
		int pos = 0;
		while(temp.next != null) {
			if(temp.value == value)
				remove(pos);
		 	pos++;
		}
		return false;
		
	}
	
	
	
	int get(int index) {
		if(index > length - 1 )
			return -1;
		Node temp = head;
		for(int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.value;
			
	}
	
	
	
	int indexof(int index) {
		
		int count =0; ;
		Node temp = head;
		while ( temp.next!=null){
	          if(temp.val==temp.next.val){
	        	  return index;
//		for(int i = 1; i <= index; i++) {
//			temp = temp.next;
//			}
	          }
	          temp =  temp.next;
	          count ++;
		}
		return index;

	}
	
	int lastindexof(int value) {
	Node temp = head;
	int ind =0;
	int output =-1;
	while (temp!=null){
		if (temp.value == value)
			output = ind;
		ind++;
		temp = temp.next;
	}
	return output;
	}
	
	public void removefirstindex() {
	Node temp = head.next;
	head = temp; 
	 length--;
}
	
	public void removelastindex() {
		remove(length);
	}
	
	
	void addfirst(int value) {
		Node temp =new Node(value);
		if(head == null) {
			temp = temp.next;
		}else {
			temp.next = head;
		 temp.next = temp.next.next;
		}
	}
	

	boolean set(int index, int value) {
		if(index > length )
			return false;
		
		Node temp = head;
		
		for(int i = 0; i <= index; i++ ) {
			
			if(i == index) {
				temp.value = value;
				tail = temp.next;
				break;
			}
			temp = temp.next;
		}		
		
		return true;
	}
	
	
	
}
