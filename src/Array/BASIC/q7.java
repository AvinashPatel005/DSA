package Array.BASIC;

public class q7 {
    public static boolean isTriangle(int a,int b,int c){
        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));
        int mid=a+b+c-max-min;
        return min+mid>max;
    }
    public static void main(String[] args) {
        int[]arr= {4, 6, 3, 7};
        int t,c=0;
        for(int i=0;i<arr.length;i++){
            if(isTriangle(arr[i],arr[(i+1)%arr.length],arr[(i+2)%arr.length])){
                c++;
            }
        }
        System.out.println(c);
    }
}
