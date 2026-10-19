/**
 * @see Atividades
 */
public class PersonalTraining extends Atividades{
    /**
     * I set tipoTraining as private because it's the last subclass
     */
    private String tipoTraining;
    /**
     * The constructor of an empty class PersonalTraining
     */
    public PersonalTraining(){};
    /**
     * The constructor of the class PersonalTraining, where we give the paramaters the given values
     * @param preco
     * @param hora
     * @param tipoTraining
     */
    public PersonalTraining(String tipoTraining,double preco, int hora, String data){
        super(preco,hora,data);
        this.tipoTraining = tipoTraining;
    }

    /**
     * Gets you the type of the session in this class
     * @return tipoTraining
     */
    public String getTipoTraining() {
        return tipoTraining;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this paramater
     * in a class where we have no access to it, use this function {@code setTipoTraining()}.
     * Also depending on the input we are setting the cost of the session.
     * @param tipoTraining
     */
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

    /**
     * Gets the info about the scheduled session:
     * <ul>
     *     <li>Scheduled hour</li>
     *     <li>Type of training</li>
     *     <li>Lesson price</li>
     *  </ul>
     * @return info personal training
     */
    public String toString() {
        return "Sessao de treino marcada para " +this.hora + "h do tipo "+ getTipoTraining()+ ", custa "+getPreco()+"€";
    }
}
