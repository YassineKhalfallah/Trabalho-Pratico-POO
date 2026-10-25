import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * @see Pessoa
 */
public class Socio extends Pessoa {
    /**
     * Will I'll be using numeroSocio in other class, I'll need it to be as protected
     */
    protected int numeroSocio;
    /**
     * Will I'll be using emailSocio in other class, I'll need it to be as protected
     */
    protected String emailSocio;
    /**
     * Will I'll be using despesas in other class, I'll need it to be as protected
     */
    protected double despesas;
    /**
     * Will I'll be using desconto in other class, I'll need it to be as protected
     */
    protected double desconto;
    /**
     * The constructor of an empty class Socio
     */
    public Socio(){};

    /**
     * The constructor of the class Socio, where we give the parameters the given values
     * @param nome name
     * @param numeroSocio Id number of member
     * @param emailSocio email of member
     * @param desconto discount
     */
    public Socio(String nome, int numeroSocio, String emailSocio, double desconto) {
        super(nome);
        this.numeroSocio = numeroSocio;
        this.emailSocio = emailSocio;
        this.despesas = 0;
        this.desconto = desconto;
    }

    /**
     * Gets you the number of the member in this class
     * @return numeroSocio
     */
    public int getNumeroSocio() {
        return numeroSocio;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setNumeroSocio}
     * @param numeroSocio member Id number
     */
    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    /**
     * Gets you the email of the member in this class
     * @return emailSocio
     */
    public String getEmailSocio() {
        return emailSocio;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setEmailSocio}
     * @param emailSocio member email
     */
    public void setEmailSocio(String emailSocio) {
        this.emailSocio = emailSocio;
    }

    /**
     * Gets you how much member spent in this class
     * @return despesas
     */
    public double getDespesas() {
        return despesas;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setDespesas}
     * @param despesas discount
     */
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    /**
     * Gets you the discount of the member in this class
     * @return desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * Once we did set the variable as protected, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setDesconto}
     * @param desconto discount
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * the function generates a random 6 digit number with a secure method:
     * <ol>
     * <li>Constructs a secure random number generator</li>
     * <li>Generates a number from 0 to 999999</li>
     * <li>formats the number to always have 6 digits (ex: 0 becomes 000000)</li>
     * </ol>
     * @return random 6 digit number
     */
    public int gerarNumSocio() {
        SecureRandom random = new SecureRandom();
        // Gera um número aleatório entre 0 e 999999
        int numero = random.nextInt(100000,1000000);

        // Formata para 6 dígitos
        return numero;
    }

    /**
     *This func will be used to check if the randomly generated number exists in the list of the specified type of member.
     * @param tipoSocio Type of member
     * @param numeroSocio Id number of member
     * @param listaEmp list of Corporate Members
     * @param listaInd list of Individual Members
     * @return true if the number already exists in the list
     */
    public boolean doesItExisteInList (String tipoSocio,int numeroSocio,ArrayList<SocioEmpresario> listaEmp,ArrayList<SocioIndividual> listaInd){
        if(tipoSocio.equals("EMPRESA")){
            for (SocioEmpresario socioEmpresario : listaEmp) {
                if (socioEmpresario.getNumeroSocio() == numeroSocio) {
                    return true;
                }
            }
            return false;
        }
        else if(tipoSocio.equals("INDIVIDUAL")){
            for (SocioIndividual socioIndividual : listaInd) {
                if (socioIndividual.getNumeroSocio() ==numeroSocio) {
                    return true;
                }
            }
            return false;
        }
        else return false;
    }
}