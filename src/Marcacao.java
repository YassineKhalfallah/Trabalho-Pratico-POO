public class Marcacao {
    protected Data data;
    protected Hora hora;
    protected double custoFinal;
    /**
     * The constructor of an empty class Marcacao
     */
    public Marcacao() {}

    /**
     * The constructor of the class Marcacao, where we set the given values to each parameter
     * @param data
     * @param hora
     * @param custoFinal
     */
    public Marcacao( Data data, Hora hora, double custoFinal) {
        this.data = data;
        this.hora = hora;
        this.custoFinal = custoFinal;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public void setHora(Hora hora) {
        this.hora = hora;
    }
    public void setCusto(double custoFinal) {
        this.custoFinal = custoFinal;
    }
    public Data getData() {
        return data;
    }
    public Hora getHora() {
        return hora;
    }
    public double getCustoFinal() {
        return custoFinal;
    }
}
