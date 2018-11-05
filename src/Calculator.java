import java.util.*;


@SuppressWarnings("unused")
public class Calculator {
	
	private Stack<Integer> stack;
	
	public Calculator() {
		this.stack = new Stack<Integer>();
	}
	
	public String toString() {
		String newString = stack.toString().replaceAll(",", "");
		return (newString + ".");
	}
	
	/*
	 * Add a number into the stack
	 * */
	public void loadConstant(int i) {
		stack.push(i);
	}
	
	/*
	 * Perform addition on the last 2 digits in 
	 * the stack.
	 * */
	public void add() {
		int num1 = stack.pop();
		int num2 = stack.pop();
		
		int result = num1 + num2;
		
		stack.push(result);
	}
	
	/*
	 * Perform subtraction on the last 2 digits in 
	 * the stack.
	 * */
	public void subtract() {
		// TODO Auto-generated method stub
		int num1 = stack.pop();
		int num2 = stack.pop();
		
		int result = num1 - num2;
		
		stack.push(result);
	}
	
	/*
	 * Perform multiplication on the last 2 digits in 
	 * the stack.
	 * */
	public void multiply() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Perform division on the last 2 digits in 
	 * the stack.
	 * */
	public void divide() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Recursively add all numbers together within 
	 * the stack
	 * */
	public void total() {
		// TODO Auto-generated method stub
		
	}

}
