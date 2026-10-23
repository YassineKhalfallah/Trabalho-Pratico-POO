public class MarcacaoAGInd extends Marcacao {
    private AulasDeGrupo Aula;
    private SocioIndividual socioInd;
    public MarcacaoAGInd(){}
    public MarcacaoAGInd(Data data, Hora hora, double custoFinal,AulasDeGrupo Aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioInd = socioInd;
    }
    public AulasDeGrupo getAula() {
        return Aula;
    }
    public void setAulaG(AulasDeGrupo Aula) {
        this.Aula = Aula;
    }
    public SocioIndividual getSocioInd() {
        return socioInd;
    }
    public void setSocioInd(SocioIndividual socioInd) {
        this.socioInd = socioInd;
    }
}
