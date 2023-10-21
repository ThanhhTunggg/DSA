
import java.util.LinkedList;
public class LinkedListADT {

//    Add element to linkedlist use add() function
    public static void AddElement(LinkedList<String> linkedList){
        linkedList.add("Hello");
        linkedList.add("Hi");
        linkedList.add("Halo");
        System.out.println("Linkedlist :" + linkedList);
    }

//    Add element with index which depend on index of element
    public static void AddElementWithIndex(LinkedList<String> linkedList, int index, String valueElement ){
        linkedList.add(index,"Chao");
        System.out.println("LinkedList :" + linkedList );
    }

//    get value of element from list use index
    public static void GetElementByIndex(LinkedList<String> object, int index ){
        String element = object.get(index);
        System.out.println("get Element : " + element); // display elemnt geted to scress
        System.out.println("Linkedlist : " + object); //display linkedlist to screen
    }

    //change value of element base on index
    public static void SetElementValueByIndex(LinkedList<String> object, int index,String value){
        object.set(index, value); //change value
        System.out.println("Linklist : " + object); //display element to screen
    }
    // viet phuong thuc duyet qua cac phan tu cua linkedlist

    public static void ScanElementLinkedlist(LinkedList<String> object){
        for (int i = 0; i < object.size(); i++){
            System.out.println("Element value : " + object.get(i));
        }
        for (String j : object){
            System.out.println("Element value : " + j );
        }
    }
}
