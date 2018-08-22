package ListaSimplesmenteEncadeada;

public class TestarLista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.imprimir();

        lista.incerirNoInicio(new No(45));
        lista.incerirNoInicio(new No(30));
        lista.incerirNoFim(new No(40));
        lista.incerirNoInicio(new No(28));
        lista.incerirNoFim(new No(55));

        lista.incerir(new No(33),3);
       // System.out.println("Removido"+lista.remover(new No(30).getElemento()));

        lista.imprimir();
    }
}
