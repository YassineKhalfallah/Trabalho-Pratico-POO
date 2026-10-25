public class MarcacaoPTEmp extends Marcacao {
    private PersonalTraining aula;
    private SocioEmpresario socioEmp;
    public MarcacaoPTEmp(){}
    public MarcacaoPTEmp(Data data, Hora hora, double custo,PersonalTraining aula,SocioEmpresario socioEmp) {
        super(data, hora, custo);
        this.aula = aula;
        this.socioEmp = socioEmp;
    }
    public PersonalTraining getAula() {
        return aula;
    }
    public void setSessaoP(PersonalTraining aula) {
        this.aula = aula;
    }
    public SocioEmpresario getSocioInd() {
        return socioEmp;
    }
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }
    public String toString(){
        return "A seesao PT marcada tem este informacao:\n"+aula.toString()+
                "\nE tem o socio com as informcaoes seguintes:\n"+socioEmp.toString()+
                "e o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100)));
    }
}
