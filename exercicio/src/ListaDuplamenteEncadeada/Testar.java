package ListaDuplamenteEncadeada;

public class Testar {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.imprimir();
        lista.inserirNoInicio(new No(10));
        lista.inserirNoInicio(new No(12));
        lista.inserirNoFim(new No(8));
        lista.inserir(new No(9 ),3);
        lista.inserir(new No(22),12);
        lista.imprimir();
       System.out.println("Removido : "+lista.remover(4).getElemento());
        lista.imprimir();

    }
}
