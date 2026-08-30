public class CIRCLEQ {
    static class Queue{
        /// baisc properties
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr=new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            if (rear == - 1  && front == -1){
                return true;
            }
            else {
                return false;
            }
        }
        public void enqueue(int x){


            if ((rear+1)%size == front && rear != -1){
                System.out.println("full");
                return;
            }
            rear = (rear+1)%size;
            if (front == -1){
                front = 0;
            }

                arr[rear]=x;


        }
        public static int  dequeue(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear ){
                front = -1;
                rear = -1;
            }else{
            front = (front+1)%(size);}
            return result;

        }
        public static int  peek(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }return arr[front];}

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

