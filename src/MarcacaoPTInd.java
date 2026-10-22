public class MarcacaoPTInd extends Marcacao {
    private PersonalTraining Aula;
    private SocioIndividual socioInd;
    MarcacaoPTInd(Data data, Hora hora, double custoFinal,PersonalTraining Aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioInd = socioInd;
    }
}
