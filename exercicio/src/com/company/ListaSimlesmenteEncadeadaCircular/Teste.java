package com.company.ListaSimlesmenteEncadeadaCircular;

public class Teste {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirNoInicio(new No(22));
        lista.inserirNoInicio(new No(12));
        lista.inserirNoInicio(new No(44));
        lista.inserirNoInicio(new No(54));
        lista.inserirNoFim(new No(55));
        lista.imprimir();
    }
}
