public class Marcacao {
    protected Data data;
    protected Hora hora;
    protected double custoFinal;
    /**
     * The constructor of an empty class AulasDeGrupo
     */
    public Marcacao() {}
    public Marcacao( Data data, Hora hora, double custoFinal) {
        this.data = data;
        this.hora = hora;
        this.custoFinal = custoFinal;
    }
}
