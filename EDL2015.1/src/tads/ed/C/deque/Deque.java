package tads.ed.C.deque;

public interface Deque{
	public int size();
	public boolean isEmpty();
	public Object getFirst() throws DequeException;
	public Object getLast() throws DequeException;
	public void insertFirst(Object o) throws DequeException;
	public void insertLast(Object o) throws DequeException;
	public Object removeFirst() throws DequeException;
	public Object removeLast() throws DequeException;
	
	public int countDeque();
	public int first();
	public int last();
}
