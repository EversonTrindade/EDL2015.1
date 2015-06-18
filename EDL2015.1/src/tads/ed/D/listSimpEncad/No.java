package tads.ed.D.listSimpEncad;

public class No {
	private No next;
	private Object element;
	
	public No(Object element){
		this.element = element;
		this.next = null;
	}
		
	public No getNext() {
		return next;
	}
	public void setNext(No next) {
		this.next = next;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	
	
}
