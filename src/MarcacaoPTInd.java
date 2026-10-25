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
     * @param data
     * @param hora
     * @param custoFinal
     * @param aula
     * @param socioInd
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
    public PersonalTraining getAula() {
        return aula;
    }
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
    public void setSocioInd(SocioIndividual socioInd) {
        this.socioInd = socioInd;
    }
    public void setCustoFinal() {
        this.custoFinal = aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100));
    }

    public String toString(){
        return "A seesao PT marcada tem este informacao:\n"+aula.toString()+
                "\nE tem o socio com as informcaoes seguintes:\n"+socioInd.toString()+
                "e o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100)));
    }
}
