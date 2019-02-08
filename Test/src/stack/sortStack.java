package stack;

import java.util.Stack;

public class sortStack {
	
	public static Stack<Integer> sorting(Stack<Integer> input)
	{
		Stack<Integer> tmpStack = new Stack<Integer>();
		 while(!input.isEmpty()) 
	        { 
			 int tmp = input.pop();
			 while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) 
			 { 
				 input.push(tmpStack.pop()); 
			 } 
			 tmpStack.push(tmp); 
	        }
		
		return tmpStack;
	}
	
	public static void main(String[] args) 
	{
		Stack<Integer> intobj =new  Stack<Integer>();
		intobj.add(20);
		intobj.add(28);
		intobj.add(3);
		intobj.add(34);
		intobj.add(1);
		intobj.add(99);
		
		
		Stack<Integer> tmpStack = sorting(intobj);
		System.out.println("Sorted numbers are:"); 
	      
        while (!tmpStack.empty()) 
        { 
            System.out.print(tmpStack.pop()+" "); 
        } 
		
	}

}
