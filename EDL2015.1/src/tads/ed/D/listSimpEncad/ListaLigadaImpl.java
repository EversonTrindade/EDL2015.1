package tads.ed.D.listSimpEncad;

public class ListaLigadaImpl {

	private No root;
	private int size;

	public void insertElem(Object elem) {
		if (this.root == null) {
			this.root = new No(elem);
			root.setNext(null);
		} else {
			No newNode = new No(elem);
			newNode.setNext(root);
			root = newNode;
			size = size + 1;
			
		}
	}
	
	public Object removeElem() {
		return null;
	}
	
	public void showElement(){
		System.out.println("Show Elements");
		No temp = root;
		while(temp != null){
			System.out.println("Valor: " +temp.getElement());
			if(temp.getNext() != null){
				temp.getNext();
			}else{
				System.out.println("Null");
			}
			temp = temp.getNext();
		}
		
		
	}
	
	public No getRoot() {
		return root;
	}

	public void setRoot(No root) {
		this.root = root;
	}

}
