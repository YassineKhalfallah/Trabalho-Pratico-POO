public class Marcacao {
    protected Data data;
    protected Hora hora;
    protected double custo;
    /**
     * The constructor of an empty class AulasDeGrupo
     */
    public Marcacao() {}
    public Marcacao( Data data, Hora hora, double custo) {
        this.data = data;
        this.hora = hora;
        this.custo = custo;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public void setHora(Hora hora) {
        this.hora = hora;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public Data getData() {
        return data;
    }
    public Hora getHora() {
        return hora;
    }
    public double getCusto() {
        return custo;
    }
}
