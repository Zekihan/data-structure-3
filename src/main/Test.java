package main;

public class Test {

	public static void main(String[] args) {
	
		
		
		Item Item1 = new Item("Elma", 1);
		Item Item2 = new Item("Muz", 2);
		Item Item3 = new Item("Fish", 8);
		
		ListInterface<Item> shoppingList = new DLList<Item>();
		shoppingList.add(Item3);
		shoppingList.add(Item1);
		shoppingList.add(Item2);
		
		
		System.out.println(shoppingList.getEntry(0).getName());
		
		
		System.out.println((ListSorter.sorted(shoppingList)).getEntry(0).getName());
		
		
		System.out.println(shoppingList.getEntry(0).getName());

	}


}
