package br.com.dio.collection.list;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        List<Integer> temperaturas = new ArrayList<>();

        temperaturas.add(28);
        temperaturas.add(26);
        temperaturas.add(32);
        temperaturas.add(24);
        temperaturas.add(36);
        temperaturas.add(22);

        Iterator<Integer> iterator = temperaturas.iterator();
        int soma = 0;
        while(iterator.hasNext()){
            int next = iterator.next();
            soma += next;
        }

        int mediaSemestral = soma/temperaturas.size();

        System.out.println("Temperatura média semestral: " + mediaSemestral + "ºC.");
        Iterator<Integer> iterator2 = temperaturas.iterator();
        int mes = 1;

        System.out.println("Meses com temperatura acima da média: ");
        while(iterator2.hasNext()){
            int next = iterator2.next();
            if(next > mediaSemestral){
                switch (mes){
                    case 1:
                        System.out.println("1 - Janeiro: " + next + "ºC.");
                        break;
                    case 2:
                        System.out.println("2 - Fevereiro: " + next + "ºC.");
                        break;
                    case 3:
                        System.out.println("3 - Março: " + next + "ºC.");
                        break;
                    case 4:
                        System.out.println("4 - Abril: " + next + "ºC.");
                        break;
                    case 5:
                        System.out.println("5 - Maio: " + next + "ºC.");
                        break;
                    case 6:
                        System.out.println("6 - Junho: " + next + "ºC.");
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            mes++;
        }

    }

}
