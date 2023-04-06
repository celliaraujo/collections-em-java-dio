package br.com.dio.collection.list;

import java.util.*;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioProposto2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda com S ou N \nPerguntas:");
        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Esteve no local do crime?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Mora perto da vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Devia para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.next().toLowerCase());

        System.out.println(respostas);

        int sim = 0;
        for (String resposta: respostas
             ) {
            if(resposta.equals("s")) {
                sim++;
            }
        }
        System.out.println("Quantidade de sim: " + sim);
//      *--- Alternativa prof Camila ---*
//        int count = 0;
//        Iterator<String> contador = respostas.iterator();
//        while(contador.hasNext()){
//            String resp = contador.next();
//            if(resp.contains("s")) {
//                count ++;
//            }
//        }
//       *------------------------------*

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
