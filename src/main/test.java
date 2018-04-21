package main;

public class test {

	public static void main(String[] args) {
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
}

