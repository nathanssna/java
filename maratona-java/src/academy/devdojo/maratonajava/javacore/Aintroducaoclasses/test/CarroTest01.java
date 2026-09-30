package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Mercerdes Benz";
        carro01.modelo = "Classe A";
        carro01.ano = 2023;

        carro02.nome = "Audi";
        carro02.modelo = "Rs7";
        carro02.ano = 2025;

        System.out.println("\nLista de Carros");
        System.out.println("Nome: " + carro01.nome);
        System.out.println("Modelo: " + carro01.modelo);
        System.out.println("Ano: " + carro01.ano);

        System.out.println("\nNome: " + carro02.nome);
        System.out.println("Modelo: " + carro02.modelo);
        System.out.println("Ano: " + carro02.ano);
    }
}
