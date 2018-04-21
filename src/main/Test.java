package main;

public class Test {

	public static void main(String[] args) {
		PriorityQueueInterface<String> shoppinglist = new LinkedPQ<String>();
		
		System.out.println(shoppinglist.getSize());
		shoppinglist.add("hi");
		System.out.println(shoppinglist.getSize());
		System.out.println(shoppinglist.remove());
		shoppinglist.clear();
		System.out.println(shoppinglist.remove());
	}

}
