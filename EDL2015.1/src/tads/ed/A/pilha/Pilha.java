package tads.ed.A.pilha;

public interface Pilha {
	public int size();    
    public boolean isEmpty();
    public Object top() throws PilhaExcecao;
    public void push(Object o) throws PilhaExcecao;
    public Object pop() throws PilhaExcecao;
}
