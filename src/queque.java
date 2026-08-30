public class queque {
    static class Queue{
        /// baisc properties
         static int arr[];
        static int size;
       static int rear = -1;
        Queue(int n){
            arr=new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            if (rear == - 1 ){
                return true;
            }
            else {
                return false;
            }
        }
        public void enqueue(int x){
            if ( rear == size-1){
                System.out.println("queue is full");
            }
            else{
                rear++;
                arr[rear]=x;
            }
        }
        public static int  dequeue(){
            if (rear == -1){
                System.out.println("queue is empty");
            }
            int front = arr[0];
                for (int i = 0 ; i < rear ; i ++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
return front;

        }
        public static int  peek(){
            if (rear == -1){
                System.out.println("queue is empty");
                return -1;
            }return arr[0];}

    }
    public static void main (String[] args) {
        Queue Q = new Queue(5);
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        System.out.println(Q.dequeue());
        System.out.println(Q.peek());
    }
//array methosd done
    }