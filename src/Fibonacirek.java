public class Fibonacirek {
    public static long fib(int doile){
        if(doile == 0){
            return 0;
        } else if (doile ==1) {
            return 1;
        } else {
            return fib(doile-1)+fib(doile-2);
        }
    }
}
