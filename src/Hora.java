import java.util.Scanner;
/**
 * This class {@code Hora} represents a specific time.
 */
public class Hora {
    /**
     * I set {@code dia} as private to be protected
     */
    private int horas;

    /**
     * I set {@code dia} as private to be protected
     */
    private  int minutos;

    /**
     * The constructor of an empty class Data
     */
    public Hora(){}

    /**
     * The constructor of the class Hora, where we give the parameters the given values
     * @param horas time
     * @param minutos time
     */
    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    /**
     * Gets you the value of hour of time in this class
     * @return dia
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setHoras}
     * @param horas time
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Gets you the value of minutes of time in this class
     * @return dia
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setMinutos}
     * @param minutos time
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * The function makes sure that the activity hour is a valid one.
     * @param horas time
     * @return true if the hour is valid
     */
    public boolean isHoraValida(int horas){
        if (horas < 0 || horas > 24)return false;
        return true;
    }
    /**
     * The function makes sure that the activity minutes are valid.
     * @param minutos time
     * @return true if the minutes are valid
     */
    public boolean isMinutoValida(int minutos){
        if (minutos < 0 || minutos > 59)return false;
        return true;
    }

    /**
     * Asks the user to give the hour and minutes of the activity, However these two infos will get checked at the functions {@link isHoraValida} & {@link isMinutoValida}
     * if after the verification the hours and the minutes of the activity are valid, you will get it at the return, otherwise it will keep asking you again.
     * @param input hora
     * @return Hour tempo
     * */
    public Hora setHoraDaAtividade(Scanner input){
        boolean validarHora , validarMin ;
        Hora tempo = new Hora();
        int hora , min;
        int i = 0;
        do {
            if (i==0) System.out.println("Digite a hora que quer marcar: ");
            else System.out.println("--HORA INVALIDA--\nDigite a hora que quer marcar: ");
            hora = Integer.parseInt(input.nextLine());
            validarHora = tempo.isHoraValida(hora);
            i++;
        }while (!validarHora);
        tempo.setHoras(hora);
        i = 0;
        do {
            if (i==0) System.out.println("Digite em que minutos quer marcar: ");
            else System.out.println("--MINUTOS INVALIDOS--\nDigite em que minutos quer marcar: ");
            min = Integer.parseInt(input.nextLine());
            validarMin = tempo.isMinutoValida(min);
            i++;
        }while (!validarMin);
        tempo.setMinutos(min);
        return tempo;
    }
}
