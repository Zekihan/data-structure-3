package main;

public class ListSorter {
     
	public static void sort(ListInterface<Item> list) {
		
		Item temp;
		for (int i = 1; i < list.size(); i++) {
			for(int j = i ; j > 0; j--) {
				if(list.getEntry(j).getPrice() < list.getEntry(j-1).getPrice()) 
				{
					temp = list.getEntry(j);
					list.replace(j, list.getEntry(j-1));
					list.replace(j-1, temp);	
				}
			}
		}
	}
    
	public static ListInterface<Item> sorted(ListInterface<Item> list){

		ListInterface<Item> sorted =  new DLList<Item>();
		int i;
		for (i=0;i<=list.size();i++) {
			sorted.add(list.getEntry(i));
		}
		sort(sorted);
		return sorted;
		
	}

}