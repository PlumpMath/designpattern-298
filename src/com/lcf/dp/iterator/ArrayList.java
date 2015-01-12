package com.lcf.dp.iterator;

public class ArrayList implements Collection {

	private Object[] objects = new Object[10];
	int index = 0;
	@Override
	public void add(Object o) {
		if(index == objects.length){
			Object[] newObjects = new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index++] = o;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	class ArrayListIterator implements Iterator{
		int i=0;
		@Override
		public boolean hasNext() {
			if(i >= index){
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			return objects[i++];
		}
		
	}
}
