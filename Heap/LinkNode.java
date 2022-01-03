package Heap;

public class LinkNode<T> {

	private T value;
	private LinkNode nextNode;
	public LinkNode(T value) {
		super();
		this.value = value;
		this.nextNode = null;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public LinkNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
