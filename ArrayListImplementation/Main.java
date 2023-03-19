import java.util.ArrayList;

public class Main {
    static class Stack{
        static ArrayList<Integer> li = new ArrayList<>();
        public  boolean isEmpty(){
            if(li.size()==0){
                return true;
            }
            return false;
        }
        public void push(int data){
            li.add(data);
        }
        public int  pop(){
            if(li.size()==0){
                return -1;
            }
            int data = li.get(li.size()-1);
            li.remove(li.size()-1);
            return data;
        }
        public int peek(){
            if(li.size()==0){
                return -1;
            }
            int data = li.get(li.size()-1);
            return data;
        }

        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(1);
            st.push(2);
            st.push(3);
            // System.out.println(st.pop());
            while(!st.isEmpty()){
                System.out.print(st.peek()+"  ");
                st.pop();
            }
        }

    }
}