package br.com.dio;
import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList(
                "Amarelo", "Verde", "Vermelho", "Azul", "Violeta", "Laranja", "Anil"));

        System.out.println("Exiba as cores uma abaixo da outra:");
        for (String cor: coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("Exiba a quantidade de cores que o arco-íris tem:");
        System.out.println(coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética:");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa que foram informadas:");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("Amarelo", "Verde", "Vermelho", "Azul", "Violeta", "Laranja", "Anil"  ));
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.toLowerCase().startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().toLowerCase().startsWith("v"))
                iterator.remove();
        }

        System.out.println(coresArcoIris.toString());

        System.out.println("Limpe o conjunto: ");

        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());


        }
}


