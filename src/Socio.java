
public class Socio {
    protected String nomeSocio;
    protected int numeroSocio;
    protected String emailSocio;

    public Socio(){};
    public Socio(String nomeSocio, int numeroSocio, String emailSocio) {
        this.nomeSocio = nomeSocio;
        this.numeroSocio = numeroSocio;
        this.emailSocio = emailSocio;
    }
    public String getNomeSocio() {
        return nomeSocio;
    }
    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
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
