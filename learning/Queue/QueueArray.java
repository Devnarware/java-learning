public class QueueArray {

    static class Queue{
         int arr[] ;
         int size ;
         int rear = -1 ;

        Queue(int n){
            this.size = n ;
            arr = new int[n] ;
        }

         boolean isEmpty(){
            return rear == -1 ;
        }


        //  ENQUEUE - add the element in the last
         void add(int n) {
            if(rear == size - 1){
                System.out.println("Queue is full");
                return ;
            }
            rear++ ;
            arr[rear] = n ;
            return ;
        }

        //  DEQUEUE - removing the first element
         int dequeue(){
            if (isEmpty()){
                System.out.println("Queue is already empty");
                return -1 ;
            }

            int front = arr[0] ;
            for (int k = 0; k < rear; k++) {
                arr[k] = arr[k+1] ;
            }
            rear-- ;
            return front ;
        }


        //  FRONT - return the first element
         int peek(){
            if (isEmpty()){
                System.out.println("Queue is already empty");
                return -1 ;
            }

            return arr[0] ;
        }

        //  PRINT THE QUEUE
         void print(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return ;
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    static void main(String[] args) {


        Queue q = new Queue(5) ;

        q.add(1) ;
        q.add(2) ;
        q.add(3) ;
        q.add(4) ;
        q.add(5) ;

        System.out.println(q.dequeue());
        q.print() ;

    }
}
