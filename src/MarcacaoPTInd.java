public class MarcacaoPTInd extends Marcacao {
    private PersonalTraining Aula;
    private SocioIndividual socioInd;
    public MarcacaoPTInd(){}
    public MarcacaoPTInd(Data data, Hora hora, double custoFinal,PersonalTraining Aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioInd = socioInd;
    }
    public PersonalTraining getAula() {
        return Aula;
    }
    public void setSessaoP(PersonalTraining Aula) {
        this.Aula = Aula;
    }
    public SocioIndividual getSocioInd() {
        return socioInd;
    }
    public void setSocioInd(SocioIndividual socioInd) {
        this.socioInd = socioInd;
    }
}
