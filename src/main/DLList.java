package main;

public class DLList<T> {
	
	private DLNode firstNode;
	private DLNode lastNode;
	
	private class DLNode {
		private T data;
		private DLNode next;
		private DLNode prev;
 
		private DLNode(T dataPortion) {
			this(null, dataPortion, null);
		}
		
        private DLNode(DLNode prev, T dataPortion, DLNode next) {
            this.data = dataPortion;
            this.next = next;
            this.prev = prev;
        }
        private T getData() {
        	return data;
        }
        private void setData(T newData) {
        	data = newData;
        }
        private DLNode getNextNode() {
        	return next;
        }
        private DLNode getPrevNode() {
        	return prev;
        }
        private void setNextNode(DLNode nextNode) {
        	next = nextNode;
        }
        private void setPrevNode(DLNode prevNode) {
        	prev = prevNode;
        }
        
        
	}
	
	
}
