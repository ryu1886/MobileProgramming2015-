package Generic;


public class StackGeneric {
	
	public static void main(String[] args){
		
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}


class Stack<T> {
	
	Node<T> top;
	
	public T  pop() {
		T temp = top.getData();
		Node<T> nTemp = top;
		top = top.next;
		nTemp = null;
		return temp;
	}
	
	public void push(T data) {
		
		Node<T> nNode = new Node<T>(data,top);
		
		if(top == null){
			top = nNode;
			nNode.setNext(null);
		}
		else{
			nNode.setNext(top);
			top = nNode;
		}
	}
}



class Node<T> {
	Node<T> next;
	
	T data;
	
	public Node(T item,Node<T> top) {
		data = item;
		next = top;
	}
	public T getData() {
		return data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> nNode) {
		next = nNode;
	}
}