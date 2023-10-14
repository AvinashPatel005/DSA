package Array.MEDIUM;

public class q10 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19,100};
        int x = 51;
        int sum=0;
        int count=Integer.MAX_VALUE;
        int c=0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(sum<=x){
                sum+=arr[i];
                c++;
            }
            if(sum>x){
                sum-=arr[index];
                index++;
                c--;
                i--;
                if(sum>x&&c<count) count=c;
            }
        }
        System.out.println(count);
    }
}
