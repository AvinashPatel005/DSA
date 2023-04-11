package A_2241016220.Assignment_01;

public class q7 {
    public static void main(String[] args) {
        int[] arr = {12,14,12,14,13};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxCount=0,minCount=0;
        int maxIn=0,minIn=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) {
                min = arr[i];
                minCount=1;
            }
            else if(min==arr[i]) {
                minCount++;
                minIn=i+1;
            }
            if(max<arr[i]) {
                max = arr[i];
                maxCount=1;
                maxIn=i+1;
            }
            else if(max==arr[i]) maxCount++;
        }

        System.out.println(min+" "+max);
        System.out.println(minCount+" "+maxCount);
        System.out.println(minIn+" "+maxIn);
    }
}
