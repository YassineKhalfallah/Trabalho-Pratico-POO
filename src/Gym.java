import  java.util.Scanner;
import java.util.ArrayList;

/**
 * This class {@code Gym}
 */
public class Gym {
    /**
     * I set {@code instrutores} as protected because it will be used in other classes
     */
    protected ArrayList<Instrutor> instrutores ;
    /**
     * I set {@code sociosIndividuais} as protected because it will be used in other classes
     */
    protected ArrayList<SocioIndividual> sociosIndividuais;
    /**
     * I set {@code socioEmpresario} as protected because it will be used in other classes
     */
    protected ArrayList<SocioEmpresario> socioEmpresario;
    /**
     * I set {@code aulasDeGrupo} as protected because it will be used in other classes
     */
    protected ArrayList<AulasDeGrupo> aulasDeGrupo;
    /**
     * I set {@code personalTraining} as protected because it will be used in other classes
     */
    protected ArrayList<PersonalTraining> personalTraining;

    public Gym() {
        this.instrutores = new ArrayList<>();
        this.sociosIndividuais = new ArrayList<>();
        this.socioEmpresario = new ArrayList<>();
        this.aulasDeGrupo = new ArrayList<>();
        this.personalTraining = new ArrayList<>();
    }

    public void menu(Scanner input, Gym gym) {
        System.out.println("---- MENU ----");
        System.out.println("1 - Add Pessoa");
        System.out.println("2 - Add Atividade");
        System.out.println("3 - Listar Socios");
        System.out.println("4 - Listar Aulas de Grupos");
        int n = input.nextInt();
        if(n == 1) gym.addPessoa(input);
        else if(n == 2) gym.addActivity(input);
        else if (n == 3) gym.listarSocios(input);
        else if (n == 4) gym.listarAtividades(input);
        else System.out.println("--- NUMERO INVALIDO ----");

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
     */
    public void addPessoa(Scanner input){
        String tipoSocio, tipoPessoa;
        boolean valid = true;
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
                    SocioIndividual socioInd = new SocioIndividual();
                    // set name
                    socioInd.setNomePessoa(socioInd.setNome(input));
                    // set age
                    socioInd.setIdadeSocio(socioInd.setIdade(input));
                    // set Identification Number
                    boolean validade = true;
                    int num;
                    while(validade) {
                        num = socioInd.gerarNumSocio();
                        validade = socioInd.doesItExisteInList(tipoSocio, num, socioEmpresario, sociosIndividuais);
                        socioInd.setNumeroSocio(num);
                    }
                    System.out.println("--- Numero de Socio esta dado ---");
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
                    socioEmp.setNomePessoa(socioEmp.setNome(input));
                    // set email
                    System.out.println("Indica o seu email:");
                    socioEmp.setEmailSocio(input.nextLine());
                    // set company name
                    System.out.println("Indica o nome da sua empresa: ");
                    socioEmp.setNomeEmpresa(input.nextLine());
                    // set company's NIF
                    System.out.println("Digite o NIF da sua  empresa: ");
                    boolean validade = true;
                    while(validade) {
                        socioEmp.setNifEmpresa(input.nextInt());
                        validade = !socioEmp.isNIFValido();
                    }

                    // set Identification Number
                    validade = true;
                    int num;
                    while(validade) {
                        num = socioEmp.gerarNumSocio();
                        validade = socioEmp.doesItExisteInList(tipoSocio, num, socioEmpresario, sociosIndividuais);
                        socioEmp.setNumeroSocio(num);
                    }
                    System.out.println("--- Numero de Socio esta dado ---");
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
                instrutor.setNomePessoa(instrutor.setNome(input));
                // set sex
                instrutor.setGenero(instrutor.setSex(input));
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
    }

    /**
     * Prints all the Instructors in the list, using {@link toString} created in the class of {@code Instrutor}
     */
    public  void listaInstrutores() {
        if (instrutores.isEmpty()) System.out.println("---AINDA NAO TEM INSTRUTORES---");
        else {
            System.out.println("--- Lista de  instrutores ---");
            for (Instrutor instrutor : instrutores) {
                System.out.println(instrutor.toString());
            }
        }
    }

    /**
     *
     * Asks the user to identify the type of member and then lists all the elements in that list
     * using {@link toString} created in the specified type of member({@code SociosIndividuais} or {@code SocioEmpresario}).
     */
    public void listarSocios(Scanner input) {
        String tipoSocio;
        System.out.println("--- Que tipo de Socio quere listar ---");
        tipoSocio = input.nextLine();
        tipoSocio = tipoSocio.toUpperCase();
        if (tipoSocio.equals("INDIVIDUAL")){
            if (sociosIndividuais.isEmpty()) System.out.println("--- AINDA NAO TEM SOCIOS INDIVIDUAIS ---");
            else {
                for (SocioIndividual socioInd : sociosIndividuais) System.out.println(socioInd.toString());
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
    }

    public void addActivity(Scanner input) {
        String tipoAula;
        boolean valid = true;
        while (valid) {
            System.out.println("--- Que tipo de Atividades quere adicionar ---");

            tipoAula = input.nextLine();
            tipoAula = tipoAula.toUpperCase();
            if(tipoAula.equals("AULAS DE GRUPO")){
                AulasDeGrupo aulaGrupo = new AulasDeGrupo();

                // set tipo de aula
                aulaGrupo.setTipoAula(aulaGrupo.setAula(input));
                // set hora
                aulaGrupo.setTempo(aulaGrupo.getTempo().setHoraDaAtividade(input));
                //set data
                aulaGrupo.setDate(aulaGrupo.date.setDataDaAtividade(input));
                // set capacidadeMaxima da aula
                aulaGrupo.setCapacidadeMaxima(aulaGrupo.setCapDaAula(input));

                //add the group lesson to the list of Group Lessons
                aulasDeGrupo.add(aulaGrupo);
                // Going to get you the info about the new Group Lesson created
                System.out.println(aulaGrupo.toString());
                valid = false;
            }
            else if(tipoAula.equals("PERSONAL TRAINING")){
                PersonalTraining personalTrain = new PersonalTraining();

                // set tipo de aula
                personalTrain.setTipoTraining(personalTrain.setSessao(input));
                // set hora
                personalTrain.setTempo(personalTrain.tempo.setHoraDaAtividade(input));
                // set data
                personalTrain.setDate(personalTrain.date.setDataDaAtividade(input));
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
    }
    /**
     * Asks the user to identify the type of activity and then lists all the elements in that list
     * using {@link toString} created in the specified type of activity ({@code AulasDeGrupo} or {@code PersonalTraining}).
     */
    public void listarAtividades(Scanner input) {
        String tipoAula;
        System.out.println("--- Que tipo de Atividades quere listar ---");
        tipoAula = input.nextLine();
        tipoAula =  tipoAula.toUpperCase();
        if(tipoAula.equals("AULA DE GRUPO")){
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
    }

}
