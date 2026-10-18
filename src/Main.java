import  java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Instrutor> instrutores = new ArrayList<>();
        ArrayList<SociosIndividuais> sociosIndividuais = new ArrayList<>();
        ArrayList<SocioEmpresario> socioEmpresario = new ArrayList<>();
        addPessoa(instrutores,sociosIndividuais,socioEmpresario);
    }


    public static void addPessoa(ArrayList<Instrutor> instrutores, ArrayList<SociosIndividuais> sociosIndividuais, ArrayList<SocioEmpresario> socioEmpresario){
        String tipoSocio, tipoPessoa;
        boolean valid = true;
        Scanner input = new Scanner(System.in);
        while (valid) {
            System.out.println("---Indica se es um Socio ou Instrutor---");
            tipoPessoa = input.nextLine();
            tipoPessoa = tipoPessoa.toUpperCase();
            if (tipoPessoa.equals("SOCIO")) {
                System.out.println("--Indica se es um Socio Individual ou Empresarial--");
                tipoSocio = input.nextLine();
                tipoSocio = tipoSocio.toUpperCase();
                if (tipoSocio.equals("INDIVIDUAL")) {
                    SociosIndividuais socioInd = new SociosIndividuais();
                    // verificacoes que o input do nome seja aceitavel (Mudar para 1º e 2º nome)
                    System.out.println("Indica o seu nome:");
                    socioInd.setNomePessoa(input.nextLine());
                    //verificar que a idade seja nos limite legais
                    System.out.println("Digite a sua idade :");
                    socioInd.setIdadeSocio(Integer.parseInt(input.nextLine()));
                    //vamos ser nos a atribuir o numero indentificador ???
                    System.out.println("Digite o seu numero identificador:");
                    socioInd.setNumeroSocio(Integer.parseInt(input.nextLine()));

                    System.out.println("Indica o seu email:");
                    socioInd.setEmailSocio(input.nextLine());

                    if (socioInd.getIdadeSocio() < 18) {
                        socioInd.setDesconto(10);
                    } else if (socioInd.getIdadeSocio() >= 65) {
                        socioInd.setDesconto(15);
                    }
                    // add the socio individual na lista
                    sociosIndividuais .add(socioInd);
                    // Going to get you the info about Socio Individual
                    System.out.println(socioInd.toString());
                    valid = false;
                } else if (tipoSocio.equals("EMPRESA")) {
                    SocioEmpresario socioEmp = new SocioEmpresario();
                    System.out.println("Indica o seu nome: ");
                    socioEmp.setNomePessoa(input.nextLine());
                    System.out.println("Indica o seu email:");
                    socioEmp.setEmailSocio(input.nextLine());
                    System.out.println("Indica o nome da sua empresa: ");
                    socioEmp.setNomeEmpresa(input.nextLine());
                    System.out.println("Digite o NIF da sua  empresa: ");
                    socioEmp.setNifEmpresa(input.nextInt());
                    System.out.println("Digite o seu numero identificador: ");
                    socioEmp.setNumeroSocio(input.nextInt());
                    // add the socio individual na lista
                    socioEmpresario .add(socioEmp);
                    // Going to get you the info about Socio da Empresa
                    System.out.println(socioEmp.toString());
                    valid = false;
                } else {
                    System.out.println("---TIPO DE SOCIO ERRADO , TENTA NOVAMENTE---");
                }
            } else if (tipoPessoa.equals("INSTRUTOR")) {
                Instrutor instrutor = new Instrutor();
                System.out.println("Indica  o seu nome: ");
                instrutor.setNomePessoa(input.nextLine());
                System.out.println("Indica o seu genero: ");
                instrutor.setGenero(input.nextLine());
                System.out.println("Indica 3 formacoes do instrutor:");
                String[] formacoes = new String[3]; // create array to hold 3 values
                for (int i = 0; i < 3; i++) {
                    System.out.print("Formacao " + (i + 1) + ": ");
                    formacoes[i] = input.nextLine(); // store each input in the array
                }
                instrutor.setFormacao(formacoes);
                //add the instructor to the list of instructors
                instrutores.add(instrutor);
                // Going to get you the info about instructor
                System.out.println(instrutor.toString());
                valid = false;

            }
            else {
                System.out.println("---TIPO DE PESSOA ERRADA , TENTA NOVAMENTE---");
            }
        }
        input.close();
    }
}
