import java.util.Scanner;

public class Main {
    /**
     *Here is where the code runs
     * @param args args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();

        // Adicionar Instutor
        String[] formacoes1 = {"Engenharia", "Mestrado", "Doutorado"};
        Instrutor instrutor1 = new Instrutor("Yassine","M", formacoes1);
        gym.instrutores.add(instrutor1);
        // Adicionar Socios
        //1)
        SocioIndividual soInd1 = new SocioIndividual(19,"Andre Fonseca",135642,"andre@gmail.com",0);
        gym.socios.add(soInd1);
        //2)
        SocioIndividual soInd2 = new SocioIndividual(17,"Guilherme Sal",123456,"sal@gmail.com",10);
        gym.socios.add(soInd2);
        //3)
        SocioIndividual soInd3 = new SocioIndividual(67,"Ines Mendes",654321,"ines@gmail.com",15);
        gym.socios.add(soInd3);
        //4)
        SocioEmpresario soEmp4 = new SocioEmpresario("EasyJet",748201639,"Yassine Khalfallah",909909,"yassine@gmail.com");
        gym.socios.add(soEmp4);
        //5)
        SocioEmpresario soEmp5 = new SocioEmpresario("SMTUC",374198507,"Francisco Chumbo",654123,"chumbo@gmail.com");
        gym.socios.add(soEmp5);
        //6)
        SocioEmpresario soEmp6 = new SocioEmpresario("C&A",482739156,"Francisca Oliveira",234561,"francisca@gmail.com");
        gym.socios.add(soEmp6);

        //Adicionar atividades
        //1)
        Hora tmp1 = new Hora(12,00);
        Data dat1 = new Data(12,12,2034);
        PersonalTraining Pt1 = new PersonalTraining("Iniciacao", 18.0,tmp1,dat1);
        System.out.println(Pt1);
        gym.atividades.add(Pt1);
        //2)
        Hora tmp2 = new Hora(13,30);
        Data dat2 = new Data(10,6,2026);
        PersonalTraining Pt2 = new PersonalTraining("Intermedio", 22.0,tmp2,dat2);
        System.out.println(Pt2);
        gym.atividades.add(Pt2);
        //3)
        Hora tmp3 = new Hora(14,50);
        Data dat3 = new Data(16,1,2028);
        PersonalTraining Pt3 = new PersonalTraining("Avancado", 28.0,tmp3,dat3);
        System.out.println(Pt3);
        gym.atividades.add(Pt3);
        //4)
        Hora tmp4 = new Hora(1,00);
        Data dat4 = new Data(29,2,2030);
        AulaDeGrupo AG4 = new AulaDeGrupo("CrossFit",dat4,12,tmp4,6);
        System.out.println(AG4);
        gym.atividades.add(AG4);
        //5)
        Hora tmp5 = new Hora(8,55);
        Data dat5 = new Data(30,9,2027);
        AulaDeGrupo AG5 = new AulaDeGrupo("Zumba",dat5,8.5,tmp5,15);
        System.out.println(AG5);
        gym.atividades.add(AG5);
        //6)
        Hora tmp6 = new Hora(4,00);
        Data dat6 = new Data(10,4,2031);
        AulaDeGrupo AG6 = new AulaDeGrupo("Spinning",dat6,9,tmp6,12);
        System.out.println(AG6);
        gym.atividades.add(AG6);
        //7)
        Hora tmp7 = new Hora(23,00);
        Data dat7 = new Data(12,12,2034);
        AulaDeGrupo AG7 = new AulaDeGrupo("Yoga",dat7,8,tmp7,8);
        System.out.println(AG7);
        gym.atividades.add(AG7);
        //8)
        Hora tmp8 = new Hora(7,30);
        Data dat8 = new Data(25,10,2026);
        AulaDeGrupo AG8 = new AulaDeGrupo("Yoga",dat8,8,tmp8,10);
        System.out.println(AG8);
        gym.atividades.add(AG8);
        //marcacoes

        //1)
        Marcacao mAgInd1 = new Marcacao(dat1,tmp2,AG7.getPreco()-(AG7.getPreco()*(soInd1.getDesconto()/100)),soInd1,AG7);
        gym.marcacoes.add(mAgInd1);
        //2)
        Marcacao mAgEmp2 = new Marcacao(dat1,tmp2,AG6.getPreco()-(AG6.getPreco()*(soEmp4.getDesconto()/100)),soEmp4,AG6);
        gym.marcacoes.add(mAgEmp2);
        //3)
        Marcacao mAgInd3 = new Marcacao(dat1,tmp2,Pt1.getPreco()-(Pt1.getPreco()*(soInd2.getDesconto()/100)),soInd2,AG7);
        gym.marcacoes.add(mAgInd3);
        //4)
        Marcacao mPtEmp4 = new Marcacao(dat1,tmp2,Pt3.getPreco()-(Pt3.getPreco()*(soEmp4.getDesconto()/100)),soEmp4,Pt3);
        gym.marcacoes.add(mPtEmp4);
        //5)
        Marcacao mPtEmp5 = new Marcacao(dat1,tmp2,Pt2.getPreco()-(Pt2.getPreco()*(soEmp6.getDesconto()/100)),soEmp6,Pt2);
        gym.marcacoes.add(mPtEmp5);
        //6)
        Marcacao mPtInd6 = new Marcacao(dat1,tmp2,AG8.getPreco()-(AG8.getPreco()*(soInd3.getDesconto()/100)),soInd3,AG8);
        gym.marcacoes.add(mPtInd6);

        //Meter o codigo a rodar para sempre
        while (true) {
            gym.menu(input);
        }
    }
}
