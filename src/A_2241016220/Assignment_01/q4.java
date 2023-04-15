package A_2241016220.Assignment_01;

public class q4 {
    public static void main(String[] args) {
        String s = "CAR";
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                for(int k=0;k<=2;k++){
                    if(s.charAt(i)!=s.charAt(j)&&s.charAt(j)!=s.charAt(k)&&s.charAt(i)!=s.charAt(k))
                        System.out.println(s.charAt(i)+""+ s.charAt(j)+""+s.charAt(k));
                }
            }
        }
    }
}
