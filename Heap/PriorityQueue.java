package Heap;

public abstract class PriorityQueue<T> {

	abstract void add(T t);
	abstract <T> T poll();
	abstract <T> T peek();
	
}
