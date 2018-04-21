package main;

public class LinkedPQ<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

	private Node<T> headNode;
    private int size;
    
	public void add(T newEntry) {
		
		Node<T> node = headNode;
		headNode = insert(node, newEntry);
	}
	
	private Node<T> insert(Node<T> node, T data) {
		
		Node<T> newNode =  createNewNode(data);
		
		if(node == null) 
		{
			return newNode;
		}
		if(node.data.compareTo(data) > 0) 
		{
			newNode.next = node;
			node = newNode;
	    } 
		else 
	    {
			node.next = insert(node.next, data);
	    }
		
	    return node;
	    
	}
	
	private Node<T> createNewNode(T data) {
		size++;
		return new Node<T>(data);
		}
		

	public T remove() {
		
		if(null == headNode) 
		{
			return null;
	    }
        T data = headNode.data;
        headNode = headNode.next;
        size--;
        return data;
	    }

	
	public T peek() {
		
		if(null == headNode) 
		{
			return null;
		}
		
		T data = headNode.data;
		return data;
	}

	
	public boolean isEmpty() {
		
		if (headNode != null)
			return false;
		else
			return true;
	}
	
	public int getSize() {
		return size;
	}

	
	public void clear() {
		headNode = null;
		
	}
	
	private static class Node<T>
	{
		private Node<T> next;
		private final T data;
		
		public Node(T data)
		{
		this.data = data;
		}
	}

}

