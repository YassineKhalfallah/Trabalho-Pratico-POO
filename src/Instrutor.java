import java.util.Scanner;
import java.util.Arrays;

/**
 * @see Pessoa
 */
public class Instrutor extends Pessoa{
    /**
     * I set {@code genero} as private because it's in the last subclass
     */
    private String genero;
    /**
     * I set {@code formacao[]} as private because it's in the last subclass
     */
    private String formacao[];
    /**
     * The constructor of an empty class Instrutor
     */
    public Instrutor(){}
    /**
     * The constructor of the class Instrutor, where we give the parameters the given values
     * @param nome
     * @param genero
     * @param formacao
     */
    public Instrutor(String nome, String genero, String formacao[]){
        super(nome);
        this.genero = genero;
        this.formacao = formacao;
    }
    /**
     * Gets you the instructor gender in this class
     * @return genero
     */
    public String getGenero(){
        return genero;
    }
    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setGenero(String genero)}
     * @param genero
     */
    public void setGenero(String genero){
        this.genero = genero;
    }
    /**
     * Gets you the array of formacoes in this class
     * @return formacao
     */
    public String[] getFormacao(){
        return formacao;
    }
    /**
     * Once we did set the variable as private in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@link setFormacao}
     * @param formacao
     */
    public void setFormacao(String formacao[]){
        this.formacao = formacao;
    }
    /**
     * Gets the info about the instructor:
     * <ul>
     *  <li>Name</li>
     *  <li>Gender</li>
     *  <li>List of formacoes</li>
     * </ul>
     * @return info do Instrutor
     */
    public String toString() {
        return "Instrutor:" +
                "\nNome: " + getNomePessoa() +
                "\nGenero: " + genero +
                "\nFormacoes: " + Arrays.toString(formacao) ;
    }

    /**
     * The function makes sure that the gender of the person is not a negative number.
     * @param genero
     * @return true if the gender was M or F
     */
    public boolean isGeneroValido(String genero){
        if (genero.equals("M") || genero.equals("F") ||  genero.equals("MASCULINO") ||  genero.equals("FEMININO")) return true;
        else return false;
    }

    /**
     * Asks the user to give his gender, However it will get checked at the function {@link isGeneroValido},
     * if after the verification the gender is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return String genero
     */
    public String setSex(){
        Scanner input = new Scanner(System.in);
        boolean validarGender = true;
        String gender;
        int i = 0;
        do {
            if (i==0) System.out.println("Indica o seu genero : ");
            else System.out.println("--GENDER INVALIDO--\nIndica o seu genero : ");

            gender = input.nextLine();
            gender = gender.toUpperCase();
            validarGender = isGeneroValido(gender);
            i++;
        }while (!validarGender);
        return gender;
    }

    public Boolean equal (Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Instrutor outro = (Instrutor) obj;
        
        return java.util.Objects.equals(getNomePessoa(), outro.getNomePessoa()) && java.util.Objects.equals(genero, outro.genero) && java.util.Objects.equals(formacao, outro.formacao);
    }
    //Fazer clone??????
}
