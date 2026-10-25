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
     * @param data
     * @param hora
     * @param custoFinal
     * @param aula
     * @param socioEmp
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
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }
    public void setCustoFinal() {
        this.custoFinal = aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100));
    }

    public String toString(){
        return "A seesao PT marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socioEmp.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100))+"€.\n");
    }
}
