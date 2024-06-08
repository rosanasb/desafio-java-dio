import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("curso backend Java");
        curso1.setCargaHoraria(56);
        //System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Backend Java");
        mentoria1.setDescricao("curso backend Java");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Backend Java");
        bootcamp.setDescricao("Backend Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRosana = new Dev();
        devRosana.setNome("Rosana");
        devRosana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devRosana.getConteudosInscritos());
        System.out.println("------------------------------");
        devRosana.progredir();
        System.out.println("Conteudos Inscritos: " + devRosana.getConteudosInscritos());
        System.out.println("------------------------------");
        System.out.println("Conteudos Concluidos: " + devRosana.getConteudosConcluidos());
        System.out.println("XP: " + devRosana.calcularTotalXp());
        System.out.println("------------------------------");

        Dev devLuiza = new Dev();
        devLuiza.setNome("Luiza");
        devLuiza.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devLuiza.getConteudosInscritos());
        System.out.println("------------------------------");
        devLuiza.progredir();
        System.out.println("Conteudos Inscritos: " + devLuiza.getConteudosInscritos());
        System.out.println("------------------------------");
        System.out.println("Conteudos Concluidos: " + devLuiza.getConteudosConcluidos());
        System.out.println("XP: " + devLuiza.calcularTotalXp());

    }
}
