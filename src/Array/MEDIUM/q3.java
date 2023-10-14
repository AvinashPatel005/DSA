package Array.MEDIUM;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] arr   = {50, 40, 70, 60, 90};
        int[] index={3,  0,  4,  1,  2};

        for (int i = 0; i < index.length; i++) {
            int temp = arr[index[i]];
            arr[index[i]]=arr[i];
            arr[i]=temp;
            int temp2 = index[index[i]];
            index[index[i]]=index[i];
            index[i]=temp2;
        }
        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(arr));
    }
}
