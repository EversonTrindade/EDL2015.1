package tads.ed.C.deque;

public class DequeExec {

	public static void main(String[] args) throws DequeException {
		DequeImpl DI = new DequeImpl(4);
		
		DI.insertLast(1);
		DI.insertLast(11);
		DI.insertLast(111);
		
		System.out.println("First: " +DI.first());
		System.out.println("Last: " +DI.last());
		System.out.println("-----------");
		
		System.out.println("Tamanho: " +DI.countDeque());
		System.out.println("-----------");
		
		System.out.println("getFirst: " +DI.getFirst());
		System.out.println("getLast: " +DI.getLast());
	}

}
