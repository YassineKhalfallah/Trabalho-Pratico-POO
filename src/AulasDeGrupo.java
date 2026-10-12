public class AulasDeGrupo extends Atividades{
    private String tipoAula;

    public AulasDeGrupo(){};
    public AulasDeGrupo(String tipoAula, double preco, int hora){
        super(preco, hora);
        this.tipoAula = tipoAula;
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

    public String toString() {
        return "Atividade marcada para " +this.hora + "h do tipo "+ geTipoAula()+ ", custa "+getPreco();
    }
}
