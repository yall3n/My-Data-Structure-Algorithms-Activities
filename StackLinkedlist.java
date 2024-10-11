class StackNode{
	int data;
	StackNode next;

	public StackNode(int data){
		this.data = data;
		this.next = null;
		}
	}

class Stack{
	private StackNode top;

	public Stack(){
		this.top = null;
		}

	public void push(int data){
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
		System.out.println(data + "pushed onto stack.");
		}

	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
			}
			int poppedData = top.data;
			top = top.next;
			return poppedData;
		}

	public int peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
			}

			return top.data;
		}

	public boolean isEmpty(){
		return top == null;
		}

	}

	public class StackLinkedlist{
		public static void main(String[] args){
			Stack stack = new Stack();

			stack.push(10);
			stack.push(20);
			stack.push(30);

			System.out.println("Top element is: " + stack.peek());




			}
		}