import java.util.Locale;
import java.util.Scanner;

/**
 * @see Atividades
 */
public class AulasDeGrupo extends Atividades{
    /**
     * I set {@code tipoAula} as private because it's in the last subclass
     */
    private String tipoAula;
    /**
     * I set {@code capacidadeMaxima} as private because it's in the last subclass
     */
    private int capacidadeMaxima;
    /**
     * I set {@code numeroDePessoasNaAtividade} as private because it's in the last subclass
     */
    private int numeroDePessoasNaAtividade;
    /**
     * The constructor of an empty class AulasDeGrupo
     */
    public AulasDeGrupo(){};
    /**
     * The constructor of the class AulasDeGrupo, where we set the given values to each parameter
     * @param tipoAula
     * @param preco
     * @param hora
     * @param capacidadeMaxima
     */
    public AulasDeGrupo(String tipoAula,String data, double preco, int hora, int capacidadeMaxima) {
        super(preco, hora,data);
        this.tipoAula = tipoAula;
        this.capacidadeMaxima = capacidadeMaxima;
        this.numeroDePessoasNaAtividade = 0;
    }
    /**
     * Gets you the type of the group lesson in this class
     * @return tipoAula
     */
    public String getTipoAula() {
        return tipoAula;
    }

    /**
     *
     * @param tipoAula
     */
    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
        if(tipoAula.equals("Yoga")){
            setPreco(8.0);
        }
        if(tipoAula.equals("Spining")){
            setPreco(9.0);
        }
        if(tipoAula.equals("Zumba")){
            setPreco(8.5);
        }
        if (tipoAula.equals("CrossFit")){
            setPreco(12.0);
        }
    }
    /**
     * Gets you the maximum capacity of the group lesson in this class
     * @return capacidadeMaxima
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    /**
     * Gets you the number of people in the group lesson in this class
     * @return numeroDePessoasNaAtividade
     */
    public int getNumeroDePessoasNaAtividade() {
        return numeroDePessoasNaAtividade;
    }
    public void setNumeroDePessoasNaAtividade(int numeroDePessoasNaAtividade) {
        this.numeroDePessoasNaAtividade = numeroDePessoasNaAtividade;
    }
    /**
     * Gets the info about the scheduled group lesson:
     * <ul>
     *     <li>Scheduled hour</li>
     *     <li>Type of lesson</li>
     *     <li>Lesson price</li>
     *     <li>Number of people registered </li>
     *     <li>Maximum number for participants</li>
     * </ul>
     * @return info group lesson
     */
    public String toString() {
<<<<<<< HEAD
        return "Aula de grupo marcada para " +this.hora + "h do tipo "+ getTipoAula()+ ", custa "+getPreco()+
                "€ faltam "+getnumeroDePessoasNaAtividade()+ "pessoas para chegar ao limite de"+getCapacidadeMaxima()+"pessoas";
=======
        return "Aula de grupo marcada para " +this.hora + "h do tipo "+ geTipoAula()+
                ", custa "+getPreco()+
                " faltam "+getnumeroDePessoasNaAtividade()+
                "para chegar ao "+getCapacidadeMaxima();
>>>>>>> b6efd4df11cfef452c0156fd60a0b7e3b69dfd4d
    }

    /**
     * The function makes sure that the type lesson is one of the activities that they have in the gym.
     * @param tipoAula
     * @return true if type of lesson is one of the activities in the array
     */
    public boolean isTipoaulaValido(String tipoAula) {
        String aulasdesponiveis[]={"YOGA","SPINNING","ZUMBA","CROSSFIT"};
        tipoAula = tipoAula.trim().toUpperCase();

        for (int i = 0; i < aulasdesponiveis.length; i++) {
            if (aulasdesponiveis[i].equals(tipoAula)) {
                return true;
            }
        }
        return false;
    }
/**
 * Asks the user to give the type of lesson, However it will get checked at the function {@link isTipoaulaValido},
 * if after the verification the type of lesson is valid, you will get it at the return, otherwise it will keep asking you again.
 * @return String aula
 * */
    public String setAula(){
        Scanner input = new Scanner(System.in);
        boolean validarAula = true;
        String aula = null;
        int i = 0;
        do {
            if (i==0) System.out.println("Indica o tipo de aula que quere marcar: ");
            else System.out.println("--NOME INVALIDO--\nIndica o tipo de aula que quere marcar: ");

            aula = input.nextLine();
            validarAula = isTipoaulaValido(aula);
            i++;
        }while (!validarAula);
        input.close();
        return aula;
    }

    /**
     * The function makes sure that the maximum capacity of the lesson is not a negative number.
     * @param capacidade
     * @return true maximum capacity of the lesson is positive
     */
    public boolean isCapacidadeValida(int capacidade){
        if (capacidade<0)return false;
        return true;
    }

    /**
     * Asks the user to give maximum capacity of the lesson, However it will get checked at the function {@link isCapacidadeValida},
     * if after the verification the maximum capacity is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return
     */
    public int setCapDaAula(){
        Scanner input = new Scanner(System.in);
        boolean validarCap = true;
        int capacidade;
        int i = 0;
        do {
            if (i==0) System.out.println("Digite a capacidade maxima da aula: ");
            else System.out.println("--CAPACIDADE INVALIDO--\nDigite a capacidade maxima da aula: ");
            capacidade = Integer.parseInt(input.nextLine());
            validarCap = isCapacidadeValida(capacidade);
            i++;
        }while (!validarCap);
        input.close();
        return capacidade;
    }

}
