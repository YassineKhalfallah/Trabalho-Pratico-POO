public class AulasDeGrupo extends Atividades{
    private String tipoAula;
    private int capacidadeMaxima;
    private int numeroDePessoasNaAtividade;

    public AulasDeGrupo(){};
    public AulasDeGrupo(String tipoAula, double preco, int hora, int capacidadeMaxima, int  numeroDePessoasNaAtividade) {
        super(preco, hora);
        this.tipoAula = tipoAula;
        this.capacidadeMaxima = capacidadeMaxima;
        this.numeroDePessoasNaAtividade = numeroDePessoasNaAtividade;
    }
    public String geTipoAula() {
        return tipoAula;
    }
    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
        if(tipoAula.equals("Yoga")){
            setPreco(8.0);
        }
        if(tipoAula.equals("Spining")){
            setPreco(9.0);
        }
        if(tipoAula.equals("Zumba")){
            setPreco(8.5);
        }
        if (tipoAula.equals("CrossFit")){
            setPreco(12.0);
        }
    }
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public int getnumeroDePessoasNaAtividade() {
        return numeroDePessoasNaAtividade;
    }
    public void setNumeroDePessoasNaAtividade(int numeroDePessoasNaAtividade) {
        this.numeroDePessoasNaAtividade = numeroDePessoasNaAtividade;
    }

    public String toString() {
        return "Aula de grupo marcada para " +this.hora + "h do tipo "+ geTipoAula()+ ", custa "+getPreco()+
                " faltam "+getnumeroDePessoasNaAtividade()+ " para chegar ao "+getCapacidadeMaxima();
    }
}
