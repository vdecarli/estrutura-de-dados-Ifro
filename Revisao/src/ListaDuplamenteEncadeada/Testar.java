package ListaDuplamenteEncadeada;

public class Testar {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirNoInicio(new No("Maria",2800.f));
        lista.inserirNoInicio(new No("João",1850.00f));
        lista.inserirNoFim(new No("Tereza",2500.00f));
        lista.inserirNoFim(new No("Joana",1800.00f));
        lista.imprimir();

    }
}
