package tads.ed.C.deque;

public class DequeImpl implements Deque {

	public Object[] deque;
	public int first;
	public int last;
	public int size;
	
	public DequeImpl(int size){
		deque = new Object[size];
		this.size = size;
	}
	
	public int size() {
		return ((size - first + last) % size);
	}

	public boolean isEmpty() {
		return first == last;
	}

	public Object getFirst() throws DequeException {
		return deque[first];
	}

	public Object getLast() throws DequeException {
		return deque[last];
	}

	public void insertFirst(Object o) throws DequeException {
		if(size() == (size-1))
			throw new DequeException("Deque Cheia");
		deque[first] = o;
		first = ((first + 1) % size);
	}

	public void insertLast(Object o) throws DequeException {
		if(size() == (size-1))
			throw new DequeException("Deque Cheia");
		deque[last] = o;
		last = (( last + 1) % size);
	}

	public Object removeFirst() throws DequeException {
		if (isEmpty())
			throw new DequeException("Deque Vazia");
		Object Temp = deque[first];
		deque[first] = null;
		first = ((first + 1) % size);
		return Temp;
	}

	public Object removeLast() throws DequeException {
		if (isEmpty())
			throw new DequeException("Deque Vazia");
		Object Temp = deque[last];
		deque[last] = null;
		last = (( last + 1) % size);
		return Temp;
	}

	public int countDeque() {
		int cont = 0;
		for(Object i : deque ){
			if(i != null){
				cont++;
			}
		}
		return cont;
	}

	public int first() {
		return first;
	}

	public int last() {
		return last;
	}
	
	
	

}
