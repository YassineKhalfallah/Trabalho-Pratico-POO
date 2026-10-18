public class Atividades {
    /**
     * Will I'll be using {@code preco} in other class, I'll need it to be as protected
     */
    protected double preco;
    /**
     * Will I'll be using {@code hora} in other class, I'll need it to be as protected
     */
    protected int hora;

    /**
     * The constructor of an empty class Atividades
     */
    public Atividades(){};

    /**
     * The constructor of the class Atividades, where we give the parameters the given values
     * @param preco
     * @param hora
     */
    public Atividades(double preco, int hora){
        this.preco = preco;
        this.hora = hora;
    }

    /**
     * Gets you the value of preco in this class
     * @return preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Once we did set the variable as protected in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setPreco(double preco)}
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    /**
     *Gets you the value of hora in this class
     * @return hora
     */
    public int getHora() {
        return hora;
    }
    /**
     * Once we did set the variable as protected in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setHora(int hora)}
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }


}
