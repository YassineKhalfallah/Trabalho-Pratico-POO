public class MarcacaoAGEmp extends Marcacao{
    private AulasDeGrupo Aula;
    private SocioEmpresario socioEmp;
    public MarcacaoAGEmp(){}
    public MarcacaoAGEmp(Data data, Hora hora, double custoFinal,AulasDeGrupo Aula,SocioEmpresario socioEmp) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioEmp = new SocioEmpresario();
    }
    public AulasDeGrupo getAula() {
        return Aula;
    }
    public void setAulaG(AulasDeGrupo Aula) {
        this.Aula = Aula;
    }
    public SocioEmpresario getSocioEmp() {
        return socioEmp;
    }
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }
}
