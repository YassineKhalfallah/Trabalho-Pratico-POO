
public class Socio extends Pessoa {
    protected int numeroSocio;
    protected String emailSocio;
    protected double despesas;
    protected double desconto;

    public Socio(){};
    public Socio(String nomePessoa, int numeroSocio, String emailSocio, double desconto) {
        super(nomePessoa);
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
}
