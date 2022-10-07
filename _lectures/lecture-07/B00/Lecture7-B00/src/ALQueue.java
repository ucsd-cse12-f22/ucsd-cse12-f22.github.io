import java.util.ArrayList;

interface Queue<E> {
	void enqueue(E element);
	E dequeue();
	E peek();
	int size();
}

public class ALQueue<E> implements Queue<E> {
	ArrayList<E> contents;
	
	ALQueue() {
		this.contents = new ArrayList<E>();
	}
	
	@Override
	public void enqueue(E element) {
		this.contents.add(element);
	}
	
	@Override
	public E dequeue() {
		//E temp = this.contents.get(0);
		E temp = this.contents.remove(0);
		return temp;
	}
	
	@Override
	public E peek() {
		return this.contents.get(0);
	}
	
	@Override
	public int size() {
		return this.contents.size();
	}
	
	@Override
	public String toString() {
		return "front -> " + this.contents.toString() + " <- back";
	}
}
