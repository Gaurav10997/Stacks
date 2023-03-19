package LinkedListImplementation;

public class Main {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        static Node head = null ;

        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return ;
            }
            newNode.next=head;
            head=newNode;
        }

        public int pop(){
            int data = head.data;
            head=head.next;
            return data;
        }
        public int peek(){
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.print(st.peek()+ " ");
            st.pop();
        }
    }
}
