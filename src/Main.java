import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//instanciar Curso - para instanciar de fato o Curso tem q usar o new
//set - definir  get - ficar/tomar
//LocalDate.now - informa a data de hoje
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //Polimorfismo - tudo que tem em Conteudo tem em Curso, mas nem tudo que tem em Curso tem em Conteudo, pode instanciar de diversa forma.
        //Conteudo conteudo = new Curso();  --  realizado dessa forma por que Conteudo é uma classe abstrata

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alex:" + devAlex.getConteudosInscritos());

        devAlex.progredir();
        devAlex.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alex:" + devAlex.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alex:" + devAlex.getConteudosConcluidos());
        System.out.println("XP:" + devAlex.calcularTotalXp());

        System.out.println("-----------");

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());

        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos André:" + devAndre.getConteudosConcluidos());
        System.out.println("XP:" + devAndre.calcularTotalXp());


    }
}
