import java.util.Scanner;
/**
 * @see Socio
 */
public class SociosIndividuais extends Socio {
    /**
     * I set {@code idadeSocio} as private because it's in the last subclass
     */
    private int idadeSocio ;
    /**
     * The constructor of an empty class SociosIndividuais
     */
    public SociosIndividuais(){}
    /**
     * The constructor of the class SociosIndividuais, where we give the parameters the given values
     * @param idadeSocio
     * @param nomeSocio
     * @param numeroSocio
     * @param emailSocio
     * @param desconto
     */
    public SociosIndividuais(int idadeSocio,String nomeSocio, int numeroSocio, String emailSocio,double desconto){
        super(nomeSocio, numeroSocio, emailSocio,desconto);
        this.idadeSocio = idadeSocio;
    }
    /**
     * Gets you the value of age in this class
     * @return preco
     */
    public int getIdadeSocio() {
        return idadeSocio;
    }

    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setIdadeSocio(int idadeSocio)}
     * @param idadeSocio
     */
    public void setIdadeSocio(int idadeSocio) {
        this.idadeSocio = idadeSocio;
    }

    /**
     * Gets the info about the instructor:
     * <ul>
     *     <li>Name</li>
     *     <li>Identification Number</li>
     *     <li>Email</li>
     *     <li>Age</li>
     *     <li>Discount</li>
     *     <li>Money spent</li>
     * </ul>
     * @return info do Socio Individual
     */
    public String toString() {
        return "Socio Individual:\n Nome: "+getNomePessoa()+
                "\n Numero: "+getNumeroSocio()+
                "\n email: "+getEmailSocio()+
                "\n Idade: "+getIdadeSocio()+
                "\n Desconto: "+getDesconto()+"%"+
                "\n Despesas: "+getDespesas();
    }

    /**
     * The function makes sure that the age of the person is not a negative number.
     * @param idade
     * @return true if the age is positive
     */
    public boolean isIdadeNaoNega(int idade){
        if ((idade<14) || (idade>130)) return false;
        else return true;
    }

    /**
     * Asks the user to give his age, However it will get checked at the function {@link isIdadeNaoNega},
     * if after the verification the age is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return int idadeSocio
     */
    public int setIdade(){
        Scanner input = new Scanner(System.in);
        boolean validarIdade = true;
        int idade;
        int i = 0;
        do {
            if (i==0) System.out.println("Digite a sua idade: ");
            else System.out.println("--IDADE INVALIDO--\nDigite a sua idade: ");
            idade = Integer.parseInt(input.nextLine());
            validarIdade = isIdadeNaoNega(idade);
            i++;
        }while (!validarIdade);
        input.close();
        return idade;
    }
}
