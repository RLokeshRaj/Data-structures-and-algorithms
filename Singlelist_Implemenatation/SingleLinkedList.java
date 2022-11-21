package Week5_Linkedlist;

import org.junit.Test;

public class SingleLinkedList {
	

	@Test
	public static void main(String[] args) {
		
		SingleImplementation sl1 = new SingleImplementation();
		sl1.add(1);
		sl1.add(2);
		sl1.add(3);
		sl1.add(4);
		sl1.add(5);
		sl1.add(6);
		sl1.remove(5);
		System.out.println(sl1.size());
        sl1.removefirstindex();
        sl1.removelastindex();
        
        
		
		System.out.println(sl1.get(0));
		System.out.println(sl1.get(1));
		System.out.println(sl1.get(2));
		System.out.println(sl1.get(3));
		System.out.println(sl1.get(4));
		System.out.println(sl1.get(5));
		
		
	}

}
