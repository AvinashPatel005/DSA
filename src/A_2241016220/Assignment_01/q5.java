package A_2241016220.Assignment_01;

public class q5 {
    public static void main(String[] args) {
        int n = 9294;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
            if(n==0&&sum>=10){
                n = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
