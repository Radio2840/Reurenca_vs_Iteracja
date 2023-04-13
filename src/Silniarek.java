public class Silniarek {
    static long sil(int doile){
        if(doile>1)
            return doile*sil(doile-1);
        else
            return 1;
    }
}
