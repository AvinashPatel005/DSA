import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s= "20/01/2023";
        String[] arr = s.split("/");
        System.out.println(Integer.parseInt(arr[1]));

    }
}