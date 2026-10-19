import java.util.Scanner;

public class Atividades {
    /**
     * I'll be using {@code preco} in other class, I'll need it to be as protected
     */
    protected double preco;

    /**
     * I'll be using {@code hora} in other class, I'll need it to be as protected
     */
    protected int hora;

    /**
     * I'll be using {@code data} in other class, I'll need it to be as protected
     */
    protected String data;

    /**
     * The constructor of an empty class Atividades
     */
    public Atividades(){}

    /**
     * The constructor of the class Atividades, where we give the parameters the given values
     * @param preco
     * @param hora
     * @param data
     */
    public Atividades(double preco, int hora, String data){
        this.preco = preco;
        this.hora = hora;
        this.data = data;
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
     * in a class where we have no access to it, use this function {@link setHora}
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Gets you the value of data in this class
     * @return data
     */
    public String getData(){
        return data;
    }

    /**Once we did set the variable as protected in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setData}
     * @param data
     */
    public void setData(String data){
        this.data = data;
    }

    /**
     * The function makes sure that the activity hour is a valid one.
     * @param hora
     * @return true if the hour is valid
     */
    public boolean isHoraValida(int hora){
        if (hora < 0 || hora > 24)return false;
        return true;
    }

    /**
     * Asks the user to give the hour of the activity, However it will get checked at the function {@link isHoraValida},
     * if after the verification the hour of the activity is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return int hora
     * */
    public int setHoraDaAtividade(){
        Scanner input = new Scanner(System.in);
        boolean validarHora = true;
        int hora;
        int i = 0;
        do {
            if (i==0) System.out.println("Digite a hora que quere marcar: ");
            else System.out.println("--HORA INVALIDA--\nDigite a hora que quere marcar: ");
            hora = Integer.parseInt(input.nextLine());
            validarHora = isHoraValida(hora);
            i++;
        }while (!validarHora);
        return hora;
    }

    /**
     * The function makes sure that the activity date is a valid one.
     * @param data
     * @return true if the date is valid
     */
    public boolean isDataValida(String data){}

    /**
     * Asks the user to give the date of the activity, However it will get checked at the function {@link isDataValida},
     * if after the verification the date of the activity is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return String data
     * */
    public String setDataDaAtividade(){}
}
