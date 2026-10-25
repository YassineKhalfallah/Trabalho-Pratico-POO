import java.util.Scanner;
/**
 * This class {@code Data} represents a specific date in the year with day, month and year precision.
 */
public class Data {
    /**
     * I set {@code dia} as private to be protected
     */
    private int dia;

    /**
     * I set {@code mes} as private to be protected
     */
    private int mes;

    /**
     * I set {@code ano} as private to be protected
     */
    private int ano;

    /**
     * The constructor of an empty class Data
     */
    public Data() {}

    /**
     * The constructor of the class Data, where we give the parameters the given values
     * @param dia day
     * @param mes month
     * @param ano year
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Gets you the value of day of date in this class
     * @return dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setDia}
     * @param dia day
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Gets you the value of month of date in this class
     * @return mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setMes}
     * @param mes month
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Gets you the value of year of date in this class
     *
     * @return ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setAno}
     *
     * @param ano year
     */
    public void setAno(int ano) {
        this.ano = ano;
    }


    /**
     * The function makes sure that the activity date is a valid one.
     *
     * @param date date
     * @return true if the date is valid
     */
    public boolean isDataValida(Data date) {
        if (date == null) {
            return false;
        }
        int d = this.dia;
        int m = this.mes;
        int a = this.ano;
        if (d < 1 || d > 31 || m < 1 || m > 12 || a < 2025 || a > 3000) {
            return false;
        }

        int maxDias;

        if (m == 2) {
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                maxDias = 29;
            } else {
                maxDias = 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxDias = 30;
        } else {
            maxDias = 31;
        }
        return d >= 1 && maxDias >= d;
    }

    /**
     * Asks the user to give the date of the activity, However it will get checked at the function {@link isDataValida},
     * if after the verification the date of the activity is valid, you will get it at the return, otherwise it will keep asking you again.
     *
     * @param input scanner name
     * @return String data
     *
     */
    public Data setDataDaAtividade(Scanner input) {
        boolean validarDate;
        Data date = new Data();
        int i = 0;
        do {
            if (i == 0) System.out.println("Digite a data na qual quer marcar atividade: ");
            else System.out.println("--DATA INVALIDA--\nDigite a data na qual quer marcar atividade: ");
            System.out.print("Digite ano: ");
            date.setAno(Integer.parseInt(input.nextLine()));
            System.out.print("Digite mes: ");
            date.setMes(Integer.parseInt(input.nextLine()));
            System.out.print("Digite dia: ");
            date.setDia(Integer.parseInt(input.nextLine()));
            validarDate = date.isDataValida(date);
            i++;
        } while (!validarDate);
        return date;
    }
}