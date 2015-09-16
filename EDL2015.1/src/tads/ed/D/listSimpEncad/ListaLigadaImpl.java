package tads.ed.D.listSimpEncad;

public class ListaLigadaImpl {

	private No root;
	private No leaf;
	private int size = 0;

	public void insertElemFirst(Object elem) {
		No newNode = new No(elem);
		leaf = newNode;
		if (root == null) {
			root = leaf;
			root.setNext(null);
		}
		size = size + 1;		
	}

	public void insertElemLast(Object elem){
		if (root == null) {
			insertElemFirst(elem);
		} else {
			No newNode = new No(elem);
			root.setNext(newNode);
			root = newNode;
			size = size + 1;
		}
	}
	
//	public Object removeElemFirst() {
//		if(root == null){
//			throw new IllegalArgumentException("Lista vazia");
//		}else{
//			No temp = leaf;
//			leaf.setNext(temp);
//			leaf = null;
//			size = size - 1;
//		}
//		return null;
//	}
	
	public Object removeElemLast(){
		return null;
	}

	public void setRoot(No root) {
		this.root = root;
	}
	
	public No getRoot() {
		return root;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	public No getLeaf() {
		return leaf;
	}
	public void setLeaf(No leaf) {
		this.leaf = leaf;
	}

	
}
