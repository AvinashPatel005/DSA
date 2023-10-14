package Array.MEDIUM;
//nth largest continuous sum in an array
import java.util.ArrayList;
import java.util.Collections;

public class q7 {
    public static void main(String[] args) {
        int[] arr = {10, -10, 20, -40};
        ArrayList<Integer> sumArr = new ArrayList<>();
        int nthLargest=6;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                sumArr.add(sum);
            }
            sum=0;
        }

        Collections.sort(sumArr,Collections.reverseOrder());
        // sumArr.sort(Collections.reverseOrder());
        System.out.println(sumArr.get(nthLargest-1));
    }
}
