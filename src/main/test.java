package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class test {

	public static void main(String[] args) {
		
       
		

		String ItemFile = readLineByLine("src/ShoppingList.txt");
		String[] itemFileLines = ItemFile.split("\n");
		
		int ItemNum = itemFileLines.length;
		System.out.println(ItemNum);
		ListInterface<Item> itemList = new DLList<Item>();
		for (int i = 0; i < ItemNum; i++) {
			String[] itemString = itemFileLines[i].split(",");
			itemList.add(new Item(itemString[0],Double.parseDouble(itemString[1]))); 
		}
		System.out.println(itemList.getEntry(1).getName());
		System.out.println(itemList.getEntry(2).getName());
		System.out.println(itemList.getEntry(3).getName());
		System.out.println(" ");
		ListSorter.sort(itemList);
		System.out.println(itemList.getEntry(1).getName());
		System.out.println(itemList.getEntry(2).getName());
		System.out.println(itemList.getEntry(3).getName());
		System.out.println(" ");
		String priorityFile = readLineByLine("src/ShoppingPriorities.txt");
		String[] priorityFileLines = priorityFile.split("\n");
		int n = priorityFileLines.length;
		
		PriorityQueueInterface<Item> priorityList = new LinkedPQ<Item>();
		
		for (int i = 1; i < n+1; i++) {
			String[] priorityString = priorityFileLines[i-1].split(",");
			String itemName = priorityString[0];
			System.out.println(itemName);
			int priority = Integer.parseInt(priorityString[1]);
			System.out.println(priority);
			for (int j = 1; j<ItemNum+1; j++ ) {
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

