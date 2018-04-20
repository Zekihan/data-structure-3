package main;

public class DLList<T> {
	
	private DLNode firstNode;
	private DLNode lastNode;
	private int size; 
	private class DLNode {
		private T data;
		private DLNode next;
		private DLNode prev;
 
		private DLNode(T dataPortion) {
			this(null, dataPortion, null);
		}
		private DLNode(DLNode prev, T dataPortion) {
			this(prev, dataPortion, null);
		}
		private DLNode(T dataPortion, DLNode next) {
			this(null, dataPortion, next);
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
	
	public DLList() {
		initializeDataFields();
	}
	public void clear() {
		initializeDataFields();
	}
	private void initializeDataFields() {
		firstNode = null;
		lastNode = null;
		size = 0;
	}
	private DLNode getNodeAt(int givenPosition) {
	    DLNode newNode;
	    if (givenPosition < size / 2) {
	    	newNode = firstNode;
	      for (int i = 0; i < givenPosition + 1; i++) {
	    	  newNode = newNode.next;
	      }
	    } else {
	      newNode = lastNode;
	      for (int i = size; i > givenPosition; i--) {
	        newNode = newNode.prev;
	      }
	    }
	    
	    return newNode;
	}
	public boolean isEmpty() {
		boolean result = false;
		if ((size == 0)&&(firstNode == null)&&(lastNode == null))
			result = true;
		return result;
	}
	public void add(T newEntry) {
		DLNode newNode = new DLNode(lastNode, newEntry);
		if (isEmpty()) {
			firstNode = newNode;
			lastNode = newNode;
		}
		else {
			DLNode lastNode = getNodeAt(size);
			lastNode.setNextNode(newNode);
		}
		size++;
	}

}
