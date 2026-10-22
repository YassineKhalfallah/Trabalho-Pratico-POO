public class MarcacaoPTEmp extends Marcacao {
    private PersonalTraining Aula;
    private SocioEmpresario socioEmp;
    MarcacaoPTEmp(Data data, Hora hora, double custoFinal,PersonalTraining Aula,SocioEmpresario socioEmp) {
        super(data, hora, custoFinal);
        this.Aula = Aula;
        this.socioEmp = socioEmp;
    }
}
