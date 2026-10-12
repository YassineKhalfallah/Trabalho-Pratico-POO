public class SociosIndividuais extends Socio {
    private int idadeSocio ;
    public SociosIndividuais(){};
    public SociosIndividuais(int idadeSocio,String nomeSocio, int numeroSocio, String emailSocio,double desconto){
        super(nomeSocio, numeroSocio, emailSocio,desconto);
        this.idadeSocio = idadeSocio;
    }
    public int getIdadeSocio() {
        return idadeSocio;
    }
    public void setIdadeSocio(int idadeSocio) {
        this.idadeSocio = idadeSocio;
    }
    public String toString() {
        return "Socio Individual:\n Nome: "+getNomePessoa()+
                "\n Numero: "+getNumeroSocio()+
                "\n email: "+getEmailSocio()+
                "\n Idade: "+getIdadeSocio()+
                "\n Desconto: "+getDesconto()+"%"+
                "\n Despesas: "+getDespesas();
    }
}
