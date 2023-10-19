
import java.util.LinkedList;
public class LinkedListADT {

    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("Tung");
        linkedList.add("Cat");
        linkedList.add("Mouse");
        System.out.println("Linkedlist :" + linkedList);
    }
    public static void addElementWithIndex(LinkedList<String> linkedList, int index, String valueElement ){
        linkedList.add(index,"Tiger");
        System.out.println("LinkedList :" + linkedList );
    }
    public static void getElementByIndex(LinkedList<String> object, int index ){
        String element = object.get(index);
        System.out.println("get Element : " + element);
        System.out.println("Linkedlist : " + object);
    }

    public static void setElementValueByIndex(LinkedList<String> object, int index,String value){
        object.set(index, value);
        System.out.println("Linklist : " + object);
    }
    // viet phuong thuc duyet qua cac phan tu cua linkedlist

    public static void scanElementLinkedlist(LinkedList<String> object){
        for (int i = 0; i < object.size(); i++){
            System.out.println("Element value : " + object.get(i));
        }
        for (String j : object){
            System.out.println("Element value : " + j );
        }
    }
}
