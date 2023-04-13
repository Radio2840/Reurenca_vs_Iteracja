public class Silnia {
    // 5! = 1*2*3*4*5

    public static long sil(int doile){
        long wynik = 1;
        for(int i=1;i<=doile;i++){
            wynik = wynik*i;
        }
        return wynik;
    }
}
