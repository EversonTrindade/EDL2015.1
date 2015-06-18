package tads.ed.D.listSimpEncad;

public class ListaLigadaImpl {

	private No root;
	//private No leaf;
	private int size = 1;

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
	//Incompleto - falta o fim da lista apontar para o novo n—
	//com a ajuda da leaf
	public void insertElemAfter(Object elem){
		if (this.root == null) {
			this.root = new No(elem);
			root.setNext(null);
		} else {
			No newNode = new No(elem);
			newNode.setNext(null);
			No temp = null;
			while(this.root != null){
				if(this.root.getNext() == null)
					temp = this.root.getNext();
				this.root = this.root.getNext();
			}
			temp.setNext(newNode);
		}
	}
	
	public Object removeElem() {
		if(root == null){
			throw new IllegalArgumentException("Lista vazia");
		}else{
			No temp;
			temp = root.getNext();
			root = null;
			root = temp;
			size = size - 1;
				
		}
		
		return null;
	}
	
	public void showElement(){
		System.out.println("Show Elements");
		No temp = root;
		while(temp != null){
			System.out.println("Valor: " +temp.getElement());
			if(temp.getNext() != null){
				temp.getNext();
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

	public int getSize() {
		return size;
	}

	
}
