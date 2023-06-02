package A_2241016220.Assignment_03;

public class q5 {
    public <T>int count(T[] arr, T item)
    {
        int c = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==item)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        q5 o = new q5();
        Integer[] a = {10,20,30,40,50,20,10,20};
        System.out.println("Occurance of search elemets: "+o.count(a,20));
        String[] b = {"IGT","DSA","UPM","Calculas","DSA"};
        System.out.println("\nString array elements are: " +o.count(b,"DSA"));
    }
}
