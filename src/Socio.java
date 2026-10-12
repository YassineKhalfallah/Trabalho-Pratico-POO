
public class Socio extends Pessoa {
    protected int numeroSocio;
    protected String emailSocio;

    public Socio(){};
    public Socio(String nomePessoa, int numeroSocio, String emailSocio) {
        super(nomePessoa);
        this.numeroSocio = numeroSocio;
        this.emailSocio = emailSocio;
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
}
