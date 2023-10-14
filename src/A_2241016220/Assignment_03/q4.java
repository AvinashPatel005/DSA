package A_2241016220.Assignment_03;

public class q4 {
    public static <T>void printArray(T[] arr)
    {
        for(T i : arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Integer[] a = {10,20,30,40,50};
        System.out.println("Integer array elements are: ");
        printArray(a);
        String[] b = {"IGT","DSA","UPM","Calculas"};
        System.out.println("\nString array elements are: ");
        printArray(b);
    }
}
