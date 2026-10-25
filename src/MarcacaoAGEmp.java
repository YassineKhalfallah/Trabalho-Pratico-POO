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
     * @param data
     * @param hora
     * @param custoFinal
     * @param aula
     * @param socioEmp
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

    public void setAulaG(AulasDeGrupo Aula) {
        this.aula = Aula;
    }

    /**
     * Gets you all info of member registered in the group lesson in this class
     * @return socioEmp
     */
    public SocioEmpresario getSocioEmp() {
        return socioEmp;
    }
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }
    public void setCustoFinal() {
        this.custoFinal = aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100));
    }

    public String toString(){
        return "A aula de grupo marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+aula.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100))+"€.\n");
    }
}
