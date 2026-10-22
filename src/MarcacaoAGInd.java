public class MarcacaoAGInd extends Marcacao {
    private AulasDeGrupo Aula;
    private SocioIndividual socioInd;

    MarcacaoAGInd(Data data, Hora hora, double custoFinal,AulasDeGrupo Aula,SocioIndividual socioInd) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioInd = socioInd;
    }
}
