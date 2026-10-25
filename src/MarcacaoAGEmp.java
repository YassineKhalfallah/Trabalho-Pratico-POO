public class MarcacaoAGEmp extends Marcacao{
    private AulasDeGrupo aula;
    private SocioEmpresario socioEmp;
    public MarcacaoAGEmp(){}
    public MarcacaoAGEmp(Data data, Hora hora, double custo,AulasDeGrupo aula,SocioEmpresario socioEmp) {
        super(data, hora, custo);
        this.aula = aula;
        this.socioEmp = socioEmp;
    }
    public AulasDeGrupo getAula() {
        return aula;
    }
    public void setAulaG(AulasDeGrupo Aula) {
        this.aula = Aula;
    }
    public SocioEmpresario getSocioEmp() {
        return socioEmp;
    }
    public void setSocioEmp(SocioEmpresario socioEmp) {
        this.socioEmp = socioEmp;
    }
    public void setCustoFinal() {
        this.custoFinal = aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100));
    }
    public String toString(){
        return "A aula de grupo marcada tem este informacao:\n"+aula.toString()+
                "\nE tem o socio com as informcaoes seguintes:\n"+aula.toString()+
                "e o socio vai pagar no final :"+(aula.getPreco()-(aula.getPreco()*((socioEmp.getDesconto())/100)));
    }
}
