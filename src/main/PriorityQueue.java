package main;

public class PriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

	private Node<T> head;
    private int size;
	
	public void add(T newEntry) {
		
		Node<T> node = head;
		head = add(node, newEntry);
	}
	
	private Node<T> add(Node<T> node, T data) {
		
		Node<T> newNode =  createNewNode(data);
		if(node == null) 
		{
			return newNode;
		}
		
		
	}
	
	private Node<T> createNewNode(T data) {
		size++;
		return new Node<T>(data);
		}
		

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	private static class Node<T>
	{
		private Node<T> next;
		private final T data;
		private final T priority;
		
		public Node(T data, T priority)
		{
		this.data = data;
		this.priority = priority;
		}
	}

}

