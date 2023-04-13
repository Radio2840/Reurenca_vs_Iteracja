import java.math.BigInteger;
import java.util.Date;

public class Fibonaci {
    // suma dwoch poptzrdnich + z wynikiem
    //przed wykonaniem polecena  - koniec polecenia
    // 1+0 = 1 , 1+1 = 2 , 2+3

    public static long fib(int doile){
        int pierwsza = 1;
        int druga = 1;
        int wynik =-0;
        if(doile == 0){
            return 0;
        }
        if(doile == 1){
            return 1;
        }
        for(int i=2;i<doile;i++){
            wynik = pierwsza + druga;
            pierwsza = druga;
            druga = wynik;
        }
        return wynik;
    }


}
