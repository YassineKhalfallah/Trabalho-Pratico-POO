import  java.util.Scanner;
public class Pessoa {
    /**
     * Will I'll be using nomePessoa in other class, I'll need it to be as protected
     */
    protected String nomePessoa;
    /**
     * The constructor of an empty class Pessoa
     */
    public Pessoa(){}
    /**
     * The constructor of the class Pessoa, where we give the parameters the given values
     * @param nomePessoa
     */
    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    /**
     * Gets you a string with the name in this class
     * @return nomePessoa
     */
    public String getNomePessoa() {
        return nomePessoa;
    }
    /**
     * Once we did set the variable as protected in case of willing to change the value of this parameter
     * in a class where we have no access to it, use this function {@code setNomePessoa()}
     * @param nomePessoa
     */
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    /**
     * The function will accept the name given only if it passes the 4 verification steps:
     * <ol>
     * <li>The string is not empty neither null</li>
     * <li>The string has an acceptable length</li>
     * <li>The String doesn't have unacceptable spaces between the first and the last name</li>
     * <li>The String doesn't have unacceptable characters
     *</ol>
     * @param nome
     * @return true if all key fields match
     */
    public boolean isNomeSeguro(String nome) {
        // 1. Verificar se é nulo ou vazio
        if (nome == null || nome.trim().isEmpty()) {
            return false;
        }
        nome = nome.trim();
        // 2. Tamanho mínimo e máximo razoáveis
        if (nome.length() < 2 || nome.length() > 100) {
            return false;
        }
        // 3. Não permitir espaços consecutivos (ex: "Ana   Silva")
        if (nome.contains("  ")) {
            return false;
        }
        // 4. Validar caractere a caractere
        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);

            // Permite letras (incluindo com acentos), espaços e hífens
            boolean isAllowed = (Character.isLetter(c)||(c == ' ')||(c == '-'));
            if (!isAllowed) {
                // Rejeita o que não é letra, espaço ou hífen
                return false;
            }
        }
        return true;
    }

    /**
     * Asks the user to give his full name, However it will get checked at the function {@link isNomeSeguro},
     * if after the verification the name is valid, you will get it at the return, otherwise it will keep asking you again.
     * @return String nomePessoa
     */

    public String setNome(Scanner input) {
        boolean validarNome = true;
        String nome;
        int i = 0;
        do {
            if (i==0) System.out.println("Indica o seu nome completo: ");
            else System.out.println("--NOME INVALIDO--\nIndica o seu nome completo: ");

            nome = input.nextLine();
            validarNome = isNomeSeguro(nome);
            i++;
        }while (!validarNome);
        return nome;
    }
}
