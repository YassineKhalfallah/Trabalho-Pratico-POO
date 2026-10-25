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
    public void setSocioInd(SocioIndividual socioInd) {
        this.socioInd = socioInd;
    }

    /**
     * Gets you the final price of the activity in this class
     * @return custoFinal
     */
    public double getCustoFinal() {
        return custoFinal;
    }
    public void setCustoFinal() {
        this.custoFinal = aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100));
    }

    public String toString(){
        return "A aula de grupo marcada tem este informacao:\n"+aula.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socioInd.toString()+
                "\ne o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100))+"€.\n");
    }

}
