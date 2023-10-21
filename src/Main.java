import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Linkedlist */
        LinkedList<String> fruit = new LinkedList<>();

        // 1 operator add
        LinkedListADT.AddElement(fruit);
        LinkedListADT.AddElementWithIndex(fruit, 0 ,"Cat");
        LinkedListADT.GetElementByIndex(fruit,2);
        LinkedListADT.ScanElementLinkedlist(fruit);


        /*Stack*/
        Stack<Integer> numbers = new Stack<>();
        // 1 push stack
        StackADT.StackPush(numbers);
        // 2 pop stack
        StackADT.StackPop(numbers);
        // 3 peek stack
        StackADT.StackPeek(numbers);
        // 4 search stack
        StackADT.StackSearch(numbers, 3 );
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