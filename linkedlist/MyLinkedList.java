package linkedlist;

class Node<T>{
	protected Node<T> prev;
	protected T node;
	protected Node<T> next;


	public Node(Node<T> prev, T node, Node<T> next) {
		super();
		this.prev = prev;
		this.node = node;
		this.next = next;
	}


	@Override
	public String toString() {
		return "Node [prev=" + prev + ", node=" + node + ", next=" + next + "]";
	}


}

public class MyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public MyLinkedList(){
		this.head = null;
		this.tail = null;
	}
	public void add(Node<T> node){
		Node<T> tmp = head;
		head = node;

		head.next = tmp;
		count++
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
