/**
 * @see Marcacao
 */
public class MarcacaoPTInd extends Marcacao {
    /**
     * I set {@code aula} as private because it's in the last subclass
     */
    private PersonalTraining aula;
    /**
     * I set {@code socioInd} as private because it's in the last subclass
     */
    private SocioIndividual socioInd;

    /**
     * The constructor of an empty class MarcacaoPTInd
     */
    public MarcacaoPTInd(){}

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal Final coast
     * @param aula  PT session
     * @param socioInd Individual member
     */
    public MarcacaoPTInd(Data data, Hora hora, double custoFinal,PersonalTraining aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.aula = aula;
        this.socioInd = socioInd;
    }

    /**
     * Gets you all info of the Personal Session in this class
     * @return aula
     */
    public PersonalTraining getSessaoP() {
        return aula;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setSessaoP}
     * @param aula PT Session
     */
    public void setSessaoP(PersonalTraining aula) {
        this.aula = aula;
    }

    /**
     * Gets you all info of member registered in the Personal Session in this class
     * @return socioInd
     */
    public SocioIndividual getSocioInd() {
        return socioInd;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setSocioInd}
     * @param socioInd Individual member
     */
    public void setSocioInd(SocioIndividual socioInd) {
        this.socioInd = socioInd;
    }

    /**
     *A String representation of this Individual member's Personal Training Session booking.
     *  <ul>
     *   <li>Complete details of the scheduled Personal Training Session</li>
     *   <li>Individual member's full identification </li>
     *   <li>Final discounted price to be paid (in euros)</li>
     *  </ul>
     * @return a multi-line string with activity, member, and pricing information
     */
    public String toString(){
        return "A seesao PT marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socioInd.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100))+"€.\n");
    }
}
