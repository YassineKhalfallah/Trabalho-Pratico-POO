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
    protected ArrayList<SocioEmpresario> sociosEmpresarios;
    /**
     * I set {@code aulasDeGrupo} as protected because it will be used in other classes
     */
    protected ArrayList<AulasDeGrupo> aulasDeGrupo;
    /**
     * I set {@code personalTraining} as protected because it will be used in other classes
     */
    protected ArrayList<PersonalTraining> personalTraining;
    /**
     * I set {@code marcacaoAGEmp} as protected because it will be used in other classes
     */
    protected ArrayList<MarcacaoAGEmp> marcacaoAGEmp;
    /**
     * I set {@code marcacaoAGInd} as protected because it will be used in other classes
     */
    protected ArrayList<MarcacaoAGInd> marcacaoAGInd;
    /**
     * I set {@code marcacaoPTEmp} as protected because it will be used in other classes
     */
    protected ArrayList<MarcacaoPTEmp> marcacaoPTEmp;
    /**
     * I set {@code marcacaoPTInd} as protected because it will be used in other classes
     */
    protected ArrayList<MarcacaoPTInd> marcacaoPTInd;

    public Gym() {
        this.instrutores = new ArrayList<>();
        this.sociosIndividuais = new ArrayList<>();
        this.sociosEmpresarios = new ArrayList<>();
        this.aulasDeGrupo = new ArrayList<>();
        this.personalTraining = new ArrayList<>();
        this.marcacaoAGEmp = new ArrayList<>();
        this.marcacaoAGInd = new ArrayList<>();
        this.marcacaoPTEmp = new ArrayList<>();
        this.marcacaoPTInd = new ArrayList<>();
    }

    public void menu(Scanner input, Gym gym) {
        System.out.println("---- MENU ----");
        System.out.println("1 - Add Pessoa");// pessoa serve para socios e instrutores
        System.out.println("2 - Add Atividade");
        System.out.println("3 - Listar Socios");
        System.out.println("4 - Listar Aulas de Grupos");
        System.out.println("5 - Fazer Marcaçao numa atividade");
        System.out.println("6 - Listar Marcaçoes");
        System.out.println("7 - Resumo De Atividades");
        int n = Integer.parseInt(input.nextLine());
        if(n == 1) gym.addPessoa(input);
        else if(n == 2) gym.addActivity(input);
        else if (n == 3) gym.listarSocios(input);
        else if (n == 4) gym.listarAtividades(input);
        else if (n == 5) gym.marcarAtividade(input);
        else if (n == 6) gym.listarMarcacoes(input);
        else if (n == 7) gym.res
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
                        validade = socioInd.doesItExisteInList(tipoSocio, num, sociosEmpresarios, sociosIndividuais);
                        socioInd.setNumeroSocio(num);
                    }
                    System.out.println("--- Numero de Socio esta dado ---");
                    // set email
                    String email = "";
                    boolean emailValido = false;
                    while (!emailValido) {
                        System.out.println("Indica o teu email (apenas contas @gmail.com):");
                        email = input.nextLine().trim().toLowerCase(); 
                        if (email.endsWith("@gmail.com") && email.length() > 10) {//verifica se acaba com aquele segmento e tem nº de caracteres apropriado
                            emailValido = true;
                        } else {
                        System.out.println("Apenas são aceites endereços de Gmail(nome@gmail.com).");
                        }
                    }
                    socioInd.setEmailSocio(email);
                    System.out.println("--- Email esta dado ---");
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
                else if (tipoSocio.equals("EMPRESARIO")) {
                    SocioEmpresario socioEmp = new SocioEmpresario();
                    // set name
                    socioEmp.setNomePessoa(socioEmp.setNome(input));
                    // set email
                    String email = "";
                    boolean emailValido = false;
                    while (!emailValido) {
                        System.out.println("Indica o teu email (apenas contas @gmail.com):");
                        email = input.nextLine().trim().toLowerCase();
                        if (email.endsWith("@gmail.com") && email.length() > 10) {//verifica se acaba com aquele segmento e tem nº de caracteres apropriado
                            emailValido = true;
                        } else {
                        System.out.println("Apenas são aceites endereços de Gmail(nome@gmail.com).");
                        }
                    }
                    socioEmp.setEmailSocio(email);
                    System.out.println("--- Email esta dado ---");
                    // set company name
                    System.out.println("Indica o nome da sua empresa: ");
                    socioEmp.setNomeEmpresa(input.nextLine());
                    // set company's NIF

                    boolean validade = true;
                    while(validade) {
                        System.out.println("Digite o NIF da sua  empresa: ");
                        socioEmp.setNifEmpresa(Integer.parseInt(input.nextLine()));
                        validade = !socioEmp.isNIFValido();
                    }

                    // set Identification Number
                    validade = true;
                    int num;
                    while(validade) {
                        num = socioEmp.gerarNumSocio();
                        validade = socioEmp.doesItExisteInList(tipoSocio, num, sociosEmpresarios, sociosIndividuais);
                        socioEmp.setNumeroSocio(num);
                    }
                    System.out.println("--- Numero de Socio esta dado ---");
                    // add the socio individual na lista
                    sociosEmpresarios.add(socioEmp);
                    // Going to get you the info about Socio da Empresa
                    System.out.println(socioEmp.toString());
                    valid = false;
                }
                else {
                    valid = tipoSocioErrado(input, tipoSocio);
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
                System.out.println("---TIPO DE PESSOA ERRADA ---");
                System.out.println("-- Quer sair de este metodo--");
                tipoSocio = input.nextLine().toUpperCase();
                if (tipoSocio.equals("SIM")||tipoSocio.equals("S")) {
                    valid = false;
                    System.out.println("--- MARCAÇÃO CANCELADA ---");
                }
                else {valid = true;}
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
     * @param input
     */
    public void listarSocios(Scanner input) {
        String tipoSocio;
        boolean valid = true;
        while (valid) {
            System.out.println("--- Que tipo de Socio quere listar ---");
            tipoSocio = input.nextLine();
            tipoSocio = tipoSocio.toUpperCase();
            if (tipoSocio.equals("INDIVIDUAL")) {
                if (sociosIndividuais.isEmpty()) System.out.println("--- AINDA NAO TEM SOCIOS INDIVIDUAIS ---");
                else {
                    for (SocioIndividual socioInd : sociosIndividuais) System.out.println(socioInd.toString());
                }
                valid = false;
            }
            else if (tipoSocio.equals("EMPRESA")) {
                if (sociosEmpresarios.isEmpty()) System.out.println("--- AINDA NAO TEM SOCIOS EMPRESARIOS ---");
                else {
                    for (SocioEmpresario socioEmp : sociosEmpresarios) {
                        System.out.println(socioEmp.toString());
                    }
                }
                valid = false;
            }
            else {
                valid = tipoSocioErrado(input, tipoSocio);
            }
        }
    }

    public void addActivity(Scanner input) {
        String tipoAtividade;
        boolean valid = true;
        while (valid) {
            System.out.println("--- Que tipo de Atividades quere adicionar ---");

            tipoAtividade = input.nextLine();
            tipoAtividade = tipoAtividade.toUpperCase();
            if(tipoAtividade.equals("AULAS DE GRUPO")){
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
            else if(tipoAtividade.equals("PERSONAL TRAINING")){
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
                valid = tipoSocioErrado(input, tipoAtividade);
            }
        }
    }
    /**
     * Asks the user to identify the type of activity and then lists all the elements in that list
     * using {@link toString} created in the specified type of activity ({@code AulasDeGrupo} or {@code PersonalTraining}).
     */
    public void listarAtividades(Scanner input) {
        String tipoAtividade;
        boolean valid = true;
        while (valid) {
            System.out.println("--- Que tipo de Atividades quer listar ---");
            tipoAtividade = input.nextLine();
            tipoAtividade = tipoAtividade.toUpperCase();
            if (tipoAtividade.equals("AULA DE GRUPO")) {
                if (aulasDeGrupo.isEmpty()) System.out.println("--- AINDA NAO TEM AULAS DE GRUPO MARCADA ---");
                else {
                    for (AulasDeGrupo aulaG : aulasDeGrupo) System.out.println(aulaG.toString());
                }
                valid = false;
            }
            else if (tipoAtividade.equals("PERSONAL TRAINING")) {
                if (personalTraining.isEmpty()) System.out.println("--- AINDA NAO TEM AULAS DE GRUPO MARCADA ---");
                else {
                    for (PersonalTraining personalT : personalTraining) System.out.println(personalT.toString());
                }
                valid = false;
            }
            else {
                valid = tipoAtividadeErrada(input,tipoAtividade);
            }
        }
    }

    /**
     * Depending on the type of Socio and depending on the type of the lesson willing to make the registration,
     * the user will get to see all the activities available and enter the index of activity that he liked most and make his registration.
     * @param input
     */
    public void marcarAtividade(Scanner input) {
        String tipoAtividade, tipoSocio;
        boolean valid = true;
        while (valid) {
            System.out.println("--Indica se es um Socio Individual ou Empresarial--");
            tipoSocio = input.nextLine();
            tipoSocio = tipoSocio.toUpperCase();
            if (tipoSocio.equals("INDIVIDUAL")) {
                //Pedir o numero de socio
                int numIDInd = pedirIdNumInd(input);
                SocioIndividual socioInd = infoSocioInd(numIDInd);
                boolean vld = true;
                while (vld) {
                    //
                    System.out.println("--- Que tipo de Atividades quer marcar ---");
                    tipoAtividade = input.nextLine();
                    tipoAtividade = tipoAtividade.toUpperCase();
                    if (tipoAtividade.equals("AULAS DE GRUPO")) {
                        // listar aulas de grupo
                        if (aulasDeGrupo.isEmpty()) {
                            System.out.println("--- Ainda nao tem aulas de grupo para conseguir marcadar ---");
                        }
                        else {
                            MarcacaoAGInd aulaG1 = new MarcacaoAGInd();
                            System.out.println("Aulas de grupo disponiveis :");

                            for (AulasDeGrupo aulaG : aulasDeGrupo) {

                                System.out.println(aulaG.toString());
                            }
                            System.out.print("Indique o índice da atividade desejada: ");
                            int idx = Integer.parseInt(input.nextLine().trim()) - 1;
                            AulasDeGrupo atividadeEscolhida = aulasDeGrupo.get(idx);
                            //atribuir informacoes
                            aulaG1.setAulaG(atividadeEscolhida);
                            aulaG1.setSocioInd(socioInd);
                            //inserir o valor final
                            aulaG1.setCustoFinal(atividadeEscolhida.getPreco()-(atividadeEscolhida.getPreco()*((socioInd.getDesconto())/100)));
                            //indicar que ha mais uma pessoa na atividade escolhida
                            atividadeEscolhida.setNumeroDePessoasNaAtividade(atividadeEscolhida.getNumeroDePessoasNaAtividade()+1);
                            marcacaoAGInd.add(aulaG1);
                            vld = false;
                        }
                    }
                    else if (tipoAtividade.equals("PERSONAL TRAINING")) {
                        if (personalTraining.isEmpty()) {
                            System.out.println("--- Ainda nao tem sessoes de Persoanl training para conseguir marcadar ---");
                        } else {
                            MarcacaoPTInd sessaoP1 = new MarcacaoPTInd();
                            // listar aulas de grupo
                            System.out.println("Sessoes de Personal Training disponiveis :");
                            for (PersonalTraining aulaP : personalTraining) {
                                System.out.println(aulaP.toString());
                            }
                            System.out.print("Indique o indice da atividade desejada: ");
                            int idx = Integer.parseInt(input.nextLine().trim()) - 1;
                            PersonalTraining SessaoEscolhida = personalTraining.get(idx);
                            //atribuir informacoes
                            sessaoP1.setSessaoP(SessaoEscolhida);
                            sessaoP1.setSocioInd(socioInd);
                            //inserir o valor final
                            sessaoP1.setCustoFinal(SessaoEscolhida.getPreco()-(SessaoEscolhida.getPreco()*((socioInd.getDesconto())/100)));

                            //guardar marcaçao na lista de marcacoes
                            marcacaoPTInd.add(sessaoP1);
                        }
                        vld = false;
                    }
                    else {
                        vld = tipoAtividadeErrada(input,tipoAtividade);
                    }
                }
            }
            else if(tipoSocio.equals("EMPRESARIO")){
                //Pedir o numero de socio
                int numIDEmp = pedirIdNumEmp(input);
                SocioEmpresario socioEmp = infoSocioEmp(numIDEmp);
                boolean vld = true;
                while (vld) {
                    //
                    System.out.println("--- Que tipo de Atividades quer marcar ---");
                    tipoAtividade = input.nextLine();
                    tipoAtividade = tipoAtividade.toUpperCase();
                    if (tipoAtividade.equals("AULAS DE GRUPO")) {
                        MarcacaoAGEmp aulaG1 = new MarcacaoAGEmp();
                        // listar aulas de grupo
                        System.out.println("Aulas de grupo disponiveis :");
                        for (AulasDeGrupo aulaG : aulasDeGrupo) {
                            System.out.println(aulaG.toString());
                        }
                        System.out.print("Indique o índice da atividade desejada: ");
                        int idx = Integer.parseInt(input.nextLine().trim()) - 1;
                        AulasDeGrupo atividadeEscolhida = aulasDeGrupo.get(idx);
                        //atribuir informacoes
                        aulaG1.setAulaG(atividadeEscolhida);
                        aulaG1.setSocioEmp(socioEmp);
                        //inserir o valor final
                        aulaG1.setCustoFinal(atividadeEscolhida.getPreco()-(atividadeEscolhida.getPreco()*((socioEmp.getDesconto())/100)));
                        //indicar que ha mais uma pessoa na atividade escolhida
                        atividadeEscolhida.setNumeroDePessoasNaAtividade(atividadeEscolhida.getNumeroDePessoasNaAtividade()+1);

                        marcacaoAGEmp.add(aulaG1);
                        vld = false;
                    }
                    else if (tipoAtividade.equals("PERSONAL TRAINING")) {
                        MarcacaoPTEmp sessaoP1 = new MarcacaoPTEmp();
                        // listar aulas de grupo
                        System.out.println("Sessoes de Personal Training disponiveis :");
                        for (PersonalTraining aulaP : personalTraining) {
                            System.out.println(aulaP.toString());
                        }
                        System.out.print("Indique o indice da atividade desejada: ");
                        int idx = Integer.parseInt(input.nextLine().trim()) - 1;
                        PersonalTraining SessaoEscolhida = personalTraining.get(idx);
                        //atribuir informacoes
                        sessaoP1.setSessaoP(SessaoEscolhida);
                        sessaoP1.setSocioEmp(socioEmp);
                        //inserir o valor final
                        sessaoP1.setCustoFinal(SessaoEscolhida.getPreco()-(SessaoEscolhida.getPreco()*((socioEmp.getDesconto())/100)));

                        //guardar marcaçao na lista de marcacoes
                        marcacaoPTEmp.add(sessaoP1);
                        vld= false;
                    } else {
                        vld = tipoAtividadeErrada(input,tipoAtividade);
                    }
                }
                valid = false;
            }
            else {
                valid = tipoSocioErrado(input, tipoSocio);
            }
        }
    }

    /**
     * Asks the user to identify the type of member he is ({@code Individual} or {@code Empresario}) ,
     * and then to identify what kind of activities he is willing to check({@code AulasDeGrupo} or {@code PersonalTraining}).
     * Depending on having elements in the list wanted or not, the user will get to see the list asked.
     * @param input
     */
    public void listarMarcacoes(Scanner input) {
        String tipoSocio,tipoAtividade;
        boolean valid = true ,vld = true;
        while (valid) {
            System.out.println("--- Quer listar Marcacoes de que tipo de Socio ---");
            tipoSocio = input.nextLine();
            tipoSocio = tipoSocio.toUpperCase();
            if (tipoSocio.equals("INDIVIDUAL")) {
                while (vld) {
                    System.out.println("--- Que tipo de Atividades quer marcar ---");
                    tipoAtividade = input.nextLine();
                    tipoAtividade = tipoAtividade.toUpperCase();
                    if (tipoAtividade.equals("AULAS DE GRUPO")) {
                        if(marcacaoAGInd.isEmpty()) System.out.println("Nenhuma Marcacao Grupo Feita");
                        else{
                            for(MarcacaoAGInd m : marcacaoAGInd){
                                System.out.println(m.toString());
                            }
                        }
                        vld = false;
                        valid = false;
                    }
                    else if (tipoAtividade.equals("PERSONAL TRAINING")) {
                        if(marcacaoPTInd.isEmpty()) System.out.println("Nenhuma Marcacao Grupo Feita");
                        else{
                            for(MarcacaoPTInd m : marcacaoPTInd){
                                System.out.println(m.toString());
                            }
                        }
                        vld = false;
                        valid = false;
                    }
                    else {
                        vld = tipoAtividadeErrada(input,tipoAtividade);
                    }
                }
            }
            else if (tipoSocio.equals("EMPRESARIO")) {
                while (vld) {
                    System.out.println("--- Que tipo de Atividades quer marcar ---");
                    tipoAtividade = input.nextLine();
                    tipoAtividade = tipoAtividade.toUpperCase();
                    if (tipoAtividade.equals("AULAS DE GRUPO")) {
                        if(marcacaoAGEmp.isEmpty()) System.out.println("Nenhuma Marcacao Grupo Feita");
                        else{
                            for(MarcacaoAGEmp m : marcacaoAGEmp){
                                System.out.println(m.toString());
                            }
                        }
                        vld = false;
                        valid = false;
                    }
                    else if (tipoAtividade.equals("PERSONAL TRAINING")) {
                        if(marcacaoPTEmp.isEmpty()) System.out.println("Nenhuma Marcacao Grupo Feita");
                        else{
                            for(MarcacaoPTEmp m : marcacaoPTEmp){
                                System.out.println(m.toString());
                            }
                        }
                        vld = false;
                        valid = false;
                    }
                    else {
                        vld = tipoAtividadeErrada(input,tipoAtividade);
                    }
                }
            }
            else{
                valid = tipoSocioErrado(input,tipoSocio);
            }
        }

    }

    /**
     * Runs the list of Individual members and gets the information of that member if he actually exist
     * @param numId
     * @return if the IdNumber exist in the list the info of that person will be provided
     */
    public SocioIndividual infoSocioInd(int numId){
        for (SocioIndividual sociosInd : sociosIndividuais) {
            if(sociosInd.numeroSocio == numId){
                return sociosInd;
            }
        }
        return null;
    }

    /**
     * Runs the list of Company members and gets the information of that member if he actually exist.
     * @param numId
     * @return if the IdNumber exist in the list the info of that person will be provided
     */
    public SocioEmpresario infoSocioEmp(int numId){
        for (SocioEmpresario sociosEmp : sociosEmpresarios) {
            if(sociosEmp.numeroSocio == numId){
                return sociosEmp;
            }
        }
        return null;
    }

    /**
     * Makes sure that the Id number given exists in the list of Individual members
     * @param numID
     * @return true if number exists in the list of Individual members
     */
    public boolean doesIdExistInd(int numID) {
        for (SocioIndividual sociosInd : sociosIndividuais) {
            if(sociosInd.numeroSocio == numID){
                return true;
            }
        }
        return false;
    }
    /**
     * Makes sure that the Id number given exists in the list of Company members
     * @param numID
     * @return true if number exists in the list of Company members
     */
    public boolean doesIdExistEmp(int numID) {
        for (SocioEmpresario sociosEmp : sociosEmpresarios) {
            if(sociosEmp.numeroSocio == numID){
                return true;
            }
        }
        return false;
    }

    /**
     * Asks the user to give his Id number, However this info will get checked at the functions {@link doesIdExistInd}
     * if after the verification the Id number given exist in the list of Individual members, you will get it at the return, otherwise it will keep asking you again.
     * @return Id number of socio Individual
     * */
    public int pedirIdNumInd(Scanner input) {
        boolean valid = true;
        int numID = 0;
        int i = 0;
        while (valid) {
            if(i == 0) System.out.println("Indica o seu numero identificador :");
            else {System.out.println("Numero nao existe na lista de socio!!!");}
            numID = Integer.parseInt(input.nextLine());
            valid = !doesIdExistInd(numID);
            i++;
        }
        return numID;
    }
    /**
     * Asks the user to give his Id number, However this info will get checked at the functions {@link doesIdExistEmp}
     * if after the verification the Id number given exist in the list of members that work in a Company, you will get it at the return, otherwise it will keep asking you again.
     * @return Id number of socio Individual
     * */
    public int pedirIdNumEmp(Scanner input) {
        boolean valid = true;
        int numID = 0;
        int i = 0;
        while (valid) {
            if(i == 0) System.out.println("Indica o seu numero identificador :");
            else {System.out.println("Numero nao existe na lista de socio!!!");}
            numID = Integer.parseInt(input.nextLine());
            valid = !doesIdExistEmp(numID);
            i++;
        }
        return numID;
    }

    /**
     * This function will tell the user that his input was wrong and asks him if he is  willing to get out of the function.
     * If user types SIM or S user get out from the method.
     * @param input
     * @param tipoSocio
     * @return true if user willing to continue
     */
    public boolean tipoSocioErrado(Scanner input,String tipoSocio) {
        System.out.println("--- TIPO DE SOCIO ERRADO ---");
        System.out.println("-- Quer sair de este metodo--");
        tipoSocio = input.nextLine().toUpperCase();
        if (tipoSocio.equals("SIM") || tipoSocio.equals("S")) {
            System.out.println("--- MARCAÇÃO CANCELADA ---");
            return false;
        } else {
            return true;
        }
    }

    public boolean tipoAtividadeErrada(Scanner input,String tipoAtividade) {
        System.out.println("--- TIPO DE ATIVIDADES ERRADO ---");
        System.out.println("-- Quer sair de este metodo--");
        tipoAtividade = input.nextLine().toUpperCase();
        if (tipoAtividade.equals("SIM") || tipoAtividade.equals("S")) {
            System.out.println("--- MARCAÇÃO CANCELADA ---");
            return false;
        } else {
            return true;
        }
    }

    public void resumoAtividades(){
        System.out.println("--- RESUMO DE ATIVIDADES ---");
        System.out.println("No nosso ginasio existem:\nSocios Individuais: "+sociosIndividuais.size()+
                "\nSocios Empresarios: "+sociosEmpresarios.size()+
                "\nAulas de Grupo: "+aulasDeGrupo.size()+
                "\nSessões de Personal Training: "+personalTraining.size());
    }
}
