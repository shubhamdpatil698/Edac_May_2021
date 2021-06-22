package Stack;

import Stack.CircularQueue;



public class StackQueue{

	int top;
	int size;
	int count = 0;

	CircularQueue Q;

	StackQueue(int size)
		{

		 Q= new CircularQueue (size);
		top = -1;
		}


		public boolean isEmpty(){
			if(Q.isEmpty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}


		public boolean isFull(){
			if(Q.isFull())
			{
				return true;
			}
			else
			{
				return false;
			}
		}



		public void addElement(int element){
			if(isFull())
			{
				System.out.println("Stack is full");
			}
			else
			{
				Q.Enqueue(element);
				top=Q.rear;
			}
		}
		
		public void deleteElement(){
			if(isEmpty())
			{
				System.out.println("Stack is full");
			}
			else
			{	
			//int temp = Q.front;
//				Q.front= Q.rear;
//				Q.rear=temp;
				Q.front = --top;
				Q.Dequeue();
				//Q.front = temp;
				
			}
		}

		public void display(){

			for(int i = 0; i<=top; i++)
			{
				System.out.print(" "+Q.arr[i]+" ");
			}
		}




		public static void main(String args[])
		{
			StackQueue sq = new StackQueue(5);

			sq.addElement(10);
			sq.addElement(20);
			sq.addElement(30);
			sq.display();
			System.out.println();
			sq.deleteElement();
			sq.display();
			System.out.println();
			sq.addElement(40);
			sq.addElement(50);
			sq.addElement(50);
			sq.addElement(50);
			sq.deleteElement();
			sq.display();
		}
}