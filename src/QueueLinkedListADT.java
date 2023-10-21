import java.util.Queue;

public class QueueLinkedListADT {

    //add Queue
    public static void queueAdd(Queue<String> queue){
        queue.add("one"); //add one
        queue.add("two"); //add two
        queue.add("three"); //add three
        queue.add("four"); //add four
        System.out.println("Queue : " + queue);
    }

    // offer Queue
    public static void queueOffer(Queue<Integer> queue){
        for (int i = 0; i <= 10; i++){
            queue.offer(i);
        }
        System.out.println("Queue Linkedlist : " + queue); //display queue to screen
    }

    //peek queue
    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("accessElement Queue Linkedlist : " + accessElement); //display element which peeked to screen
        System.out.println("Queue Linkedlist : " + queue); //display queue to screen
    }

    // poll queue : remove element in queue
    public static void queuePoll(Queue<Integer> queue){
        int element = queue.poll();
        System.out.println("Poll element in Queue : " + element);
        System.out.println("Queue Linkedlist : " + queue);
    }

    //search element by value in queue
    public static void queueSearch (Queue<Integer> queue, int value ){
        boolean check = queue.contains(value); //check value in queue
        if (check == false){
            System.out.println(value + " is not found"); //return not found if value not exist
        }
        else {
            System.out.println(value + " is found in Queue"); // if value exist, return found
        }
    }

    //for..
    public static void forQueue(Queue<Integer> queue){
        for (int i: queue){
            System.out.print(i+ " ");
        }
    }


}
