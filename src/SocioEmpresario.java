/**
 * @see Socio
 */
public class SocioEmpresario extends Socio{
    /**
     * I set {@code nomeEmpresa} as private because it's in the last subclass
     */
    private String nomeEmpresa;
    /**
     * I set {@code nifEmpresa} as private because it's in the last subclass
     */
    private int nifEmpresa;
    /**
     * The constructor of an empty class SocioEmpresario
     */
    public SocioEmpresario(){}
    /**
     * The constructor of the class SocioEmpresario, where we give the parameters the given values
     * @param nomeEmpresa
     * @param nifEmpresa
     * @param nomeSocio
     * @param numeroSocio
     * @param emailSocio
     */
    public SocioEmpresario(String nomeEmpresa, int nifEmpresa, String nomeSocio, int numeroSocio, String emailSocio) {
        super(nomeSocio, numeroSocio, emailSocio,20);
        this.nomeEmpresa = nomeEmpresa;
        this.nifEmpresa = nifEmpresa;
    }
    /**
     * Gets you the name of the company in this class
     * @return nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setNomeEmpresa(String nomeEmpresa)}
     * @param nomeEmpresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    /**
     * Gets you the NIF of the company in this class
     * @return nifEmpresa
     */
    public int getNifEmpresa() {
        return nifEmpresa;
    }
    /**
     * Once we did set the variable as private, in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setNifEmpresa(int nifEmpresa)}
     * @param nifEmpresa
     */
    public void setNifEmpresa(int nifEmpresa) {
        this.nifEmpresa = nifEmpresa;
    }
    /**
     * Gets the info about the instructor:
     * <ul>
     *     <li>Name</li>
     *     <li>Identification Number</li>
     *     <li>Email</li>
     *     <li>Name of Company</li>
     *     <li>Company's NIF number</li>
     *     <li>Discount</li>
     *     <li>Money spent</li>
     * </ul>
     * @return info do Socio Empresario
     */
    public String toString(){
        return "Socio Empresario:\n Nome: "+getNomePessoa()+
                "\n Numero: "+getNumeroSocio()+
                "\n email: "+getEmailSocio()+
                "\n Empresa: "+getNomeEmpresa()+
                "\n NIF: "+getNifEmpresa()+
                "\n Desconto: "+getDesconto()+"%"+
                "\n Despesas: "+getDespesas();
    }

    /**
     *
     * @return true in case companies contains
     */
    public boolean isNIFValido() {
        if (nifEmpresa > 100000000 || nifEmpresa < 999999999) {
            System.out.println("NIF Valido");
            return true;
        } else {
            System.out.println("NIF Invalido, digite outra vez o NIF da sua empresa");
            return false;
        }
    }
}
