package Array.BASIC;

import java.util.Arrays;
//Segregate even and odd numbers.
public class q5 {
    public static void main(String[] args) {
        int arr[] = {1 ,9 ,5, 3 ,2, 6 ,7 ,11};

        int even_count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i]=arr[even_count];
                arr[even_count]=temp;
                even_count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
