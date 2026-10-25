import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();
        //gym.addPessoa(input);
        gym.resumoAtividades();
        for (int i = 0 ; i<5 ;i++) {
            gym.menu(input, gym);
        }
        gym.resumoAtividades();
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
        // when the object is created at the main class we should introduce to the lis
        gym.personalTraining.add(Pt1);
        gym.resumoAtividades();
        input.close();
    }
}
