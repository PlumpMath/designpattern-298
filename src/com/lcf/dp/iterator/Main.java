package com.lcf.dp.iterator;

public class Main {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		LinkedList list = new LinkedList();
		for(int i = 0;i < 15; i++){
			list.add(new Cat(i));
		}
		System.out.println(list.size());
		
		Iterator it = list.iterator();
		Cat cat;
		while(it.hasNext()){
			cat = (Cat) it.next();
			System.out.print(cat.getHeight()+" ");
		}
	}

}
