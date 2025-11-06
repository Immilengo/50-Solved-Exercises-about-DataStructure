public class testeReference {

    public static int multiplicar(int a){
        return a * 2;
    }
    public static int mdc(int a,int b){
        return b == 0 ? a : mdc(b, a%b);
    }
    public static int mmc(int a, int b){
        return a/mdc(a,b)*b;
    }
}