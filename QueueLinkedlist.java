class Node {
	 int data;
	 Node next;
		
	public Node(int data){
	    this.data=data;
	    this.next=null;
	    }
}

class Queue {
	private Node front,rear;
	public Queue(){
	    this.front=this.rear=null;
	    }
	    
public void Enqueue(int data){
    Node newNode=new Node (data);
    
    if(this.rear == null) {
        this.front=this.rear=newNode;
        System.out.println(data + "enqued");
    return;
            }
        
        this.rear.next=newNode;
        this.rear=newNode;
        System.out.println(data + "enqued");
         }
         public void PrintQueue(){
             
             if (this.front==null){
             System.out.println("Queue is empty");
             return;
    }
      Node current= front;
      System.out.print("Queue");
      while(current != null){
        System.out.print(current.data +" ");
        current = current.next;
        }
        System.out.println();
        }
}
            public class QueueUsingLinkedlist{
        public static void main(String[] args){
            Queue queue=new Queue();
            queue.Enqueue(10);
            queue.Enqueue(20);
            queue.Enqueue(30);
            queue.Enqueue(40);
            queue.PrintQueue();
	    }
}