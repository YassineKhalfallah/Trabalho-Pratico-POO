/**
 * @see Marcacao
 */
public class MarcacaoPTEmp extends Marcacao {
    /**
     * I set {@code aula} as private because it's in the last subclass
     */
    private PersonalTraining aula;
    /**
     * I set {@code socioEmp} as private because it's in the last subclass
     */
    private SocioEmpresario socioEmp;

    /**
     * The constructor of an empty class MarcacaoPTEmp
     */
    public MarcacaoPTEmp(){}

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal final cost
     * @param aula PT session
     * @param socioEmp Corporate member
     */
    public MarcacaoPTEmp(Data data, Hora hora, double custoFinal,PersonalTraining aula,SocioEmpresario socioEmp) {
        super(data, hora, custoFinal);
        this.aula = aula;
        this.socioEmp = socioEmp;
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
     * @param aula PT Sesson
     */
    public void setSessaoP(PersonalTraining aula) {
        this.aula = aula;
    }

    /**
     * Gets you all info of member registered in the Personal Session in this class
     * @return socioEmp
     */
    public SocioEmpresario getSocioInd() {
        return socioEmp;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setSocioEmp}
     * @param socioEmp Corporate Member
     */
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }

    /**
     *A String representation of this corporate member's Personal Training Session booking.
     * <ul>
     *    <li>Complete details of the scheduled Personal Training Session</li>
     *    <li>corporate member's full identification and company data</li>
     *    <li>Final discounted price to be paid (in euros)</li>
     *  </ul>
     * @return a multi-line string with activity, member, and pricing information
     */
    public String toString(){
        return "A seesao PT marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socioEmp.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100))+"€.\n");
    }
}
