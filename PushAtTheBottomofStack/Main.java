package PushAtTheBottomofStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        PushAtTheBottom(st, 4);
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }

    }
    public static void  PushAtTheBottom(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return ;
        }
        int top = st.pop();
        PushAtTheBottom(st, data);
        st.push(top);
    }
}
