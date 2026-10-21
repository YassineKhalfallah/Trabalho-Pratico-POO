import java.util.Scanner;
/**
 * This class {@code Data} represents a specific date in the year with day, month and year precision.
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

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
     * @param dia
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
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Gets you the value of year of date in this class
     * @return ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setAno}
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }


    /**
     * The function makes sure that the activity date is a valid one.
     *
     * @param date
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
     * @param  input
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
        input.close();
        return date;
    }

    /**
     * This class {@code Hora} represents a specific time of day with hour and minute precision.
     */
    public class Hora {
        private int horas;
        private int minutos;

        public Hora() {
        }
        public Hora(int horas, int minutos) {
            this.horas = horas;
            this.minutos = minutos;
        }

        /**
         * Gets you the value of hours of the time in this class
         * @return horas
         */
        public int getHoras() {
            return horas;
        }

        /**
         * Once we did set the variable as private, in case of willing to change the value of this paramater
         *in a class where we have no access to it, use this function {@link horas}.
         *@param horas
         */
        public void setHoras(int horas) {
            this.horas = horas;
        }


        /**
         * Gets you the value of minutes of the time in this class
         * @return minutos
         */
        public int getMinutos() {
            return minutos;
        }

        /**
         * Once we did set the variable as private, in case of willing to change the value of this paramater
         *in a class where we have no access to it, use this function {@link minutos}.
         *@param minutos
         */
        public void setMinutos(int minutos) {
            this.minutos = minutos;
        }

        /**
         * The function makes sure that the activity hour is a valid one.
         *
         * @param horas
         * @return true if the hour is valid
         */
        public boolean isHoraValida(int horas) {
            if (horas < 0 || horas > 24) return false;
            return true;
        }

        /**
         * The function makes sure that the activity minutes are valid.
         *
         * @param minutos
         * @return true if the minutes are valid
         */
        public boolean isMinutoValida(int minutos) {
            if (minutos < 0 || minutos > 59) return false;
            return true;
        }

        /**
         * Asks the user to give the hour and minutes of the activity, However these two infos will get checked at the functions {@link isHoraValida} & {@link isMinutoValida}
         * if after the verification the hours and the minutes of the activity are valid, you will get it at the return, otherwise it will keep asking you again.
         *
         * @return Hour tempo
         *
         */
        public Hora setHoraDaAtividade(Scanner input) {
            boolean validarHora, validarMin;
            Hora tempo = new Hora();
            int hora, min;
            int i = 0;
            do {
                if (i == 0) System.out.println("Digite a hora que quer marcar: ");
                else System.out.println("--HORA INVALIDA--\nDigite a hora que quer marcar: ");
                hora = Integer.parseInt(input.nextLine());
                validarHora = tempo.isHoraValida(hora);
                i++;
            } while (!validarHora);
            tempo.setHoras(hora);
            i = 0;
            do {
                if (i == 0) System.out.println("Digite em que minutos quer marcar: ");
                else System.out.println("--MINUTOS INVALIDOS--\nDigite em que minutos quer marcar: ");
                min = Integer.parseInt(input.nextLine());
                validarMin = tempo.isMinutoValida(min);
                i++;
            } while (!validarMin);
            tempo.setMinutos(min);
            input.close();
            return tempo;
        }
    }
}