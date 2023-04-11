package Array.BASIC;
//Print 3 Largest Elements of an Array.
//O(n)
public class q1 {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,2,23,23};
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) {
                third_max=second_max;
                second_max=max;
                max=arr[i];
            }
            else if(second_max<arr[i]){
                third_max=second_max;
                second_max=arr[i];
            }
            else{
                third_max=arr[i];
            }
        }
        System.out.println(max+" "+second_max+" "+third_max);
    }
}
