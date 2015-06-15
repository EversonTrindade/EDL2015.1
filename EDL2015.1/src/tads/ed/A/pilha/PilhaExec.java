package tads.ed.A.pilha;

public class PilhaExec {

	public static void main(String[] args) throws PilhaExcecao {
		// TODO Auto-generated method stub
		PilhaImpl PI = new PilhaImpl(5);
		System.out.println("Tamalho da Pilha = " +PI.size());
		System.out.println("Pilha vazia: " +PI.isEmpty());
		
		PI.push(1);
		PI.push(11);
		PI.push(111);
		PI.push(1111);
		PI.push(11111);
		PI.pop();
		
		System.out.println("Tamalho da Pilha = " +PI.size());		
		System.out.println("òltimo elemento: " +PI.top());
		
	}

}
