import java.util.Stack;

public class StackADT {

//    Push define is add element to stack
    public static void StackPush(Stack<Integer> stack){
        for (int i =0; i <= 10; i++){
            stack.push(i); //push i element to stack
        }
        System.out.println("Stack :" + stack);
    }

    //poping element from the top of stack
    public static void StackPop(Stack<Integer> stack ) {
       int element = stack.pop();
        System.out.println("element : " + element); //display element poped
    }

    //Displaying element on the top of the stack
    public static void StackPeek(Stack<Integer> stack){
        int element = stack.peek();
        System.out.println("element on the top : " + element); //display element peeked
    }

    //Search element in the stack
    public static void StackSearch(Stack<Integer> stack, int element) {
        int findElement = stack.search(element);
        if (findElement == -1){
                System.out.println(element + "can not find in the stack"); //if element not exist, return not found
        }
        else {
             System.out.println(element + " is found at position " + findElement);//if element exist, return found
        }
    }


    //check stack empty
    public static void checkEmptyStack(Stack<Integer> stack){
        boolean result = stack.empty();
        if (result){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }
}
