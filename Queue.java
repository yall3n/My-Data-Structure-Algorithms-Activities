public class Queue{
	private int[] queueArray;
	private int front;
	private int rear;
	private int maxSize;
	private int currentSize;

//Constructor	to initialize the queue
	public Queue(int size){
		maxSize = size;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		currentSize = 0;
		}

//Enqueue method to add an element to the rear of the queue
		public void enqueue(int value){
			if(isFull()){
				System.out.println("Queue is full. Cannot enqueue " + value);
				}else{
					rear = (rear + 1) % maxSize; //Circular increment
					queueArray[rear] = value;
					currentSize++;
					}
			}

//Dequeue method to remove and return the front element of the queue
			public int dequeue(){
				if(isEmpty()){
					System.out.println("Queue is empty. cannot dequeue.");
					return -1;
					}else{
						int value = queueArray[front];
						front = (front + 1) % maxSize; //Circular increment
						currentSize--;
						return value;
						}
				}

				public int peek(){
					if(isEmpty()){
						System.out.println("Queue is empty.");
						return -1;
						}else{
							return queueArray[front];
							}
					}

					public boolean isEmpty(){
						return(currentSize == 0);
						}

						public boolean isFull(){
							return(currentSize == maxSize);
							}

							public static void main(String[] args){
								Queue queue = new Queue(9);

								queue.enqueue(10);
								queue.enqueue(20);
								queue.enqueue(30);
								queue.enqueue(40);
								queue.enqueue(50);
								queue.enqueue(60);
								queue.enqueue(70);
								queue.enqueue(80);
								queue.enqueue(90);
								queue.enqueue(100);

								System.out.println("Front element is: " + queue.peek());
								System.out.println("Dequeue element: " + queue.dequeue());
								System.out.println("Front element after dequeue: " + queue.peek());
								}



	}