class StackArray{

		private int [] stackArray;
		private int top;
		private int maxSize;

  //constructor to initialize the stack
		public StackArray(int size){
			maxSize = size;
			stackArray = new int [maxSize];
			top =-1;  //top is initialized to -1,meaning the stack is empty
		}


//push method to add elements to the stack
		public void push(int value){
			if(isFull()){
				System.out.println("Stack is full.Cannot push:  "+value);
			}else{
				stackArray[++top]=value;
			}
		}


//pop method to remove and return the top element of the stack
		public int pop(){
			if(isEmpty()){
				System.out.println("stack is empty.Cannot pop.");
				return -1;
			}else{
				return stackArray[top --];
			}
		}


//peek method to view the top element without removing it
		public int peek(){
			if(isEmpty()){
				System.out.println("Stack is empty.");
				return -1;
			}else{
				return stackArray[top];
			}
		}


//method to check if the stack is empty
		public boolean isEmpty(){ //check is the top is not negative 1
			return(top == -1);
		}


//method to check if the stack is full
		public boolean isFull(){
			return (top == maxSize -1);
		}

		public static void main(String [] args){
			StackArray stack = new StackArray(5); // create a stack with a size of 5

			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60); //this will display "Stack is full

		System.out.println("Top elements is : "+stack.peek()); //should display 50
		System.out.println("Popped elements is : "+stack.pop()); //should display 50
		System.out.println("Top elements after pop : "+stack.peek()); //should display 40

	}
}