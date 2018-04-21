package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) {
		
		ListInterface<Item> itemListTest = new DLList<Item>();
		
		Item item1 = new Item("bok1",2);
		Item item2 = new Item("bok2",1);
		Item item3 = new Item("bok3",3);
		Item item4 = new Item("bok4",5);
		
		itemListTest.add(item1);
		itemListTest.add(item2);
		itemListTest.add(item3);
		itemListTest.add(item4);
		
		
		System.out.println(itemListTest.getEntry(0).getName());
		System.out.println(itemListTest.getEntry(1).getName());
		System.out.println(itemListTest.getEntry(2).getName());
		System.out.println(itemListTest.getEntry(3).getName());
		System.out.println(itemListTest.getEntry(4).getName());

		
		
		String ItemFile = readLineByLine("src/ShoppingList.txt");
		String[] itemFileLines = ItemFile.split("\n");
		
		int ItemNum = itemFileLines.length;
		System.out.println(ItemNum);
		ListInterface<Item> itemList = new DLList<Item>();
		for (int i = 0; i < ItemNum; i++) {
			String[] itemString = itemFileLines[i].split(",");
			itemList.add(new Item(itemString[0],Double.parseDouble(itemString[1]))); 
		}
		
		System.out.println(itemList.getEntry(0).getName());
		System.out.println(itemList.getEntry(1).getName());
		System.out.println(itemList.getEntry(2).getName());
		System.out.println(itemList.getEntry(3).getName());
		System.out.println(itemList.getEntry(4).getName());
		System.out.println(itemList.getEntry(5).getName());
		System.out.println(itemList.getEntry(6).getName());
		System.out.println(" ");
		
		ListSorter.sort(itemList);
		
		
		System.out.println(itemList.getEntry(0).getName());
		System.out.println(itemList.getEntry(1).getName());
		System.out.println(itemList.getEntry(2).getName());
		System.out.println(itemList.getEntry(3).getName());
		System.out.println(" ");
		String priorityFile = readLineByLine("src/ShoppingPriorities.txt");
		String[] priorityFileLines = priorityFile.split("\n");
		int n = priorityFileLines.length;
		
		PriorityQueueInterface<Item> priorityList = new LinkedPQ<Item>();
		
		for (int i = 0; i < n; i++) {
			String[] priorityString = priorityFileLines[i].split(",");
			String itemName = priorityString[0];
			System.out.println(itemName);
			int priority = Integer.parseInt(priorityString[1]);
			System.out.println(priority);
			for (int j = 0; j<ItemNum; j++ ) {
				if (itemName.equals(itemList.getEntry(j).getName()))
				{
					priorityList.add(itemList.getEntry(j), priority);
				}
			}
		}
		
		System.out.println(priorityList.getSize());
		System.out.println(priorityList.remove().getName());
		System.out.println(priorityList.remove().getName());
		System.out.println(priorityList.remove().getName());
		
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a budget : ");
        String input = keyboard.nextLine();
        keyboard.close();
        int budget = Integer.parseInt(input);
        
		for (int i = 0; i < priorityList.getSize(); i++);
		{
			double itemPrice = priorityList.remove().getPrice();
			if (budget - itemPrice > 0) 
			{
				
			}
		}
	}

	private static String readLineByLine(String filePath)
	{
	    StringBuilder contentBuilder = new StringBuilder();
	    try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
	    {
	        stream.forEach(s -> contentBuilder.append(s).append("\n"));
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    return contentBuilder.toString();
	    
	}
}

