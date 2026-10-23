public class MarcacaoPTEmp extends Marcacao {
    private PersonalTraining Aula;
    private SocioEmpresario socioEmp;
    public MarcacaoPTEmp(){}
    public MarcacaoPTEmp(Data data, Hora hora, double custoFinal,PersonalTraining Aula,SocioEmpresario socioEmp) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioEmp = socioEmp;
    }
    public PersonalTraining getAula() {
        return Aula;
    }
    public void setSessaoP(PersonalTraining Aula) {
        this.Aula = Aula;
    }
    public SocioEmpresario getSocioInd() {
        return socioEmp;
    }
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }
}
