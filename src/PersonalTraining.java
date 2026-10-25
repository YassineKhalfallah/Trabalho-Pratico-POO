import java.util.Scanner;
/**
 * @see Atividade
 */
public class PersonalTraining extends Atividade{
    /**
     * I set tipoTraining as private because it's the last subclass
     */
    private String tipoTraining;

    /**
     * The constructor of an empty class PersonalTraining
     */
    public PersonalTraining(){};

    /**
     * The constructor of the class PersonalTraining, where we give the parameters the given values
     * @param preco
     * @param tempo
     * @param tipoTraining
     * @param date
     */
    public PersonalTraining(String tipoTraining , double preco , Hora tempo , Data date){
        super(preco , tempo , date);
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
     * in a class where we have no access to it, use this function {@link setTipoTraining}.<br>
     * Also depending on the input we are setting the cost of the session.
     * @param tipoTraining
     */
    public void setTipoTraining(String tipoTraining) {
        this.tipoTraining = tipoTraining;
        tipoTraining = tipoTraining.toUpperCase();
        if(tipoTraining.equals("INICIACAO")){
            setPreco(18.0);
        }
        if(tipoTraining.equals("INTERMEDIO")){
            setPreco(22.0);
        }
        if(tipoTraining.equals("AVANCADO")){
            setPreco(28.0);
        }
    }

    /**
     * Gets the info about the scheduled session:
     * <ul>
     *     <li>Scheduled hour : minutes</li>
     *     <li>Type of training</li>
     *     <li>Lesson price</li>
     *  </ul>
     * @return info personal training
     */
    public String toString() {
        return "Sessao de treino marcada para " + getTempo().getHoras() +
                "h e " + getTempo().getMinutos() +
                "min\nno dia " + getDate().getDia() + "/" + getDate().getMes() + "/" + getDate().getAno() +
                "\ndo tipo "+ getTipoTraining()+
                ", custa "+getPreco()+"€\n";
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
     * @param input
     * @return String sessao
     */
    public String setSessao(Scanner input){
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
        return sessao;
    }

}
