/**
 * @see Hora
 * @see Data
 */
public class Atividade {
    /**
     * I'll be using {@code preco} in other class, I'll need it to be as protected
     */
    protected double preco;

    /**
     * I'll be using {@code hora} in other class, I'll need it to be as protected
     */
    protected Hora tempo;

    /**
     * I'll be using {@code data} in other class, I'll need it to be as protected
     */
    protected Data date;

    /**
     * The constructor of an empty class Atividades
     */
    public Atividade(){}

    /**
     * The constructor of the class Atividades, where we give the parameters the given values
     * @param preco price
     * @param tempo time
     * @param date date
     */
    public Atividade(double preco, Hora tempo, Data date){
        this.preco = preco;
        this.tempo = tempo;
        this.date = date;
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
     * in a class where we have no access to it, use this function {@link setPreco}
     * @param preco price
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *Gets you the value of hora in this class
     * @return tempo
     */
    public Hora getTempo() {
        return tempo;
    }

    /**
     * Once we did set the variable as protected in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setTempo}
     * @param tempo time
     */
    public void setTempo(Hora tempo) {
        this.tempo = tempo;
    }

    /**
     * Gets you the value of data in this class
     * @return data
     */
    public Data getDate(){
        return date;
    }

    /**Once we did set the variable as protected in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setDate}
     * @param date date
     */
    public void setDate(Data date){
        this.date = date;
    }

}
