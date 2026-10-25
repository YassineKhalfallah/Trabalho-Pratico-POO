public class MarcacaoPTInd extends Marcacao {
    private PersonalTraining aula;
    private SocioIndividual socioInd;
    public MarcacaoPTInd(){}
    public MarcacaoPTInd(Data data, Hora hora, double custo,PersonalTraining aula,SocioIndividual socioInd) {
        super(data, hora, custo);
        this.aula = aula;
        this.socioInd = socioInd;
    }
    public PersonalTraining getAula() {
        return aula;
    }
    public void setSessaoP(PersonalTraining aula) {
        this.aula = aula;
    }
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
