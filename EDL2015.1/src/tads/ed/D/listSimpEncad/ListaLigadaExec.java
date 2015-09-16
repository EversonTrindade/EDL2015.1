package tads.ed.D.listSimpEncad;

public class ListaLigadaExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigadaImpl lista = new ListaLigadaImpl();
		lista.insertElemFirst(1);
		lista.insertElemFirst(2);
		lista.insertElemLast(3);
		lista.insertElemFirst(4);
		lista.insertElemLast(5);
				
		System.out.println("Leaf: " +lista.getLeaf().getElement());
		System.out.println("Root: " +lista.getRoot().getElement());
		
		System.out.println("Lista de tamanho: " + lista.getSize());

	}

}
