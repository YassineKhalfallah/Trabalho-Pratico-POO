public class Pessoa {
    protected String nomePessoa;
    public Pessoa(){}
    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public static boolean isNomeSeguro(String nome) {
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
}
