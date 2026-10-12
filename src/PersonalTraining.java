public class PersonalTraining extends Atividades{
    private String tipoTraining;
    public PersonalTraining(){};
    public PersonalTraining(String tipoTraining,double preco, int hora){
        super(preco,hora);
        this.tipoTraining = tipoTraining;
    }
    public String getTipoTraining() {
        return tipoTraining;
    }
    public void setTipoTraining(String tipoTraining) {
        this.tipoTraining = tipoTraining;
        if(tipoTraining.equals("Iniciacao")){
            setPreco(18.0);
        }
        if(tipoTraining.equals("Intermédio")){
            setPreco(22.0);
        }
        if(tipoTraining.equals("Avançado")){
            setPreco(28.0);
        }
    }
    public String toString() {
        return "Atividade marcada para " +this.hora + "h do tipo "+ getTipoTraining()+ ", custa "+getPreco();
    }
}
