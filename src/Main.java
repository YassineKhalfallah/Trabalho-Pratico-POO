import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String tipoSocio, tipoPessoa,tipoInstrutor;
        Scanner input = new Scanner(System.in);

        boolean valid = true;
        while (valid) {
            System.out.println("Indica se es um Socio ou Instrutor");
            tipoPessoa = input.nextLine();
            tipoPessoa = tipoPessoa.toUpperCase();
            if(tipoPessoa.equals("SOCIO")){
                System.out.println("--Indica se es um Socio Individual ou Empresa--");
                tipoSocio = input.nextLine();
                tipoSocio = tipoSocio.toUpperCase();
                if (tipoSocio.equals("INDIVIDUAL")) {
                    SociosIndividuais socioInd = new SociosIndividuais();
                    System.out.println("Indica o seu nome:");
                    socioInd.setNomePessoa(input.nextLine());
                    System.out.println("Digite a seu idade :");
                    socioInd.setIdadeSocio(Integer.parseInt(input.nextLine()));
                    System.out.println("Digite o seu numero identificador:");
                    socioInd.setNumeroSocio(Integer.parseInt(input.nextLine()));
                    System.out.println("Indica o seu email:");
                    socioInd.setEmailSocio(input.nextLine());
                    System.out.println(socioInd.toString());
                    valid = false;
                }
                else if (tipoSocio.equals("EMPRESA")) {
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
                    System.out.println(socioEmp.toString());
                    valid = false;
                }
                else {
                    System.out.println("---TIPO DE SOCIO ERRADO , TENTA NOVAMENTE---");
                }
            }
            else if(tipoPessoa.equals("INSTRUTOR")){
                System.out.println("Indica se es um Socio Individual ou Empresa");
                tipoInstrutor = input.nextLine();
                tipoInstrutor = tipoInstrutor.toUpperCase();

            }
            else{
                System.out.println("---TIPO DE PESSOA ERRADA , TENTA NOVAMENTE---");
            }
        }
    }
}