package Heap;

import java.util.LinkedList;

public class PQueueImplLinkList <T> extends  PriorityQueue<T>{
	//private  LinkNode head;
	private LinkedList list;

	public PQueueImplLinkList() {
		super();
		this.list = new LinkedList<T>(); ;
	}

	@Override
	void add(T t) {
		// TODO Auto-generated method stub
		if(list.isEmpty())list.add(t);
		else {
			int indx = 0;
			while() {
				
			}
		}
		
		
	}

	@Override
	 Object poll() {
		// TODO Auto-generated method stub
		if(head == null)return null;
		LinkNode node = head;
		this.head = this.head.getNextNode();
		return  node.getValue();
	}

	@Override
	Object peek() {
		// TODO Auto-generated method stub
		return this.head.getValue();
	}
	

}
