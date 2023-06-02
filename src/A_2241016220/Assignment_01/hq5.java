package A_2241016220.Assignment_01;

public class hq5 {

    public static void printMatrix(int[][] a){
        for(int[] as:a){
            for(int i:as){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static int columnSum(int[][] a,int n){
        int sum=0;
        for(int i=0;i< a.length;i++){
            sum+=a[i][n];
        }
        return sum;
    }
    public static int rowSum(int[][] a,int n){
        int sum=0;
        for(int as:a[n]){
            sum+=as;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=(int)(Math.random()*2);
            }
        }
        printMatrix(a);
        int rowMax=0;
        int colMax=0;
        int rowVal, colVal;
        rowVal=colVal=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int temp1= rowSum(a,i);
            int temp2= columnSum(a,i);
            if(rowVal<temp1){
                rowVal=temp1;
                rowMax=i;
            }
            if(colVal<temp2){
                colVal=temp2;
                colMax=i;
            }
        }
        System.out.println("Largest Row Index: "+rowMax);
        System.out.println("Largest Column Index: "+colMax);
    }
}
