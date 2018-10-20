import java.util.Stack;


public class MyClass {
    public static void main(String args[]) {
        
        
    Stack stack = new Stack();
    stack.push(9);
    stack.push(1);
    stack.push(3);
    stack.push(6);
    stack.push(8);
    stack.push(10);
    
    
    Stack sortedStack = sortStack(stack);
    
    while (!sortedStack.isEmpty())
    {
    System.out.println(sortedStack.pop());
    }   

    
    }
    
    
    public static Stack sortStack(Stack stack){
        
        Stack sortedStack =new Stack();
        while(!stack.isEmpty()){
          if(sortedStack.isEmpty()){
              sortedStack.push(stack.pop());
             // System.out.println(sortedStack.peek());
          } 
            
            
            else {
               // sortedStack.push(stack.pop());
                int count = 0;
                int temp = (int) stack.pop();
              //  System.out.println(temp);
                while(!sortedStack.isEmpty() && temp <= (int)sortedStack.peek()){
                    stack.push(sortedStack.pop());
                    count++;
                }
      //          
                sortedStack.push(temp);
      //          
                while(count > 0){
                    sortedStack.push(stack.pop());
                    count--;
                }
            }
        }
        
   
        return sortedStack;
        
        
    }
}
