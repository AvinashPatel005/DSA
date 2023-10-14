package Array.BASIC;
//finding the sub-array of given sum.
//O(n)
public class q13a {
    public static void findSubArray(int[] arr ,int sumVal){
        int sum=0;
        int index=0;
        int i=0;
        while(sum!=sumVal && i<=arr.length) {
            if (sum < sumVal) {
                if(i>=arr.length) break;
                sum += arr[i];
                i++;
            }
            if (sum > sumVal) {
                sum -= arr[index];
                index++;
            }
        }
        if(sum==sumVal) System.out.println("Sum found between "+index+" and "+(i-1));
        else System.out.println("No SubArray found");
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 0, 0, 3, 10,6};
        findSubArray(arr,2);
    }
}
