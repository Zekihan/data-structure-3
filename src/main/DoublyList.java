package main;

public class DoublyList<T> {
	private DLNode firstNode;
	private DLNode lastNode;
	
	private class DLNode {
		private T dataPortion;
		private DLNode next;
		private DLNode prev;
 
		private DLNode(T dataPortion) {
			this(null, dataPortion, null);
		}
		
        private DLNode(DLNode prev, T dataPortion, DLNode next) {
            this.dataPortion = dataPortion;
            this.next = next;
            this.prev = prev;
        }
	}
	
}
