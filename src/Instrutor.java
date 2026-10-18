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
    public String toString() {
        return "Instrutor{nome='" + getNomePessoa() + "', género=" + genero + ", formação=" + formacao + "}";
    }
    public Boolean equal (Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Instrutor outro = (Instrutor) obj;
        
        return java.util.Objects.equals(getNomePessoa(), outro.getNomePessoa()) && java.util.Objects.equals(genero, outro.genero) && java.util.Objects.equals(formacao, outro.formacao);
    }
    //Fazer clone??????
}
