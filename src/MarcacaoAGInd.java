public class MarcacaoAGInd extends Marcacao {
    private AulasDeGrupo aula;
    private SocioIndividual socioInd;
    public MarcacaoAGInd(){}
    public MarcacaoAGInd(Data data, Hora hora, double custoFinal,AulasDeGrupo Aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.aula = Aula;
        this.socioInd = socioInd;
    }

    public AulasDeGrupo getAula() {
        return aula;
    }

    public void setAulaG(AulasDeGrupo aula) {
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
        return "A aula de grupo marcada tem este informacao:\n"+aula.toString()+
                "\nE tem o socio com as informcaoes seguintes:\n"+socioInd.toString()+
                "e o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioInd.getDesconto())/100)));
    }

}
