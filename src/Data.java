public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {}
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * The function makes sure that the activity date is a valid one.
     * @param date
     * @return true if the date is valid
     */
    //public boolean isDataValida(Data date){}

    /**
     * Asks the user to give the date of the activity, However it will get checked at the function {@link isDataValida},
     * if after the verification the date of the activity is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return String data
     * */
    //public String setDataDaAtividade(){}
}
