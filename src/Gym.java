import  java.util.Scanner;
import java.util.ArrayList;

/**
 * This class {@code Gym} contains all the information and methods to manage a gym
 */
public class Gym {
    /**
     * I set {@code instrutores} as protected because it will be used in other classes
     */
    protected ArrayList<Instrutor> instrutores ;
    /**
     * I set {@code sociosIndividuais} as protected because it will be used in other classes
     */
    protected ArrayList<Socio> socios;

    /**
     * I set {@code atividades} as protected because it will be used in other classes
     */
    protected ArrayList<Atividade> atividades;

    /**
     * I set {@code marcacoes} as protected because it will be used in other classes
     */
    protected ArrayList<Marcacao> marcacoes;

    /**
     *The constructor of the class Gym, where in it will have lists of every element of the class
     */
    public Gym() {
        this.instrutores = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.atividades = new ArrayList<>();
        this.marcacoes = new ArrayList<>();
    }

    /**
     * Menu to help the user indicate and chose the operation he would like to do.
     * @param input Scanner name
     */
    public void menu(Scanner input) {
        System.out.println("\n---- MENU ----\n");
        System.out.println("1 - Add Pessoa");// pessoa serve para socios e instrutores
        System.out.println("2 - Add Atividade");
        System.out.println("3 - Listar Socios");
        System.out.println("4 - Listar Atividades");
        System.out.println("5 - Fazer Marcaçao numa atividade");
        System.out.println("6 - Listar Marcaçoes");
        System.out.println("7 - Resumo De Atividades");
        System.out.println("8 - Atividade mais popular");
        System.out.println("9 - Vantagens que tem com o desconto");
        System.out.println("0 - Sai da função menu");
        System.out.println("\nDigite o indice para o metodo que quer aplicar :");
        int n = Integer.parseInt(input.nextLine());
        if(n == 1) this.addPessoa(input);
        else if(n == 2) this.addActivity(input);
        else if (n == 3) this.listarSocios(input);
        else if (n == 4) this.listarAtividades(input);
        else if (n == 5) this.marcarAtividade(input);
        else if (n == 6) this.listarMarcacoes(input);
        else if (n == 7) this.resumoAtividades();
        else if (n == 8) this.maisPopular();
        else if (n == 9) this.valoresSocio(input);
        else if(n == 0){
            System.out.println("Programa finalizado");
            input.close();
            System.exit(0);
        }
        else System.out.println("--- NUMERO INVALIDO ----");
    }

    /**
     * This function is mainly used to add people according to their type.
     * {@code Socio}:
     * <ul>
     *     <li>Socio Individual</li>
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
     * @param input Scanner name
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
                        validade = socioInd.doesItExisteInList( num, socios);
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
                    socios.add(socioInd);
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
                        validade = socioEmp.doesItExisteInList(num, socios);
                        socioEmp.setNumeroSocio(num);
                    }
                    System.out.println("--- Numero de Socio esta dado ---");
                    // atribuir o desconto para socioEmpresario
                    socioEmp.setDesconto(20);
                    // add the socio individual na lista
                    socios.add(socioEmp);
                    // Going to get you the info about Socio da Empresa
                    System.out.println(socioEmp.toString());
                    valid = false;
                }
                else {
                    valid = tipoErrado(input);
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
     * @param input Scanner name
     */
    public void listarSocios(Scanner input) {
        if (socios.isEmpty()) System.out.println("--- AINDA NAO TEM SOCIOS ---");
        else {
            for (Socio s : socios) System.out.println(s.toString()+"\n");

        }
    }

