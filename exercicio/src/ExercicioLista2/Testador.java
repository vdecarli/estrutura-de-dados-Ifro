package ExercicioLista2;

public class Testador {
    public static void main(String[] args) {
        exe1 lista = new exe1();

        for (int i = 0; i < 10; i++) {
            lista.inserir(new No(i), i);
        }

        //Exercicio 1
        System.out.println("Exercicio 1");
        System.out.println(lista.contarNumPares());

        //Exercício 2
        System.out.println("Exercicio 2");
        System.out.println(lista.listarItensPares().toString());

        //Exercício 3
        System.out.println("Exercicio 3");
        System.out.println(lista.calcularMedia());

        //Exercício 4
        System.out.println("Exercicio 4");
        System.out.println(lista.inserirDuploValorEncadeado(new No(1), new No(2), new exe1()).toString());

        //Exercício 5
        System.out.println("Exercicio 5");
        System.out.println(lista.toStringInverso());

        //Exercício 6
        System.out.println("Exercicio 6");
        System.out.println(lista.removerPrimeiros(3));
        System.out.println(lista.toString());

        //Exercício 7
        System.out.println("Exercicio 7");
        No no = new No();
        System.out.println(lista.obterMaiorDaLista(no));
        System.out.println(no);

        //Exercício 8
        // System.out.println("Exercicio 8");
        // System.out.println(lista.obterMaiorDaLista(node));
        // System.out.println(node);

        // Exercício 9
        System.out.println("Exercício 9");
        System.out.println(lista.trocarElementos(0, 1));
        System.out.println(lista.toString());

        // Exercício 11
        System.out.println("Exercício 11");
        exe1 novaLista = lista.clonarLista();
        System.out.println(novaLista.toString());

        //Exercício 12
        System.out.println("Exercício 12");
        exe1 novaListaLimpa = lista.clonarListaLimpa();
        System.out.println(novaListaLimpa);

        //Exercício 13
        System.out.println("Exercício 13");
        NumberList novaListaInversa = lista.clonarListaInversa();
        System.out.println(novaListaInversa);

        //Exercício 15
        System.out.println("Exercício 15");
        System.out.println(lista.listarItensTotalizados());

    }

}
