package Array.BASIC;
// element occurring once while others twice
//o(n)
public class q11 {
    public static void main(String[] args) {
        int[] arr =  {2, 3, 5, 4, 5, 3, 4};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
            System.out.println(res);
        }
        System.out.println(res);
    }
}
