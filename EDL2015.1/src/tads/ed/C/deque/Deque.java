package tads.ed.C.deque;

public interface Deque {
	public int size();
	public boolean isEmpty();
	public Object getFirst() throws DequeException;
	public Object getLast() throws DequeException;
	public void addFirst(Object o) throws DequeException;
	public void addLast(Object o) throws DequeException;
	public Object removeFirst() throws DequeException;
	public Object removeLast() throws DequeException;
}
