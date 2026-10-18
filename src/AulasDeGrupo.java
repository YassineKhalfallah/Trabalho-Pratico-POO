/**
 * @see Atividades
 */
public class AulasDeGrupo extends Atividades{
    /**
     * I set {@code tipoAula}, {@code capacidadeMaxima} & {@code numeroDePessoasNaAtividade} as private because it's the last subclass
     */
    private String tipoAula;
    private int capacidadeMaxima;
    private int numeroDePessoasNaAtividade;
    /**
     * The constructor of an empty class AulasDeGrupo
     */
    public AulasDeGrupo(){};
    /**
     * The constructor of the class AulasDeGrupo, where we set the given values to each parameter
     * @param tipoAula
     * @param preco
     * @param hora
     * @param capacidadeMaxima
     * @param numeroDePessoasNaAtividade
     */
    public AulasDeGrupo(String tipoAula, double preco, int hora, int capacidadeMaxima, int  numeroDePessoasNaAtividade) {
        super(preco, hora);
        this.tipoAula = tipoAula;
        this.capacidadeMaxima = capacidadeMaxima;
        this.numeroDePessoasNaAtividade = numeroDePessoasNaAtividade;
    }
    /**
     * Get's you the type of the group lesson in this class
     * @return tipoAula
     */
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
    /**
     * Get's you the maxim capacity of the group lesson in this class
     * @return capacidadeMaxima
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    /**
     * Gets you the number of people in the group lesson in this class
     * @return numeroDePessoasNaAtividade
     */
    public int getnumeroDePessoasNaAtividade() {
        return numeroDePessoasNaAtividade;
    }
    public void setNumeroDePessoasNaAtividade(int numeroDePessoasNaAtividade) {
        this.numeroDePessoasNaAtividade = numeroDePessoasNaAtividade;
    }
    /**
     * Gets the info about the scheduled group lesson:
     * <ul>
     *     <li>Scheduled hour</li>
     *     <li>Type of lesson</li>
     *     <li>Lesson price</li>
     *     <li>Number of people registered </li>
     *     <li>Maximum number for participants</li>
     * </ul>
     * @return info group lesson
     */
    public String toString() {
        return "Aula de grupo marcada para " +this.hora + "h do tipo "+ geTipoAula()+ ", custa "+getPreco()+
                " faltam "+getnumeroDePessoasNaAtividade()+ " para chegar ao "+getCapacidadeMaxima();
    }
}
