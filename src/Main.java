import  java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Instrutor> instrutores = new ArrayList<>();
        ArrayList<SociosIndividuais> sociosIndividuais = new ArrayList<>();
        ArrayList<SocioEmpresario> socioEmpresario = new ArrayList<>();
        ArrayList<AulasDeGrupo>  aulasDeGrupo = new ArrayList<>();
        ArrayList<PersonalTraining>  personalTraining = new ArrayList<>();
        addPessoa(instrutores,sociosIndividuais,socioEmpresario);
        String[] formacoes1 = {"Engenharia", "Mestrado", "Doutorado"};
        Instrutor instrutor1 = new Instrutor("Yassine","M", formacoes1);
        instrutores.add(instrutor1);
        listaInstrutores(instrutores);
        listarSocios(sociosIndividuais,socioEmpresario);
        listarAtividades(aulasDeGrupo,personalTraining);
    }

    /**
     * This function is mainly used to add people according to their type.
     * {@code Socio}:
     * <ul>
     *     <li>Socio Individual</li>
     *     or
     *     <li>Socio Empresario</li>
     * </ul>
     * or<br>
     * {@code Instrutor}
     * <br>And after getting all the info about each person it will be added to the List pre-created.<br>
     * For example:
     * <pre>{@code
     * // add the socio individual na list
     * sociosIndividuais.add(socioInd);
     * // Going to get you the info about Socio Individual
     * System.out.println(socioInd.toString());
     * }</pre>
     * And at the end shows the info in the terminal{@link toString}.
     * @param instrutores
     * @param sociosIndividuais
     * @param socioEmpresario
     */
    public static void addPessoa(ArrayList<Instrutor> instrutores, ArrayList<SociosIndividuais> sociosIndividuais, ArrayList<SocioEmpresario> socioEmpresario){
        String tipoSocio, tipoPessoa;
        boolean valid = true;
        Scanner input = new Scanner(System.in);
        while (valid) {
            System.out.println("---Indica se es um Socio ou Instrutor---");
            tipoPessoa = input.nextLine();
            tipoPessoa = tipoPessoa.toUpperCase();

            // Socio
            if (tipoPessoa.equals("SOCIO")) {
                System.out.println("--Indica se es um Socio Individual ou Empresarial--");
                tipoSocio = input.nextLine();
                tipoSocio = tipoSocio.toUpperCase();

                // Socio Individual
                if (tipoSocio.equals("INDIVIDUAL")) {
                    SociosIndividuais socioInd = new SociosIndividuais();
                    // set name
                    socioInd.setNomePessoa(socioInd.setNome());
                    // set age
                    socioInd.setIdadeSocio(socioInd.setIdade());
                    // set Identification Number
                    socioInd.setNumeroSocio(socioInd.gerarNumSocio()); //Falta verif se o número já existe
                    // set email
                    System.out.println("Indica o seu email:");
                    socioInd.setEmailSocio(input.nextLine());
                    // set discount
                    if (socioInd.getIdadeSocio() < 18) {
                        socioInd.setDesconto(10);
                    }
                    else if (socioInd.getIdadeSocio() >= 65) {
                        socioInd.setDesconto(15);
                    }
                    // add the socio individual na list
                    sociosIndividuais.add(socioInd);
                    // Going to get you the info about Socio Individual
                    System.out.println(socioInd.toString());
                    valid = false;

                }
                // Socio da Empresa
                else if (tipoSocio.equals("EMPRESA")) {
                    SocioEmpresario socioEmp = new SocioEmpresario();
                    // set name
                    socioEmp.setNomePessoa(socioEmp.setNome());
                    // set email
                    System.out.println("Indica o seu email:");
                    socioEmp.setEmailSocio(input.nextLine());
                    // set company name
                    System.out.println("Indica o nome da sua empresa: ");
                    socioEmp.setNomeEmpresa(input.nextLine());
                    // set company's NIF
                    System.out.println("Digite o NIF da sua  empresa: ");
                    socioEmp.setNifEmpresa(input.nextInt());
                    // set Identification Number
                    socioEmp.setNumeroSocio(socioEmp.gerarNumSocio());
                    // add the socio individual na lista
                    socioEmpresario .add(socioEmp);
                    // Going to get you the info about Socio da Empresa
                    System.out.println(socioEmp.toString());
                    valid = false;
                }
                else {
                    System.out.println("---TIPO DE SOCIO ERRADO , TENTA NOVAMENTE---");
                }
            }

            // Instrutor
            else if (tipoPessoa.equals("INSTRUTOR")) {
                Instrutor instrutor = new Instrutor();
                // set name
                instrutor.setNomePessoa(instrutor.setNome());
                // set sex
                instrutor.setGenero(instrutor.setSex());
                // set formacoes
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

    /**
     * Prints all the Instructors in the list, using {@link toString} created in the class of {@code Instrutor}
     * @param instrutores
     */
    public static void listaInstrutores(ArrayList<Instrutor> instrutores) {
        if (instrutores.isEmpty()) System.out.println("---AINDA NAO TEM INSTRUTORES---");
        else {
            for (Instrutor instrutor : instrutores) {
                System.out.println(instrutor.toString());
            }
        }
    }

    /**
     *
     * Asks the user to identify the type of member and then lists all the elements in that list
     * using {@link toString} created in the specified type of member({@code SociosIndividuais} or {@code SocioEmpresario}).
     * @param sociosIndividuais
     * @param socioEmpresario
     */
    public static void listarSocios(ArrayList<SociosIndividuais> sociosIndividuais,ArrayList<SocioEmpresario> socioEmpresario) {
        Scanner input = new Scanner(System.in);
        String tipoSocio;
        System.out.println("--- Que tipo de Socio quere listar ---");
        tipoSocio = input.nextLine();
        tipoSocio = tipoSocio.toUpperCase();
        if (tipoSocio.equals("INDIVIDUAL")){
            if (sociosIndividuais.isEmpty()) System.out.println("--- AINDA NAO TEM SOCIOS INDIVIDUAIS ---");
            else {
                for (SociosIndividuais socioInd : sociosIndividuais) System.out.println(socioInd.toString());
            }

        }
        else if (tipoSocio.equals("EMPRESA")){
            if (socioEmpresario.isEmpty()) System.out.println("--- AINDA NAO TEM SOCIOS EMPRESARIOS ---");
            else {
                for (SocioEmpresario socioEmp : socioEmpresario){
                    System.out.println(socioEmp.toString());
                }
            }
        }
        else {
            System.out.println("--- TIPO DE SOCIO ERRADO ---");
        }
        input.close();
    }

    public static void addActivity(ArrayList<AulasDeGrupo> aulasDeGrupo,ArrayList<PersonalTraining> personalTraining) {
        Scanner input = new Scanner(System.in);
        String tipoAula;
        boolean valid = true;
        while (valid) {
            System.out.println("--- Que tipo de Atividades quere adicionar ---");

            tipoAula = input.nextLine();
            tipoAula = tipoAula.toUpperCase();
            if(tipoAula.equals("AULAS DE GRUPO")){
                AulasDeGrupo aulaGrupo = new AulasDeGrupo();

                // set tipo de aula
                aulaGrupo.setTipoAula(aulaGrupo.setAula());
                // set hora
                aulaGrupo.setHora(aulaGrupo.setHoraDaAtividade());
                //set data

                // set capacidadeMaxima da aula
                aulaGrupo.setCapacidadeMaxima(aulaGrupo.setCapDaAula());

                //add the group lesson to the list of Group Lessons
                aulasDeGrupo.add(aulaGrupo);
                // Going to get you the info about the new Group Lesson created
                System.out.println(aulaGrupo.toString());
                valid = false;
            }
            else if(tipoAula.equals("PERSONAL TRAINING")){
                PersonalTraining personalTrain = new PersonalTraining();

                // set tipo de aula
                personalTrain.setTipoTraining(personalTrain.setSessao());
                // set hora
                personalTrain.setHora(personalTrain.setHoraDaAtividade());
                // set data

                //add the group lesson to the list of Group Lessons
                personalTraining.add(personalTrain);
                // Going to get you the info about the new Group Lesson created
                System.out.println(personalTrain.toString());
                valid = false;
            }
            else {
                System.out.println("--- TIPO DE ATIVIDADE ERRADO ---");
            }
        }
        input.close();
    }
    /**
     * Asks the user to identify the type of activity and then lists all the elements in that list
     * using {@link toString} created in the specified type of activity ({@code AulasDeGrupo} or {@code PersonalTraining}).
     * @param aulasDeGrupo
     * @param personalTraining
     */
    public static void listarAtividades(ArrayList<AulasDeGrupo> aulasDeGrupo, ArrayList<PersonalTraining> personalTraining) {
        Scanner input = new Scanner(System.in);
        String tipoAula;
        System.out.println("--- Que tipo de Atividades quere listar ---");
        tipoAula = input.nextLine();
        tipoAula =  tipoAula.toUpperCase();
        if(tipoAula.equals("AULAS DE GRUPO")){
            if (aulasDeGrupo.isEmpty()) System.out.println("--- AINDA NAO TEM AULAS DE GRUPO MARCADA ---");
            else {
                for (AulasDeGrupo aulaG : aulasDeGrupo) System.out.println(aulaG.toString());
            }
        }
        else if(tipoAula.equals("PERSONAL TRAINING")){
            if (personalTraining.isEmpty()) System.out.println("--- AINDA NAO TEM AULAS DE GRUPO MARCADA ---");
            else {
                for (PersonalTraining personalT : personalTraining) System.out.println(personalT.toString());
            }
        }
        else{
            System.out.println("--- TIPO DE ATIVIDADES ERRADO ---");
        }
        input.close();
    }
}