    /**
     * This method is mainly responsible to add activities in a list depending on the type of the activity({@code AulaDeGrupo} or {@code PersonalTraining}).
     * <br>The user will be asked to give name, the hours and minutes of the activity and then the date, and finally the maximum capacity of that activity in case of being a group lesson.
     * @param input Scanner name
     */
    public void addActivity(Scanner input) {
        String tipoAtividade;
        boolean valid = true;
        while (valid) {
            System.out.println("--- Que tipo de Atividades quer adicionar ---");

            tipoAtividade = input.nextLine();
            tipoAtividade = tipoAtividade.toUpperCase();
            if(tipoAtividade.equals("AULAS DE GRUPO")){
                AulaDeGrupo aulaGrupo = new AulaDeGrupo();

                // set tipo de aula
                aulaGrupo.setTipoAula(aulaGrupo.setAula(input));
                // set hora
                Hora nhora = new Hora();
                nhora = nhora.setHoraDaAtividade(input);
                aulaGrupo.setTempo(nhora);
                //set data
                Data ndata = new Data();
                ndata = ndata.setDataDaAtividade(input);
                aulaGrupo.setDate(ndata);
                // set capacidadeMaxima da aula
                aulaGrupo.setCapacidadeMaxima(aulaGrupo.setCapDaAula(input));

                //add the group lesson to the list of Group Lessons
                atividades.add(aulaGrupo);
                // Going to get you the info about the new Group Lesson created
                System.out.println(aulaGrupo.toString());
                valid = false;
            }
            else if(tipoAtividade.equals("PERSONAL TRAINING")){
                PersonalTraining personalTrain = new PersonalTraining();

                // set tipo de aula
                personalTrain.setTipoTraining(personalTrain.setSessao(input));
                // set hora
                Hora nhora = new Hora();
                nhora = nhora.setHoraDaAtividade(input);
                personalTrain.setTempo(nhora);
                //set data
                Data ndata = new Data();
                ndata = ndata.setDataDaAtividade(input);
                personalTrain.setDate(ndata);
                //add the group lesson to the list of Group Lessons
                atividades.add(personalTrain);
                // Going to get you the info about the new Group Lesson created
                System.out.println(personalTrain.toString());
                valid = false;
            }
            else {
                valid = tipoErrado(input);
            }
        }
    }

    /**
     * Asks the user to identify the type of activity and then lists all the elements in that list
     * using {@link toString} created in the specified type of activity ({@code AulaDeGrupo} or {@code PersonalTraining}).
     * @param input Scanner name
     */
    public void listarAtividades(Scanner input) {
        if (atividades.isEmpty()) System.out.println("--- AINDA NAO TEM AULAS DE GRUPO MARCADA ---");
        else {
            for (Atividade atividade : atividades) System.out.println(atividade.toString()+"\n");
        }
    }

    /**
     * Depending on the type of Socio and depending on the type of the lesson willing to make the registration,
     * the user will get to see all the activities available and enter the index of activity that he liked most and make his registration.
     * @param input Scanner name
     */
    public void marcarAtividade(Scanner input) {
        int i = 1;
        Marcacao  marcacao = new Marcacao();
        //Pedir o numero de socio
        int numIDInd = pedirIdNum(input);
        Socio socio = infoSocio(numIDInd);
        if (atividades.isEmpty()) {
            System.out.println("--- Ainda nao tem atividades para conseguir marcadar ---");
        }
        // listar atividades
        System.out.println("Atividades disponiveis :");
        for (Atividade atividade : atividades) {
            System.out.println(i+")\n"+atividade.toString()+"\n");
            i++;
        }
        System.out.print("Indique o índice da atividade desejada: ");
        int idx = Integer.parseInt(input.nextLine().trim()) - 1;
        Atividade atividadeEscolhida = atividades.get(idx);

        //adicionar o dinheira nas despesas do socio
        socio.setDespesas(socio.getDespesas() + (atividadeEscolhida.getPreco()-(atividadeEscolhida.getPreco()*(socio.getDesconto()/100))));
        //atribuir informacoes
        marcacao.setAtividade(atividadeEscolhida);
        marcacao.setSocio(socio);
        //inserir o valor final
        marcacao.setCustoFinal(atividadeEscolhida.getPreco()-(atividadeEscolhida.getPreco()*((socio.getDesconto())/100)));
        //indicar que ha mais uma pessoa na atividade escolhida
        if (atividadeEscolhida.getTipoAtividade().equals("AULAS DE GRUPO")) {
            ((AulaDeGrupo)atividadeEscolhida).setNumeroDePessoasNaAtividade(((AulaDeGrupo)atividadeEscolhida).getNumeroDePessoasNaAtividade() + 1);
        }
        marcacoes.add(marcacao);
    }

