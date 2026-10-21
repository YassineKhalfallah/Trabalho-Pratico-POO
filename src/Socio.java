import java.security.SecureRandom;
import java.util.ArrayList;

public class Socio extends Pessoa {
    protected int numeroSocio;
    protected String emailSocio;
    protected double despesas;
    protected double desconto;

    public Socio(){};
    public Socio(String nome, int numeroSocio, String emailSocio, double desconto) {
        super(nome);
        this.numeroSocio = numeroSocio;
        this.emailSocio = emailSocio;
        this.despesas = 0;
        this.desconto = desconto;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }
    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
    public String getEmailSocio() {
        return emailSocio;
    }
    public void setEmailSocio(String emailSocio) {
        this.emailSocio = emailSocio;
    }
    public double getDespesas() {
        return despesas;
    }
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public Boolean equal (Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Socio outro = (Socio) obj;
        
        return java.util.Objects.equals(getNumeroSocio(), outro.getNumeroSocio()) && java.util.Objects.equals(getEmailSocio(), outro.getEmailSocio()) && java.util.Objects.equals(getDespesas(), outro.getDespesas()) && java.util.Objects.equals(getDesconto(), outro.getDesconto());
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
     * @param tipoSocio
     * @param numeroSocio
     * @param listaEmp
     * @param listaInd
     * @return true if the number already exists in the list
     */
    public boolean doesItExisteInList (String tipoSocio,int numeroSocio,ArrayList<SocioEmpresario> listaEmp,ArrayList<SocioIndividual> listaInd){
        if(tipoSocio.equals("EMPRESA")){
            for (SocioEmpresario socioEmpresario : listaEmp) {
                if (socioEmpresario.getNumeroSocio() ==numeroSocio) {
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