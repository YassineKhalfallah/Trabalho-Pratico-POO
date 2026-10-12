public class SocioEmpresario extends Socio{
    private String nomeEmpresa;
    private int nifEmpresa;

    public SocioEmpresario(){};
    public SocioEmpresario(String nomeEmpresa, int nifEmpresa, String nomeSocio, int numeroSocio, String emailSocio) {
        super(nomeSocio, numeroSocio, emailSocio);
        this.nomeEmpresa = nomeEmpresa;
        this.nifEmpresa = nifEmpresa;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public int getNifEmpresa() {
        return nifEmpresa;
    }
    public void setNifEmpresa(int nifEmpresa) {
        this.nifEmpresa = nifEmpresa;
    }

    public String toString(){
        return "Socio Empresario:\n Nome: "+getNomePessoa()+
                "\n Numero: "+getNumeroSocio()+
                "\n email: "+getEmailSocio()+
                "\n Empresa: "+getNomeEmpresa()+
                "\n NIF: "+getNifEmpresa();
    }
}
