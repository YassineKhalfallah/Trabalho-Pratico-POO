import java.util.Scanner;

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
    public Data getDate() {
        return new Data(dia, mes, ano);
    }
    public void setDate(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * The function makes sure that the activity date is a valid one.
     * @param date
     * @return true if the date is valid
     */
    public boolean isDataValida(Data date){
        if (date == null) {
            return false;
        }
        int d = this.dia;
        int m = this.mes;
        int a = this.ano;
        if ( d<1 || d>31 || m < 1 || m > 12 || a < 2025 || a>3000) {
            return false;
        }

        int maxDias;

        if (m==2){
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
                maxDias = 29;
            }
            else{
                maxDias = 28;
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxDias = 30;
        }
        else{
            maxDias = 31; 
        }
        return d>=1 && maxDias>=d;
    }

    /**
     * Asks the user to give the date of the activity, However it will get checked at the function {@link isDataValida},
     * if after the verification the date of the activity is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return String data
     * */
    public Data setDataDaAtividade(){
        Scanner input = new Scanner(System.in);
        boolean validarDate ;
        Data date = new Data();
        int i = 0;
        do {
            if (i==0) System.out.println("Digite a data na qual quer marcar atividade: ");
            else System.out.println("--DATA INVALIDA--\nDigite a data na qual quer marcar atividade: ");
            System.out.print("Digite ano: ");
            date.setAno(Integer.parseInt(input.nextLine()));
            System.out.print("Digite mes: ");
            date.setMes(Integer.parseInt(input.nextLine()));
            System.out.print("Digite dia: ");
            date.setDia(Integer.parseInt(input.nextLine()));
            validarDate = date.isDataValida(date);
            i++;
        }while (!validarDate);
        input.close();
        return date;
    }
}
