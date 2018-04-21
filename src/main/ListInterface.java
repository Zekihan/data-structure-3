package main;

public interface ListInterface<T> {
	
	public void clear();
	
	public boolean isEmpty();
	
	public void add(T newEntry);
	
	public void add(T newEntry,int newPosition);
	
	public T[] toArray();
	
	public T remove(int givenPosition);
	
	public T replace(int givenPosition, T newEntry);
	
	public T getEntry(int givenPosition) ;
	
	public boolean contains (T anEntry) ;
	
	public String toString();
	
	
}
