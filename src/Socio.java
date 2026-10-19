import java.security.SecureRandom;
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
    public void setDesconto(int desconto) {
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
    public static String gerarNumSocio() {
        SecureRandom random = new SecureRandom();
        // Gera um número aleatório entre 0 e 999999
        int numero = random.nextInt(1000000); 

        // Formata para 6 dígitos
        return String.format("%06d", numero);
    }
}