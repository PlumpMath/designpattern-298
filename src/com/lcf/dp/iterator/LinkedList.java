package com.lcf.dp.iterator;

public class LinkedList implements Collection{
	Node head = null;
	Node fina = null;
	int size = 0;
	@Override
	public void add(Object o) {
		Node n = new Node(o,null);
		if(head == null){
			head = n;
			fina = n;
		}
		fina.setNext(n);
		fina = n;
		size++;
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	class LinkedListIterator implements Iterator{
		Node node = head;
		@Override
		public boolean hasNext() {
			if(node != null){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			Object o = node.getData();
			node = node.getNext();
			return o;
		}
		
	}

}
