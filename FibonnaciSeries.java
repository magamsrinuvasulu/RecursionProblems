class FibonnaciSeries{
    public static int fib(int n) {
        if(n<=1)
        return n==1?1:0;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        System.out.println(fib(5));
    }
}