package tads.ed.B.fila;

public class FilaImpl implements Fila {

	public Object[] queue;
	public int first;
	public int last;
	public int size;
	
	
	public FilaImpl(int size){
		queue = new Object[size];
		this.size = size;
	}
	
	public int size() {
		return ((size-first+last) % size);
	}

	public boolean isEmpty() {
		return first == last;
	}

	public Object front() throws FilaException {
		if (isEmpty())
			throw new FilaException("Fila Vazia");
		
		return queue[first];
	}

	public void enqueue(Object e) throws FilaException{
		if(size() == (size-1))
			throw new FilaException("Fila Cheia");
		queue[last] = e;
		last = ((last+1) % size);
			
	}

	public Object dequeue() throws FilaException {
		if (isEmpty())
			throw new FilaException("Fila Vazia");
		Object Temp = queue[first];
		queue[first] = null;
		first = ((first + 1) % size);
		return Temp;
	}

}
