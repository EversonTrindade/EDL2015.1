package tads.ed.D.listSimpEncad;

public class ListaLigadaExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigadaImpl lista = new ListaLigadaImpl();
		lista.insertElem(2);
		lista.insertElem(22);
		lista.insertElem(222);
		lista.showElement();
		lista.removeElem();
		lista.showElement();
		System.out.println("Get Size:" + lista.getSize());
		lista.insertElemAfter(3333);
		lista.showElement();
	}

}
