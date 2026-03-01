public class CircularQueueUsingArray {

    static class Queue{

        int size ;
        int[] arr ;
        int front = -1 ;
        int rear = -1 ;

        Queue(int size){
            this.size = size ;
            arr = new int[size] ;
        }


        boolean isEmpty(){
            return front == -1 && rear == -1 ;
        }

        boolean isFull(){
            return (rear+1)%size == front  ;
        }

        //  ENQUEUE - add the element
        void add(int n){
            if (isFull()){
                System.out.println("Queue is full!!!");
                return ;
            }

            if (front == -1){
                front = 0 ;
            }
            rear = (rear+1)%size ;
            arr[rear] = n ;
        }



        //  DEQUEUE - remove element from the front
        int remove(){
            // IF THE QUEUE IS EMPTY
            if (isEmpty()){
                System.out.println("Queue is already Empty");
                return -1 ;
            }
            int ans = arr[front] ;
            // IF THE QUEUE HAS ONLY ONE ELEMENT
            if(front == rear){
                front = -1 ;
                rear = -1 ;
                return ans ;
            }

            // FOR REST CASES
            front = (front+1)%size ;
            return ans ;
        }


        //  FRONT - peek to the first element
        int peek(){
            if (isEmpty()){
                System.out.println("Queue is already empty");
                return -1 ;
            }

            return arr[front] ;
        }

        //  PRINTING THE QUEUE
        void printQueue(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return ;
            }
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }


        static void main(String[] args) {
            Queue q = new Queue(5) ;
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);


            q.printQueue();
            q.remove() ;
            q.printQueue();
            q.add(6) ;
            q.printQueue();
        }
    }
}
