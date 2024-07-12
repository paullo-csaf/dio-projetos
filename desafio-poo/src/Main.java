import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python");
        curso2.setCargaHoraria(8);

        // ======================================================================================================== //

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();

        mentoria2.setTitulo("Mentoria de Python");
        mentoria2.setDescricao("Descrição mentoria Pyhton");
        mentoria2.setData(LocalDate.now());

        // ======================================================================================================== //

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        // ======================================================================================================== //
        
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);
        //System.out.println(mentoria2);

        // ======================================================================================================== //

        BootCamp bootcamp1 = new BootCamp();
        bootcamp1.setNome("Bootcamp Pyhton e Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Python e Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);

        // ======================================================================================================== //

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.increverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Paulo: " + devPaulo.getConteudosInscritos());

        devPaulo.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos concluídos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP: " + devPaulo.calcularTotalXP());

        System.out.println("------");

         // ======================================================================================================== //

        Dev devBiggie = new Dev();
        devBiggie.setNome("Biggie");
        devBiggie.increverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Biggie: " + devBiggie.getConteudosInscritos());

        devBiggie.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos Biggie: " + devBiggie.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos concluídos Biggie: " + devBiggie.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP: " + devBiggie.calcularTotalXP());

        System.out.println("------");

        // ======================================================================================================== //
    }
}
