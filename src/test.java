import java.util.LinkedList;

public class test {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add(null); // Adding null

        System.out.println("Linked List: " + linkedList);
        System.out.println(linkedList.size());
    }
}
