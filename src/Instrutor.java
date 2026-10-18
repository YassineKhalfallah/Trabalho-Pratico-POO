import java.util.Scanner;
import java.util.Arrays;
public class Instrutor extends Pessoa{
    private String genero;
    private String formacao[];
    public Instrutor(){};
    public Instrutor(String nome, String genero, String formacao[]){
        super(nome);
        this.genero = genero;
        this.formacao = formacao;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String[] getFormacao(){
        return formacao;
    }
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
     * @return info do instrutor
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
