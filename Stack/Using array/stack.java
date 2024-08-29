class Stack{
	
	int array[];
	int top;
	int maximumSize;
	
	Stack(int maximumSize){
		this.maximumSize = maximumSize;
		this.array = new int[maximumSize];
		this.top = -1;
		
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return maximumSize - 1 == top;
	}
	
	public void push(int value){
		if(!isFull()){
			array[++top] = value;
		}else{
			System.out.println("Full");
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Empty");
			return -1;
		}
		return array[top--];
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Empty");
			return -1;
		}
		return array[top];
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Empty");
			return;
		}
		int length = top;
		while(length != -1){
			System.out.print(array[length] + " ");
			length--;
		}
		/*
		for(int i = top ; top >= 0 ; i--){
			System.out.println(array[i] + " ");
		}
		System.out.println();
		*/
	}
	
}

class StackADT{
	
	public static void main(String args[]){
		Stack stack = new Stack(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		stack.push(10);
		stack.push(1);
		stack.push(8);
		System.out.println(stack.peek());
		stack.pop();
		stack.display();
	}
}