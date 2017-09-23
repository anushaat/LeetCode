package Medium;

import java.util.Stack;

public class ReversePolishNotation {

	public int evalRPN(String[] tokens) {
        Stack<Integer> st =new Stack<>();
        for(String str : tokens){
        	switch(str){
        	case "+":
        		st.push(st.pop() + st.pop());
        		break;
	        case "-":
	    		st.push(-st.pop() + st.pop());
	    		break;
			case "*":
				st.push(st.pop() * st.pop());
				break;
			case "/":
				int b = st.pop(), a = st.pop();
				st.push(a/b);
				break;
			default:
				st.push(Integer.parseInt(str));
        	}
        }
        return st.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
