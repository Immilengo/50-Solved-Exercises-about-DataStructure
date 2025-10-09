public class caminhoNo implements Comparable<caminhoNo> {
    private String no;
    private int distancia;

    public caminhoNo(String no,int distancia){
        this.no = no;
        this.distancia = distancia;
    }

    public String getNo(){return this.no;}
    public int getPeso(){return this.distancia;}

    @Override
    public int compareTo(caminhoNo arg0) {
        return Integer.compare(this.distancia, arg0.distancia);
    }
}
