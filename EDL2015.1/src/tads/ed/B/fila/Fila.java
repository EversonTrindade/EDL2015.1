package tads.ed.B.fila;

public interface Fila {
	public int size();
	public boolean isEmpty();
	public Object front() throws FilaException;
	public void enqueue (Object e) throws FilaException;
	public Object dequeue() throws FilaException;
}
