class test{
    public static void fibo(int fn,int sn,int n){
        if(n==0){
            return;
        }
        System.out.println(fn);
        fibo(sn,fn+sn,n-1);
    }
    public static int btod(int n){
        if(n==0) return 0;
        return btod(n/2)*10+n%2;
    }

    public static void main(String[] args) {
        System.out.println(btod(5));
    }
}