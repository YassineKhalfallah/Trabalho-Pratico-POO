import java.util.Scanner;

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

    /**
     * The function makes sure that the age of the person is not a negative number.
     * @param idade
     * @return true if the age is positive
     */
    public boolean isIdadeNaoNega(int idade){
        if (idade<0) return false;
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
        return 0;
    }
}
