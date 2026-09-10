import java.util.*;
public class qusingstack {
    public static void main(String[] args){
        queue obj = new queue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.peek());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
    }
    public static class queue{
        public Stack<Integer> stack = new Stack<>();
        public Stack<Integer> head = new Stack<>();
        public void push(int data){
            // here push is 0(n) and remove is o(1) i can add elemts on top and remopve
            //from bottom by doiung opposit for inverse but in tht we wil peek also 0(n)


                while (!head.isEmpty()){
                stack.push(head.pop());}
                head.push(data);
                while(!stack.isEmpty()){
                    head.push(stack.pop());

            }
        }
        public int pop(){
            if (head.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int data = head.pop();
            return data;
        }
        public int peek(){
            if (head.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.peek();
        }
    }
}

// amortized here u can see that it may seem push and pop are o(n) but they are only like tyhat for some times
// till then they are o (1 )which is amortied O(10
//class MyQueue {
//
//    public MyQueue() {
//    }
//    Stack<Integer> z = new Stack<>();
//    Stack<Integer> y = new Stack<>();
//
//    public void push(int x) {
//        //   while(!z.isEmpty()){
//        //     y.push(z.pop());
//        //    }
//        z.push(x);
//        //    while(!y.isEmpty() ){
//        //     z.push(y.pop());
//        //    }
//
//
//    }
//
//    public int pop() {
//        if (!y.isEmpty()){
//            return y.pop();
//        }
//        while (!z.isEmpty()){
//            y.push(z.pop());
//        }
//        return y.pop();
//
//        // return z.pop();
//
//    }
//
//    public int peek() {
//        // return z.peek();
//        if (!y.isEmpty()){
//            return y.peek();
//        }
//        while (!z.isEmpty()){
//            y.push(z.pop());}
//        return y.peek();
//
//    }
//
//    public boolean empty() {
//        return z.isEmpty() && y.isEmpty() ;
//
//    }
//}
//
///**
// * Your MyQueue object will be instantiated and called as such:
// * MyQueue obj = new MyQueue();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.peek();
// * boolean param_4 = obj.empty();
// */