    /**
     * Asks the user to identify the type of member he is ({@code Individual} or {@code Empresario}) ,
     * and then to identify what kind of activities he is willing to check({@code AulaDeGrupo} or {@code PersonalTraining}).
     * Depending on having elements in the list wanted or not, the user will get to see the list asked.
     * @param input Scanner name
     */
    public void listarMarcacoes(Scanner input) {
        if (marcacoes.isEmpty()) System.out.println("Nenhuma Marcacao Grupo Feita");
        else {
            for (Marcacao m : marcacoes) {
                System.out.println(m.toString());
            }
        }
    }

    /**
     * Checks the lists of Group Classes and Personal Training to find and print 
     * the most popular activity based on the total number of bookings or participants.
     */
    public void maisPopular() {
        System.out.println("--- Atividade mais popular ---");

        if (atividades.isEmpty()) {
            System.out.println("Não há atividades registadas.");
            return;
        }

        String atividadeMaisPopular = "Nenhuma";
        int maxCount = -1;

        // Loop through ALL activities once
        for (Atividade a : atividades) {
            int count = 0;

            if (a.getTipoAtividade().equals("AULAS DE GRUPO")) {
                AulaDeGrupo ag = (AulaDeGrupo) a;
                count = ag.getNumeroDePessoasNaAtividade();
            }
            else if (a.getTipoAtividade().equals("PERSONAL TRAINING")) {
                for (Marcacao m : marcacoes) {
                    if (m.getAtividade() == a) {
                        count++;
                    }
                }
            }

            if (count > maxCount) {
                maxCount = count;
                atividadeMaisPopular = a.toString() + " (" + count + ")";
            }
        }

        if (maxCount <= 0) {
            System.out.println("Ainda não existem marcações.");
        } else {
            System.out.println("A atividade mais popular é: " + atividadeMaisPopular);
        }
    }

    /**
     * Runs the list of Individual members and gets the information of that member if he actually exist
     * @param numId ID number of individual member
     * @return if the IdNumber exist in the list the info of that person will be provided
     */
    private Socio infoSocio(int numId){
        for (Socio socios: socios) {
            if(socios.numeroSocio == numId){
                return socios;
            }
        }
        return null;
    }


    /**
     * Makes sure that the Id number given exists in the list of Corporate members
     * @param numID ID number of Corporate member
     * @return true if number exists in the list of Company members
     */
    private boolean doesIdExist(int numID) {
        boolean ids = false;
        for (Socio socios : socios) {
            if(socios.numeroSocio == numID){
                ids = true;
            }
        }
        return ids;
    }

    /**
     * Asks the user to give his Id number, However this info will get checked at the functions {@link doesIdExist}
     * if after the verification the Id number given exist in the list of Individual members, you will get it at the return, otherwise it will keep asking you again.
     * @return Id number of socio Individual
     * @param input Scanner name
     * */
    private int pedirIdNum(Scanner input) {
        boolean valid = true;
        int numID = 0;
        int i = 0;
        while (valid) {
            if(i == 0) System.out.println("Indica o seu numero identificador :");
            else {System.out.println("Numero nao existe na lista de socio!!!\nTenta novamente :");}
            numID = Integer.parseInt(input.nextLine());
            valid = !doesIdExist(numID);
            i++;
        }
        return numID;
    }


