import java.util.Scanner;
import java.util.ArrayList;

public class Marcacao {
    /**
     * I set {@code marcacoesDeAulasGrupo} as private because it's in the last subclass
     */
    private ArrayList<AulasDeGrupo> aulasDeGrupo;
    private ArrayList<PersonalTraining> personalTraining;
    private ArrayList<SocioEmpresario> socioEmpresario;
    private ArrayList<SocioIndividual> socioIndividual;
    public Marcacao() {}
    public Marcacao(ArrayList<AulasDeGrupo> aulasDeGrupo,ArrayList<PersonalTraining> personalTraining,ArrayList<SocioEmpresario>socioEmpresario,ArrayList<SocioIndividual> socioIndividual) {
        this.aulasDeGrupo = aulasDeGrupo;
        this.personalTraining = personalTraining;
        this.socioEmpresario = socioEmpresario;
        this.socioIndividual = socioIndividual;
    }

    public void marcarAtividade(Scanner input) {
        String tipoAula, tipoSocio;
        boolean valid = true;
        System.out.println("--Indica se es um Socio Individual ou Empresarial--");
        tipoSocio = input.nextLine();
        tipoSocio = tipoSocio.toUpperCase();
        while (valid) {
            if (tipoSocio.equals("INDIVIDUAL")) {
                //Pedir o numero de socio
                int numID = pedirIdNumInd(input);

                boolean vld = true;
                while (vld) {
                    System.out.println("--- Que tipo de Atividades quer marcar ---");
                    tipoAula = input.nextLine();
                    tipoAula = tipoAula.toUpperCase();
                    if (tipoAula.equals("AULAS DE GRUPO")) {
                        // listar aulas de grupo
                        System.out.println("Aulas de grupo disponiveis :");
                        for (AulasDeGrupo aulaG : aulasDeGrupo) {
                            System.out.println(aulaG.toString());
                        }

                    }


                }
                valid = false;
            }
            else if(tipoSocio.equals("EMPRESARIO")){}
            else System.out.println("--- TIPO DE SOCIO INVALIDO ---");
        }
    }

    /**
     * Makes sure that the Id number given exists in the list of Individual members
     * @param numID
     * @return true if number exists in the list of Individual members
     */
    public boolean doesIdExistInd(int numID) {
        for (SocioIndividual sociosInd : socioIndividual) {
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
        for (SocioEmpresario sociosEmp : socioEmpresario) {
            if(sociosEmp.numeroSocio == numID){
                return true;
            }
        }
        return false;
    }

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
}

