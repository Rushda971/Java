//Linked list
import java.util.LinkedList;
class Linkedlist{
    public static void main(String[] args) {
        LinkedList <String> hobbies = new LinkedList <String>();
        hobbies.add("Cooking");
        hobbies.add("Riffle Shooting");
        hobbies.add("Perfume Making");
        hobbies.add("Novel Writing");
        hobbies.add("Money Making");

        System.out.println(hobbies);

    //addFirst
    hobbies.addFirst("MMA");
    System.out.println("Add First: "+hobbies);
    //addLast
    hobbies.addLast("Basketball");
    System.out.println("Add Last: "+hobbies);
    //removeLast
    System.out.println("Remove First: "+hobbies);
    //removeFirst
    System.out.println("Remove Last: "+hobbies.removeFirst());
    //getFirst
    System.out.println("get first element: "+hobbies.getFirst());
    //getLast
    System.out.println("get last element: "+hobbies.getLast());
    }
}