    /**
     * This function will tell the user that his input for the type of member was wrong and asks him if he is  willing to get out of the function.
     * If user types SIM or S user get out from the method.
     * @param input Scanner name
     * @return trerue if user willing to continue
     */
    private boolean tipoErrado(Scanner input) {
        boolean soc = true;
        String ver = "";
        System.out.println("--- TIPO PEDIDO ERRADO ---");
        System.out.println("-- Quer sair de este metodo--");
        ver = input.nextLine().toUpperCase();
        if (ver.equals("SIM") || ver.equals("S")) {
            System.out.println("--- METODO CANCELADO ---");
            soc = false;
        }
        return soc;
    }


    /**
     * This function is mainly used to get a hole idea and view about number of merber of the two kinds({@link SocioIndividual}&amp;{@link SocioEmpresario}).<br>
     * And also and idea of the numbers of all the activities of the two kind ({@link AulaDeGrupo} &amp; {@link PersonalTraining}).
     */
    public void resumoAtividades(){
        int Ind=0,Emp=0,AG=0,PT=0;
        for  (Socio socio: socios) {
            if(socio.getTipoSocio().equals("SOCIO INDIVIDUAL")) Ind++;
            else if(socio.getTipoSocio().equals("SOCIO EMPRESARIO")) Emp++;
            else continue;
        }

        for (Atividade atividade: atividades) {
            if(atividade.getTipoAtividade().equals("PERSONAL TRAINING")) PT++;
            else if (atividade.getTipoAtividade().equals("AULA DE GRUPO")) Ind++;
            else continue;
        }

        System.out.println("\n--- RESUMO DE ATIVIDADES ---\n");
        System.out.println("No nosso ginasio existem:\nSocios Individuais: "+Ind+
                "\nSocios Empresarios: "+Emp+
                "\nAulas de Grupo: "+AG+
                "\nSessões de Personal Training: "+PT+"\n");
    }

    /**
     * This method asks for the identification number of the member and goes to fetch that member in the list of {@code sociosIndividuais} in case it's an Individual member
     * otherwise it look at the list of {@code sociosEmpresarios}.<br>In Case of the number not existing in either of theses lists it will send a message.<br>
     * If found, it aggregates all associated
     * bookings to compute:
     * <ul>
     *   <li>Total amount spent (sum of discounted final costs)</li>
     *   <li>Total amount saved (difference between base prices and final costs)</li>
     *   <li>Total number of bookings made</li>
     * </ul>
     * Results are printed in a formatted summary including the member's name and ID.
     * @param input Scanner name
     */
    public void valoresSocio(Scanner input) {
        System.out.print("Indica o seu numero identificador : ");
        int numSocio = Integer.parseInt(input.nextLine().trim());

        Socio socioEncontrado = null;
        for (Socio s : socios) {
            if (s.getNumeroSocio() == numSocio) {
                socioEncontrado = s;
                break;
            }
        }

        if (socioEncontrado == null) {
            System.out.println("--- NUMERO DE SOCIO NAO ENCONTRADO ---");
            return;
        }

        double totalGasto = 0.0;
        double totalPoupado = 0.0;
        int contadorMarcacoes = 0;

        for (Marcacao m : marcacoes) {
            if (m.getSocio().getNumeroSocio() == numSocio) {
                totalGasto += m.getCustoFinal();
                totalPoupado += m.getAtividade().getPreco() - m.getCustoFinal();

                contadorMarcacoes++;
            }
        }

        System.out.println("\n=== VALORES DO SÓCIO ===");
        System.out.println("Nome: " + socioEncontrado.getNomePessoa());
        System.out.println("Número: " + numSocio);
        System.out.printf("Total de marcações: %d%n", contadorMarcacoes);
        System.out.printf("Total de gastos: %.2f€%n", totalGasto);
        System.out.printf("Total poupado: %.2f€%n", totalPoupado);
    }
}


