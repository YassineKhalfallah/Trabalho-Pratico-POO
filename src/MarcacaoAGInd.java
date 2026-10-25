/**
 * @see Marcacao
 */
public class MarcacaoAGInd extends Marcacao {
    /**
     * I set {@code aula} as private because it's in the last subclass
     */
    private AulasDeGrupo aula;
    /**
     * I set {@code socioInd} as private because it's in the last subclass
     */
    private SocioIndividual socioInd;

    /**
     * The constructor of an empty class MarcacaoAGInd
     */
    public MarcacaoAGInd(){}
    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data
     * @param hora
     * @param custoFinal
     * @param aula
     * @param socioInd
     */
    public MarcacaoAGInd(Data data, Hora hora, double custoFinal,AulasDeGrupo aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.aula = aula;
        this.socioInd = socioInd;
    }

    /**
     * Gets you all info of the group lesson in this class
     * @return aula
     */
    public AulasDeGrupo getAulaG() {
        return aula;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setAulaG}
     * @param aula
     */
    public void setAulaG(AulasDeGrupo aula) {
        this.aula = aula;
    }

    /**
     * Gets you all info of member registered in the group lesson in this class
     * @return socioInd
     */
    public SocioIndividual getSocioInd() {
        return socioInd;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setSocioInd}
     * @param socioInd
     */
    public void setSocioInd(SocioIndividual socioInd) {
        this.socioInd = socioInd;
    }

    /**
     * A String representation of this Individual member's group class booking.
     * <ul>
     *  <li>Complete details of the scheduled group activity</li>
     *  <li>Individual member's full identification </li>
     *  <li>Final discounted price to be paid (in euros)</li>
     * </ul>
     * @return a multi-line string with activity, member, and pricing information
     */
    public String toString(){
        return "A aula de grupo marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socioInd.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100))+"€.\n");
    }

}
