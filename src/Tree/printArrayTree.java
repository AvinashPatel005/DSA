package Tree;

public class printArrayTree {
    public static void print(int[] tree){
        int count=0;
        int prevCount=1;
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
            if(count+1==prevCount){
                System.out.println();
                count=0;
                prevCount*=2;
            }
            else count++;
        }
    }
    public static void main(String[] args) {
        int[] tree = {1,2,3,4,5,6,7,8,9};
        print(tree);
    }
}
