package ListaSiplesmenteEncadeada;


public class Teste {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("A lista está vazia?" + lista.isVazia());
        lista.inserirNoInicio(new No("Maria",1500.00f));
        lista.inserirNoInicio(new No("Padro",200.00f));
        lista.inserirNoFim(new No("Ana",4000.00f));

        lista.imprimir();
    }
}
