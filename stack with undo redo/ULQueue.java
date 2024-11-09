import java.util.*;

class QLNode {
    int value;
    QNode next;
  
    public QLNode(int value)
    {
        this.value = value;
        next = null;
    }
}
  
public class ULQueue {
    QNode front, rear;
	Stack<Integer> undostack = new Stack<Integer>(); 
	Stack<Integer> redostack = new Stack<Integer>(); 
	
    public ULQueue()
    {
        front = rear = null;
    }
  
    public void enqueue(int value)
    {
        // Create a new Linked List node
        QNode temp = new QNode(value);
		undostack.push(temp.value);
		undostack.push(1);
		if(front == null){
			front = rear =  temp;
			return;
		}
		
		rear.next = temp;
		rear = temp;

  
        //If queue is empty, then front and rear both should point to new node
        
		//else insert the new node at the end of queue and change rear accordingly
			
    }
  
    public Integer dequeue()
    {
        Integer dqval = null; //dequeue value

		if(front == null){
			return dqval;
		}
		dqval = front.value;
		front = front.next;
		undostack.push(dqval);
        undostack.push(-1);
		// If queue is empty, return null.
		// else remove the front value and return it.
		
		return dqval;
    }
	
	public void undo(){
		if (undostack.empty()){
			System.out.println("UNDO is not possible");
			return;
		}
		int operation = undostack.pop();
		int popValue = undostack.pop();
		redostack.push(popValue);
		redostack.push(operation);
        if(operation == 1){
			QNode crrnt = front;
			if(front.next == null){
				front = rear = null;
			}else{
				
				while (crrnt.next.next != null) {
					crrnt = crrnt.next;
				}
				crrnt.next = null;
				rear = crrnt;
			}

		}else if(operation == -1){
			redostack.push(popValue);
			redostack.push(operation);
			QNode node = new QNode(popValue);
			if (front == null) {
				front = rear = node;
				return;
			}
			node.next = front;
			front = node;
		}
	}

	public void redo(){
		if (redostack.empty()){
			System.out.println("REDO is not possible");
			return;
		}
		int operation = redostack.pop();
		int popValue = redostack.pop();
		QNode node = new QNode(popValue);
        if(operation == 1){
			QNode crrnt = front;
			if(front == null){
				front = rear = node;
			}else{
				
				while (crrnt.next != null) {
					crrnt = crrnt.next;
				}
				crrnt.next = node;
				rear = node;
			}

		}else if(operation == -1){
			
			if (front == null) {
				return;
			}
			front = front.next;
		}
	}
	
	public String toString() // no need to modify anything in this function
	{
		QNode Current = front;
		String list = "<front>";
		
		if (front != null) // i.e., list is not empty
			list = list + " " + Current.value;
		else // i.e., empty list
			list = list + " null";
		
		while(Current != rear)
		{
			Current = Current.next;
			list = list + " " + Current.value;
		}
		list = list + " <rear>";
		return list;
	}
}
