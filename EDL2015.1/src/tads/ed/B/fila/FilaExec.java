package tads.ed.B.fila;

public class FilaExec {

	public static void main(String[] args) throws FilaException {

		FilaImpl FI = new FilaImpl(5);
		System.out.println(FI.isEmpty());
		//System.out.println(FI.size());
		//System.out.println(FI.front());
		FI.enqueue(1);
		FI.enqueue(11);
		FI.enqueue(111);
		System.out.println(FI.front());
		FI.dequeue();
		System.out.println(FI.front());
		System.out.println(FI.size());
		
	}

}
