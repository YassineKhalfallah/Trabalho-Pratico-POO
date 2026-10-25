public class Marcacao {
    /**
     * Will I'll be using data in other class, I'll need it to be as protected
     */
    protected Data data;

    /**
     * Will I'll be using hora in other class, I'll need it to be as protected
     */
    protected Hora hora;

    /**
     * Will I'll be using custoFinal in other class, I'll need it to be as protected
     */
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
}
