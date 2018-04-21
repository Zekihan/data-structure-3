package main;

public class test {

	public static void main(String[] args) {
<<<<<<< HEAD
        DLList<String> list = new DLList<String>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("M");
        list.add("O");
        System.out.println(list.toString());
        list.replace(4, "L");
        System.out.println(list.toString());
        System.out.println(list.contains("M"));
        System.out.println(list.contains("H"));
        System.out.println("Deleting l");
        list.remove(3);
        System.out.println(list);
        
        System.out.println("Deleting H");
        list.remove(1);
        System.out.println(list);
        System.out.println("Deleting o");
        list.remove(3);
        System.out.println(list);
        System.out.println("Deleting e");
        list.remove(1);
        System.out.println(list);
        System.out.println("Deleting l");
        list.remove(1);
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.add("O",1);
        list.add("L",1);
        list.add("L",1);
        list.add("E",1);
        list.add("H",1);
        System.out.println(list);
        
        
        System.out.println("Popping everything");
        while(!list.isEmpty()){
                System.out.println(list.remove(1));
        }
        
        list.add("O");
        list.add("L");
        list.add("L");
        list.add("E");
        list.add("H");
        
        System.out.println("Popping everything from the end");
        while(!list.isEmpty()){
                System.out.println(list.remove(1));
        }
        
        
        
	}
=======
	
		
		
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


>>>>>>> 4eb0b9a30bf8b370fc5aea4e0d865e0d1cb0cac6
}

