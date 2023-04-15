package A_2241016220.Assignment_01;

public class q5 {
    public static int sum_Of_Digits(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
            if(n==0&&sum>10){
                n=sum;
                sum=0;
            }
        }
        return sum;
    }
    public static  int rec_Sum_Of_Digits(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum>10) return rec_Sum_Of_Digits(sum);
        else return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum_Of_Digits(9294));
        System.out.println(rec_Sum_Of_Digits(9294));
    }
}
