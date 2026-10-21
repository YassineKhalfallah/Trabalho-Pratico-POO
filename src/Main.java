import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();
        gym.menu(input , gym);

        //gym.addPessoa(input);
        String[] formacoes1 = {"Engenharia", "Mestrado", "Doutorado"};
        Instrutor instrutor1 = new Instrutor("Yassine","M", formacoes1);
        gym.instrutores.add(instrutor1);
        gym.listaInstrutores();
        gym.listarSocios(input);
        gym.listarAtividades(input);
        Hora tmp = new Hora(12,00);
        Data dat1 = new Data(12,12,2034);
        PersonalTraining Pt1 = new PersonalTraining("Iniciacao", 90,tmp,dat1);
        System.out.println(Pt1.toString());
        input.close();
    }
}
