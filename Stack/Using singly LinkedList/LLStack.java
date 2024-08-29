class Stack{
	
	Node top;
	
	Stack(){
		this.top = null;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(int value){
		Node node = new Node(value);
		if(isEmpty()){
			top = node;
		}else{
			node.next = top;
			top = node;
		}
	}
	
	public int pop(){
		
		if(isEmpty()){
			System.out.println("Empty");
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Empty");
			return -1;
		}
		return top.data;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Empty");
			return;
		}
		Node temp = top;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}