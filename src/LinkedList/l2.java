package LinkedList;
//using collection frameworks
import java.util.*;
public class l2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("is");
        list.addFirst("name");
        System.out.println(list);
        list.addLast("Avinash");
        list.add("Patel");
        System.out.println(list);
        System.out.println(list.size());
    }
}
