package br.com.dio.collection.list;

import java.util.Scanner;

public class Exercicio2DicaForum {
    public static void main(String[] args) {
        int sim = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda com S ou N \nPerguntas:");
        System.out.println("Telefonou para a vítima?");
        sim += (scan.next().toLowerCase().equals("s") ? 1 : 0);

        System.out.println("Esteve no local do crime?");
        sim += (scan.next().toLowerCase().equals("s") ? 1 : 0);

        System.out.println("Mora perto da vítima?");
        sim += (scan.next().toLowerCase().equals("s") ? 1 : 0);

        System.out.println("Devia para a vítima?");
        sim += (scan.next().toLowerCase().equals("s") ? 1 : 0);

        System.out.println("Já trabalhou com a vítima?");
        sim += (scan.next().toLowerCase().equals("s") ? 1 : 0);

        System.out.println("Quantidade de sim: " + sim);

        switch(sim){
            case 1:
                System.out.println("Inocente.");
                break;
            case 2:
                System.out.println("Suspeito.");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice.");
                break;
            case 5:
                System.out.println("Assassino.");
                break;
            default:
                System.out.println("Não foi possível avaliar.");
        }
    }
}
