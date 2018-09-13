package Pilhaencadeada;

public class TestarPilha {
    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        System.out.println("A pilha esta vazia?" + pilha);
        pilha.empilhar(new No(1));
        pilha.empilhar(new No(2));
        pilha.empilhar(new No(3));
        pilha.empilhar(new No(4));
        pilha.empilhar(new No(5));
        pilha.empilhar(new No(6));

        System.out.println("Tamanho :" +pilha.tamanho());
        System.out.println(pilha.desempilhar().getElemento());
        System.out.println(pilha.desempilhar().getElemento());
        System.out.println(pilha.desempilhar().getElemento());
        System.out.println(pilha.desempilhar().getElemento());
        System.out.println(pilha.desempilhar().getElemento());
        System.out.println(pilha.desempilhar().getElemento());
        System.out.println("Tamanho : " + pilha.tamanho());



    }
}
