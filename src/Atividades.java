public class Atividades {
    protected double preco;
    protected int hora;
    public Atividades(){};
    public Atividades(double preco, int hora){
        this.preco = preco;
        this.hora = hora;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

}
