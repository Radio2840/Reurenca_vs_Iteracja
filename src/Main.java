import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long start1 =  System.nanoTime();
        for(int i=0;i<100;i++){
            Fibonaci.fib(10);
        }
        long end1 =  System.nanoTime();

        long start2 =  System.nanoTime();
        for(int i=0;i<100;i++){
            Fibonacirek.fib(10);
        }
        long end2 =  System.nanoTime();
        long iter1 = end1-start1;
        long rek1 = end2-start2;
        System.out.println("FIBONACI iteracujnie: "+ iter1+" retuencyjnie: "+ rek1);

        //===================================

        long start3 =  System.nanoTime();
        for(int i=0;i<100;i++){
            Silnia.sil(10);
        }
        long end3 =  System.nanoTime();

        long start4 =  System.nanoTime();
        for(int i=0;i<100;i++){
            Silniarek.sil(10);
        }
        long end4 =  System.nanoTime();
        long iter2 = end3-start3;
        long rek2 = end4-start4;
        System.out.println("SILNIA iteracujnie: "+ iter2+" retuencyjnie: "+ rek2);

    }
}