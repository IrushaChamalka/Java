class Main{
	public static void main(String args[]){
		Stack stack = new Stack();
		stack.push(10);
		stack.push(50);
		stack.push(30);
		System.out.println(stack.peek());
		stack.display();
		stack.pop();
		stack.display();
	}
}