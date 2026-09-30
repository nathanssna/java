package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class SalaDeAulaTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        Professor professor01 = new Professor();
        Professor professor02 = new Professor();

        estudante01.nome = "Nathan";
        estudante01.idade = 19;
        estudante01.curso = "Engenharia de Software";
        estudante01.sexo = 'M';

        estudante02.nome = "Isabele";
        estudante02.idade = 19;
        estudante02.curso = "Fisioterapia";
        estudante02.sexo = 'F';

        professor01.nome = "José";
        professor01.curso = "Engenharia de Software";
        professor01.idade = 34;
        professor01.sexo = 'M';

        professor02.nome = "Maria";
        professor02.curso = "Fisioterapia";
        professor02.idade = 28;
        professor02.sexo = 'F';

        System.out.println("\nCurso de Engenharia de Software");
        System.out.println("\nProfesores:");
        System.out.println(professor01.nome);
        System.out.println(professor01.idade);
        System.out.println(professor01.sexo);
        System.out.println("\nAlunos:");
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("------------------------------");
        System.out.println("\nCurso de Fisioterapia");
        System.out.println("\nProfesores:");
        System.out.println(professor02.nome);
        System.out.println(professor02.idade);
        System.out.println(professor02.sexo);
        System.out.println("\nAlunos:");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
        System.out.println("------------------------------");
    }
}
