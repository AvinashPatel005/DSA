package A_2241016220.Assignment_01;

public class q1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count=0;
        while(n>=2){
            count++;
            n/=2;
        }
        System.out.println(count);
    }
}
