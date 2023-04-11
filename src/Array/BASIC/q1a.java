package Array.BASIC;
//O(n^2)
public class q1a {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,2,25,23};
        int max,s_max,t_max,temp;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            int[] arer = new int[20];
        }
        System.out.println(arr[arr.length-3]+" "+arr[arr.length-2]+" "+arr[arr.length-1]);
    }
}
