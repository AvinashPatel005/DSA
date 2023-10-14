package Array.BASIC;
//Leaders in an Array
//O(n^2)
public class q12 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader) System.out.print(arr[i]+" ");
        }
    }
}
