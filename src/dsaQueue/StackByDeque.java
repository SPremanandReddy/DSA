package dsaQueue;



import java.util.Deque;
import java.util.ArrayDeque;

class StackByDeque {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		//Implement your logic here and change the return statement accordingly
		Deque<Integer> result = new ArrayDeque<Integer>();
		Deque<Integer> stack1 = new ArrayDeque<Integer>();
		int min = Integer.MAX_VALUE;
		int count=0;
		while(!inputStack.isEmpty()) {
			int val = inputStack.pop();
			if(val<min) {
				min=val;
				count=1;
			}else if(val==min) {
				count++;
			}
			stack1.push(val);
		}
		System.out.println(count+" "+min);
		for(int i=0; i<count; i++) {
			result.push(min);
		}
		while(!stack1.isEmpty()) {
			Integer val = stack1.pop();
			if(val.equals(min)) {
				continue;
			}
			result.push(val);
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(22);
		inputStack.push(14);
		inputStack.push(36);
		inputStack.push(25);
		inputStack.push(18);
		inputStack.push(21);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}