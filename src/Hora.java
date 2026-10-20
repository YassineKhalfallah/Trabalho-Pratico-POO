import java.util.Scanner;

public class Hora {
    private int horas;
    private  int minutos;
    public Hora(){}
    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * The function makes sure that the activity hour is a valid one.
     * @param horas
     * @return true if the hour is valid
     */
    public boolean isHoraValida(int horas){
        if (horas < 0 || horas > 24)return false;
        return true;
    }
    /**
     * The function makes sure that the activity minutes are valid.
     * @param minutos
     * @return true if the minutes are valid
     */
    public boolean isMinutoValida(int minutos){
        if (minutos < 0 || minutos > 59)return false;
        return true;
    }

    /**
     * Asks the user to give the hour and minutes of the activity, However these two infos will get checked at the functions {@link isHoraValida} & {@link isMinutoValida}
     * if after the verification the hours and the minutes of the activity are valid, you will get it at the return, otherwise it will keep asking you again.
     * @return Hour tempo
     * */
    public Hora setHoraDaAtividade(){
        Scanner input = new Scanner(System.in);
        boolean validarHora , validarMin ;
        Hora tempo = new Hora();
        int hora , min;
        int i = 0;
        do {
            if (i==0) System.out.println("Digite a hora que quere marcar: ");
            else System.out.println("--HORA INVALIDA--\nDigite a hora que quere marcar: ");
            hora = Integer.parseInt(input.nextLine());
            validarHora = tempo.isHoraValida(hora);
            i++;
        }while (!validarHora);
        tempo.setHoras(hora);
        i = 0;
        do {
            if (i==0) System.out.println("Digite em que minutos quere marcar: ");
            else System.out.println("--MINUTOS INVALIDOS--\nDigite em que minutos quere marcar: ");
            min = Integer.parseInt(input.nextLine());
            validarMin = tempo.isMinutoValida(min);
            i++;
        }while (!validarMin);
        tempo.setMinutos(min);
        input.close();
        return tempo;
    }
}
