/**
 * @see Marcacao
 */
public class MarcacaoAGEmp extends Marcacao{
    /**
     * I set {@code aula} as private because it's in the last subclass
     */
    private AulasDeGrupo aula;
    /**
     * I set {@code socioEmp} as private because it's in the last subclass
     */
    private SocioEmpresario socioEmp;

    /**
     * The constructor of an empty class MarcacaoAGEmp
     */
    public MarcacaoAGEmp(){}

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal final cost
     * @param aula group lesson
     * @param socioEmp corporate member
     */
    public MarcacaoAGEmp(Data data, Hora hora, double custoFinal,AulasDeGrupo aula,SocioEmpresario socioEmp) {
        super(data, hora, custoFinal);
        this.aula = aula;
        this.socioEmp = socioEmp;
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
     * @param aula group lesson
     */
    public void setAulaG(AulasDeGrupo aula) {
        this.aula = aula;
    }

    /**
     * Gets you all info of member registered in the group lesson in this class
     * @return socioEmp
     */
    public SocioEmpresario getSocioEmp() {
        return socioEmp;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setSocioEmp}
     * @param socioEmp corporate member
     */
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }

    /**
     *  A String representation of this corporate member's group class booking.
     * <ul>
     *   <li>Complete details of the scheduled group activity</li>
     *   <li>Corporate member's full identification and company data</li>
     *   <li>Final discounted price to be paid (in euros)</li>
     * </ul>
     * @return  a multi-line string with activity, member, and pricing information
     */
    public String toString(){
        return "A aula de grupo marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socioEmp.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100))+"€.\n");
    }
}
