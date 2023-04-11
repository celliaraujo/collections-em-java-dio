package br.com.dio;
import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.HashMap;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String,Integer> populacaoEstadosNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("Substitua a população do estado RN por : 3.534.165");

        populacaoEstadosNE.put("RN", 3534165);

        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");

        System.out.println("Contem o Estado da Paraíba? " + populacaoEstadosNE.containsKey("PB"));

        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(populacaoEstadosNE);

        System.out.println("Exiba a população do estado PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");

        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadosNE2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");

        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE2);
        System.out.println(populacaoEstadosNE3);

        System.out.printf("Exiba o estado com o menor população e seu respectivo valor \n");
        int menorPopulacao = Collections.min(populacaoEstadosNE.values());
        Set<Map.Entry<String, Integer>> entries = populacaoEstadosNE.entrySet();
        String estadoMenosPopulado = "";
        for (Map.Entry<String, Integer> entry: entries) {
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenosPopulado = entry.getKey();
                System.out.println(estadoMenosPopulado + " - " + menorPopulacao);
            }
        }
        System.out.printf("Exiba o estado com a maior população e o seu respectivo valor \n");
        int maiorPopulacao = Collections.max(populacaoEstadosNE.values());
        String estadoMaisPopulado = "";
        for (Map.Entry<String, Integer> entry: entries) {
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaisPopulado = entry.getKey();
                System.out.println(estadoMaisPopulado + " - " + maiorPopulacao);
            }

        }
        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println("Exiba a média da população deste dicionário de estados: " + soma/populacaoEstadosNE.size());
        System.out.println("Apague o dicionário de estados com as suas respectivas populações estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println("Confira se a lista está vazia: " + populacaoEstadosNE.isEmpty());
    }
}
