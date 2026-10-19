import java.util.Scanner;

/**
 * @see Atividades
 */
public class PersonalTraining extends Atividades{
    /**
     * I set tipoTraining as private because it's the last subclass
     */
    private String tipoTraining;
    /**
     * The constructor of an empty class PersonalTraining
     */
    public PersonalTraining(){};
    /**
     * The constructor of the class PersonalTraining, where we give the paramaters the given values
     * @param preco
     * @param hora
     * @param tipoTraining
     */
    public PersonalTraining(String tipoTraining,double preco, int hora, String data){
        super(preco,hora,data);
        this.tipoTraining = tipoTraining;
    }

    /**
     * Gets you the type of the session in this class
     * @return tipoTraining
     */
    public String getTipoTraining() {
        return tipoTraining;
    }

    /**
     * Once we did set the variable as private, in case of willing to change the value of this paramater
     * in a class where we have no access to it, use this function {@code setTipoTraining()}.
     * Also depending on the input we are setting the cost of the session.
     * @param tipoTraining
     */
    public void setTipoTraining(String tipoTraining) {
        this.tipoTraining = tipoTraining;
        if(tipoTraining.equals("Iniciacao")){
            setPreco(18.0);
        }
        if(tipoTraining.equals("Intermédio")){
            setPreco(22.0);
        }
        if(tipoTraining.equals("Avançado")){
            setPreco(28.0);
        }
    }

    /**
     * Gets the info about the scheduled session:
     * <ul>
     *     <li>Scheduled hour</li>
     *     <li>Type of training</li>
     *     <li>Lesson price</li>
     *  </ul>
     * @return info personal training
     */
    public String toString() {
        return "Sessao de treino marcada para " +this.hora + "h do tipo "+ getTipoTraining()+ ", custa "+getPreco()+"€";
    }
    /**
     * The function makes sure that the type session is one of the activities that they have in the gym.
     * @param tipoSessao
     * @return true if type of session is one of the activities in the array
     */
    public boolean isTipoSessaoValido(String tipoSessao) {
        String aulasdesponiveis[]={"INICIACAO","INTERMEDIO","AVANCADO"};
        tipoSessao = tipoSessao.trim().toUpperCase();

        for (int i = 0; i < aulasdesponiveis.length; i++) {
            if (aulasdesponiveis[i].equals(tipoSessao)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Asks the user to give the type of session, However it will get checked at the function {@link isTipoSessaoValido},
     * if after the verification the type of session is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return String sessao
     * */
    public String setSessao(){
        Scanner input = new Scanner(System.in);
        boolean validarSessao = true;
        String sessao = null;
        int i = 0;
        do {
            if (i==0) System.out.println("Indica o tipo de sessao quere marcar: ");
            else System.out.println("--SESSAO INVALIDO--\nIndica o tipo de sessao quere marcar: ");

            sessao = input.nextLine();
            validarSessao = isTipoSessaoValido(sessao);
            i++;
        }while (!validarSessao);
        input.close();
        return sessao;
    }

}
