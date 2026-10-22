public class MarcacaoAGEmp extends Marcacao{
    private AulasDeGrupo Aula;
    private SocioEmpresario socioEmp;
    public MarcacaoAGEmp(Data data, Hora hora, double custoFinal,AulasDeGrupo Aula,SocioEmpresario socioEmp) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioEmp = new SocioEmpresario();
    }
}
