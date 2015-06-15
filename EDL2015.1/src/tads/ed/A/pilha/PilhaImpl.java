package tads.ed.A.pilha;

public class PilhaImpl implements Pilha {

	//Pilha
    private Object[] stack;
    //índice do elemento do topo
    private int top = -1;
    
	public PilhaImpl(int size){
		stack = new Object[size];
	}
	
	//o número de elementos armazenados
	public int size() {
		return top + 1;
	}

	//Indica se há ou não elementos na Pilha
	public boolean isEmpty() {
		return (top < 0);
	}
	
	//retorna o último elemento inserido sem removê-lo
	public Object top() throws PilhaExcecao {
		if(isEmpty())
			throw new PilhaExcecao("Pilha Vazia");
		return stack[top];
	}

	//insere um elemento
	public void push(Object o) throws PilhaExcecao {
		if (top == (stack.length - 1))
			throw new PilhaExcecao("Pilha Cheia");
		else{
			top++;
			stack[top] = o;
		}
	}

	// Remove e returna o último elemento inserido
	public Object pop() throws PilhaExcecao {
		if(isEmpty())
			throw new PilhaExcecao("Pilha Vazia");
		
		Object Elem;
		Elem = stack[top];
		stack[top] = null;
		top --;
		
		return Elem;
		
	}

}
