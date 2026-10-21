import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();

        //addPessoa(instrutores,sociosIndividuais,socioEmpresario);
        String[] formacoes1 = {"Engenharia", "Mestrado", "Doutorado"};
        Instrutor instrutor1 = new Instrutor("Yassine","M", formacoes1);
        gym.instrutores.add(instrutor1);
        gym.listaInstrutores();
        gym.listarSocios();
        gym.listarAtividades();
        Hora tmp = new Hora(12,12);
        Data dat1 = new Data(12,12,34);
        PersonalTraining Pt1 = new PersonalTraining("Iniciacao", 90,tmp,dat1);
        System.out.println(Pt1.toString());
        input.close();
    }

}
