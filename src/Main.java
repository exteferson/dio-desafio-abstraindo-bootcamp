import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java Beginners");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso DevOps");
        curso2.setDescricao("Descrição do Curso Cloud DevOps Experience");
        curso2.setCargaHoraria(4);

        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java Begginers");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Beginners");
        bootcamp.setDescricao("Descrição do Bootcamp Potência Tech Powered by iFood  Java beginners.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEsteferson = new Dev();
        devEsteferson.setNome("Esteferson Quadros");
        devEsteferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Esteferson: " + devEsteferson.getConteudosInscritos());
        devEsteferson.progredir();
        devEsteferson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Esteferson: " + devEsteferson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Esteferson: " + devEsteferson.getConteudosConcluidos());
        System.out.println("XP: " + devEsteferson.calcularTotalXp());
        
        System.out.println("------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João Vitor");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João Vitor: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João Vitor: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João Vitor: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
