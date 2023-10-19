import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Linkedlist */
        LinkedList<String> animals = new LinkedList<>();

        // 1 operator add
        LinkedListADT.addElement(animals);
        LinkedListADT.addElementWithIndex(animals, 0 , "Tiger");
        LinkedListADT.getElementByIndex(animals,2);
        LinkedListADT.scanElementLinkedlist(animals);


        /*Stack*/
        Stack<Integer> numbers = new Stack<>();
        // 1 push stack
        StackADT.stackPush(numbers);
        // 2 pop stack
        StackADT.stackPop(numbers);
        // 3 peek stack
        StackADT.stackPeek(numbers);
        // 4 search stack
        StackADT.stackSearch(numbers, 3 );
        // 5 check stack
        StackADT.checkEmptyStack(numbers);

        /* Queue implement Linkedlist */
        Queue<String> fruits = new LinkedList<>();
        QueueLinkedListADT.queueAdd(fruits);
        Queue<Integer> number = new LinkedList<>();
        QueueLinkedListADT.queueOffer(number);
        QueueLinkedListADT.queuePeek(number);
        QueueLinkedListADT.queuePoll(number);
        QueueLinkedListADT.queueSearch(number,3);
        QueueLinkedListADT.forQueue(number);


    }
}