public class Marcacao {
    /**
     * I set {@code data} as private to be protected
     */
    private Data data;

    /**
     * I set {@code hora} as private to be protected
     */
    private Hora hora;

    /**
     * I set {@code custoFinal} as private to be protected
     */
    private double custoFinal;

    /**
     * I set {@code aula} as private to be protected
     */
    private Atividade atividade;

    /**
     * I set {@code socioEmp} as private to be protected
     */
    private Socio socio;

    /**
     * The constructor of an empty class Marcacao
     */
    public Marcacao() {}

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal final cost
     * @param socioEmp corporate member
     * @param aula group lesson
     */
    public Marcacao( Data data, Hora hora, double custoFinal,SocioEmpresario socioEmp, AulaDeGrupo aula) {
        this.data = data;
        this.hora = hora;
        this.custoFinal = custoFinal;
        this.socio = socioEmp;
        this.atividade = aula;
    }

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal final cost
     * @param socioInd Individual member
     * @param aula group lesson
     */
    public Marcacao(Data data, Hora hora, double custoFinal, SocioIndividual socioInd, AulaDeGrupo aula) {
        this.data = data;
        this.hora = hora;
        this.custoFinal = custoFinal;
        this.socio = socioInd;
        this.atividade = aula;
    }

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal final cost
     * @param socioEmp corporate member
     * @param sessao group lesson
     */
    public Marcacao(Data data, Hora hora, double custoFinal, SocioEmpresario socioEmp, PersonalTraining sessao) {
        this.data = data;
        this.hora = hora;
        this.custoFinal = custoFinal;
        this.socio = socioEmp;
        this.atividade = sessao;
    }

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data date
     * @param hora time
     * @param custoFinal final cost
     * @param socioInd Individual member
     * @param sessao group lesson
     */
     public Marcacao(Data data, Hora hora, double custoFinal, SocioIndividual socioInd, PersonalTraining sessao) {
        this.data = data;
        this.hora = hora;
        this.custoFinal = custoFinal;
        this.socio = socioInd;
        this.atividade = sessao;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setData}
     * @param data date
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setHora}
     * @param hora time
     */
    public void setHora(Hora hora) {
        this.hora = hora;
    }

    /**
     * Gets you the date of the day in this class
     * @return data
     */
    public Data getData() {
        return data;
    }

    /**
     * Gets you the time of the registration in this class
     * @return data
     */
    public Hora getHora() {
        return hora;
    }

    /**
     * Gets you the final price of the registration in this class
     * @return data
     */
    public double getCustoFinal() {
        return custoFinal;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setCustoFinal}
     * @param custoFinal final price
     */
    public void setCustoFinal(double custoFinal) {
        this.custoFinal = custoFinal;
    }

    public Socio getSocio() {
        return socio;
    }
    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    public Atividade getAtividade() {
        return atividade;
    }
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    /**
     *  A String representation of the member's activity booking.
     * <ul>
     *   <li>Complete details of the scheduled activity</li>
     *   <li>Member's full identification </li>
     *   <li>Final discounted price to be paid (in euros)</li>
     * </ul>
     * @return  a multi-line string with activity, member, and pricing information
     */
    @Override
    public String toString(){
        return "A atividade marcada tem este informacao:\n"+atividade.toString()+
                "E tem o socio com as informcaoes seguintes:\n"+socio.toString()+
                "\ne o socio vai pagar no final :"+(atividade.getPreco()-(atividade.getPreco()*((socio.getDesconto())/100))+"€.\n");
    }
}
